package com.example.test.ex01

fun main() {
    var sum: Int = 0

   for (i in 1..10 step 2) {
       sum += i
   }
    println(sum)
}