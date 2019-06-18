package com.turalllb.ocp.entity

import android.content.Context
import android.content.Intent
import com.turalllb.ocp.itemDetailsView.EventScreen
import java.io.Serializable
import java.util.*

class Event(
    override var name: String,
    override var details: String
) : Component, Serializable {
    var startTime: Date? = null
    var endTime: Date? = null


    override fun showDetails(context: Context) {
        val intent = Intent(context, EventScreen::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        intent.putExtra(EventScreen.EVENT, this)
        context.startActivity(intent)
    }
}