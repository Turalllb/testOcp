package com.turalllb.ocp

import android.content.Context
import android.content.Intent
import com.turalllb.ocp.entity.Event
import com.turalllb.ocp.entity.Move
import com.turalllb.ocp.entity.Notice
import com.turalllb.ocp.entity.Visitor
import com.turalllb.ocp.itemDetailsView.EventScreen
import com.turalllb.ocp.itemDetailsView.EventScreen.Companion.EVENT
import com.turalllb.ocp.itemDetailsView.MoveScreen
import com.turalllb.ocp.itemDetailsView.MoveScreen.Companion.MOVE
import com.turalllb.ocp.itemDetailsView.NoticeScreen

class ItemVisitor(private val context: Context) : Visitor {
    override fun visit(event: Event) {
        val intent = Intent(context, EventScreen::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        intent.putExtra(EVENT, event)
        context.startActivity(intent)
    }

    override fun visit(event: Notice) {
        val intent = Intent(context, NoticeScreen::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        intent.putExtra("FLIGHT_DATE", event.flightDate)
        intent.putExtra("gate", event.gate)
        context.startActivity(intent)
    }

    override fun visit(event: Move) {
        val intent = Intent(context, MoveScreen::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        intent.putExtra(MOVE, event)
        context.startActivity(intent)
    }
}