package com.turalllb.ocp.entity

import java.io.Serializable
import java.util.*

class Event(
    override var name: String,
    override var details: String
) : Component, Serializable {
    var startTime: Date? = null
    var endTime: Date? = null


    override fun accept(v: Visitor) {
        v.visit(this)
    }
}