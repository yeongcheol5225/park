package com.example.test.ex01

fun main() {
    var data = 10
    val result = if (data > 0) {
        println("data > 0")
        true
    } else {
        println("data <= 0")
        false
    }
    println(result)
}