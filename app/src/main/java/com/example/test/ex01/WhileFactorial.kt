package com.example.test.ex01

fun main() {
    print("Enter the number: ")
    var number = readLine()!!.toInt()
    var factorial: Long = 1

    while (number > 0) {
        factorial *= number
        --number

    }

    println("Factorial: $factorial")
}