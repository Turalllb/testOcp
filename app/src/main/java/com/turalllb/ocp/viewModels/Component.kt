package com.turalllb.ocp.viewModels

import android.content.Context

interface Component {
    var name: String
    var details: String
    fun showDetails(context: Context)
}