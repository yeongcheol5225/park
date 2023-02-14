package com.example.test.ex01

fun main() {
    print("Enter the score: 50.5")
    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    if (score >= 90.0) {
        grade = 'A'
    } else if(score >= 80.0 && score <= 89.9) {
        grade = 'B'
    } else if (score >=70.0 && score <= 79.9) {
        grade = 'C'
    }

    println("Score: $score, Grade: $grade")
}