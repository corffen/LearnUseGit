package com.study.pattern.factory

class SampleFactory {
    fun getShape(name: String): Shape? {
        if (name == "circle") {
            return CircleShape()
        }
        return null
    }
}