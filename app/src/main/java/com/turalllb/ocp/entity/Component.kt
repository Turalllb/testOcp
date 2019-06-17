package com.turalllb.ocp.entity

interface Component {
    var name: String
    var details: String
    fun accept(v: Visitor)
}