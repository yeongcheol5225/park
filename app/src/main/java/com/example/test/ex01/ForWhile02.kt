package com.example.test.ex01

fun main() {
    var sum: Int = 0

    for (i in 2..10 step 2) {
        sum += i
    }
    println(sum)
}