package com.example.test.ex01

fun main() {
    var list = listOf<Int>(10, 20, 30)
    println(
        """
    list size : ${list.size}
    list data : ${list[0]}, ${list.get(1)}, ${list.get(2)}
        """
    )
}