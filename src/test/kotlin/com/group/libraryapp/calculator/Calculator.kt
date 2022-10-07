package com.group.libraryapp.calculator

class Calculator(
    var number: Int
) {

    fun add(opprand: Int) {
        this.number += opprand
    }

    fun minus(opprand: Int) {
        this.number -= opprand
    }

    fun multiply(opprand: Int) {
        this.number *= opprand
    }

    fun divide(opprand: Int) {
        if (opprand == 0) {
            throw IllegalArgumentException("0으로 나눌 수 없습니다")
        }
        this.number /= opprand

    }
}