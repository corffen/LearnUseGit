package com.study.pattern.builder

data class Setting constructor(val title: String, val description: String) {

    private constructor(builder: Builder) : this(builder.title, builder.description)

    class Builder {

        var title: String = ""
        var description: String = ""
//        fun setTitle(title: String) = apply {
//            this.title = title
//        }
//
//        fun setDescription(description: String) = apply {
//            this.description = description
//        }
    }

    companion object {
        fun build(init: Builder.() -> Unit) = Setting(Builder().apply(init))
    }
}

fun main() {
    val setting = Setting.build {
        title = "this is title"
        description = "this is description"
    }
    println(setting)
}