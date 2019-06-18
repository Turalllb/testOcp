package com.turalllb.ocp

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.turalllb.ocp.viewModels.Component

class ComponentAdapter(
    private val inflater: LayoutInflater,
    private val list: List<Component>
) : RecyclerView.Adapter<ComponentAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {

        val itemView = inflater.inflate(R.layout.rv_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int = list.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textName.text = list[position].name
        holder.textDetails.text = list[position].details
        holder.itemClickListener = object : ItemClickListener {
            override fun onClick(position: Int) {
                list[position].showDetails(inflater.context)
            }
        }
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        val textName: TextView = itemView.findViewById(R.id.name_tv)
        val textDetails: TextView = itemView.findViewById(R.id.details_tv)
        lateinit var itemClickListener: ItemClickListener

        init {
            itemView.setOnClickListener(this)
        }


        override fun onClick(v: View?) {
            itemClickListener.onClick(adapterPosition)
        }
    }

    interface ItemClickListener {
        fun onClick(position: Int)
    }
}