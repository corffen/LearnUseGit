package com.study.pattern.single

class SingleTonDemo private constructor() {
    companion object {
        val instance = SingleHolder.holder
    }

    private object SingleHolder {
        val holder = SingleTonDemo()
    }
}