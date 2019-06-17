package com.turalllb.ocp.itemDetailsView

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.turalllb.ocp.R
import com.turalllb.ocp.entity.Move
import kotlinx.android.synthetic.main.move_screen.*

class MoveScreen : AppCompatActivity() {
    companion object {
        const val MOVE = "move"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.move_screen)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        val toPlaceTv = findViewById<TextView>(R.id.toPlace_tv)
        val move = intent.getSerializableExtra(MOVE) as Move
        toPlaceTv.text = move.toPlace

        val fromPlaceTv = findViewById<TextView>(R.id.fromPlace_tv)
        fromPlaceTv.text = move.fromPlace
    }


}
