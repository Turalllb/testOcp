package com.turalllb.ocp.itemDetailsView

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.turalllb.ocp.R
import com.turalllb.ocp.entity.Event
import kotlinx.android.synthetic.main.event_screen.*

class EventScreen : AppCompatActivity() {
    companion object {
        const val EVENT = "event"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.event_screen)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        val event = intent.getSerializableExtra(EVENT) as Event
        val startTimeTv = findViewById<TextView>(R.id.startTime_tv)
        val endTimeTv = findViewById<TextView>(R.id.endTime_tv)
        startTimeTv.text = event.startTime.toString()
        endTimeTv.text = event.endTime.toString()
    }

}
