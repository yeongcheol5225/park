package com.example.test.ex01

fun main() {
    var data = 10
    val result = when {
        data <= 0 -> "data is <= 0"
        data > 100 -> "data is > 100"
        else -> "data is valid"
    }
    println(result)
}