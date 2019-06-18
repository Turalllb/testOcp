package com.turalllb.ocp.entity

import android.content.Context
import android.content.Intent
import com.turalllb.ocp.TimeInterval
import com.turalllb.ocp.itemDetailsView.MoveScreen
import java.io.Serializable

class Move(
    override var name: String,
    override var details: String,
    var fromPlace: String? = null,
    var toPlace: String? = null
) : Component, Serializable {
    var estimateTime: TimeInterval? = null

    override fun showDetails(context: Context) {
        val intent = Intent(context, MoveScreen::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        intent.putExtra(MoveScreen.MOVE, this)
        context.startActivity(intent)
    }
}