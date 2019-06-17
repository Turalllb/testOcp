package com.turalllb.ocp.entity

import com.turalllb.ocp.TimeInterval
import java.io.Serializable

class Move(
    override var name: String,
    override var details: String,
    var fromPlace: String? = null,
    var toPlace: String? = null
) : Component, Serializable {
    var estimateTime: TimeInterval? = null


    override fun accept(v: Visitor) {
        v.visit(this)
    }
}