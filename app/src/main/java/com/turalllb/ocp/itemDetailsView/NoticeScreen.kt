package com.turalllb.ocp.itemDetailsView

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView
import com.turalllb.ocp.R

import kotlinx.android.synthetic.main.notice_screen.*
import java.util.*

class NoticeScreen : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.notice_screen)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        val flightTv = findViewById<TextView>(R.id.date_tv)
        val str = intent.getSerializableExtra("FLIGHT_DATE") as Date
        flightTv.text = str.toString()

        val gateTv = findViewById<TextView>(R.id.gate_tv)
        gateTv.text = intent.getStringExtra("gate")

    }

}
