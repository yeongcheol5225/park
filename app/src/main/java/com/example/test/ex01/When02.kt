package com.example.test.ex01

fun main() {
    print("Enter the score: 50.5")
    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    when(score) {
        in 90.0..100.0 -> grade ='A'
        in 80.0..89.9 -> grade ='B'
        in 70.0..79.9 -> grade ='C'
        !in 70.0..100.0 -> grade ='F'
    }
    println("Score: $score, Grade: $grade")
}