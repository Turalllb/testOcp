package com.turalllb.ocp.viewModels

import android.content.Context
import android.content.Intent
import com.turalllb.ocp.itemDetailsView.NoticeScreen
import java.util.*

data class Notice(
    override var name: String,
    override var details: String,
    val flightDate: Date? = null,
    val gate: String? = null

) : Component {
    override fun showDetails(context: Context) {
        val intent = Intent(context, NoticeScreen::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        intent.putExtra("FLIGHT_DATE", flightDate)
        intent.putExtra("gate", gate)
        context.startActivity(intent)
    }
}
