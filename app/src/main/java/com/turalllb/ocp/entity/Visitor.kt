package com.turalllb.ocp.entity

interface Visitor {
    fun visit(event: Event)
    fun visit(event: Notice)
    fun visit(event: Move)
}