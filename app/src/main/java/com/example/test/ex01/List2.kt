package com.example.test.ex01

fun main() {
    var mutableList = mutableListOf<Int>(10,20,30)
    mutableList.add(3, 40)
    mutableList.set(0, 50)
    println(
        """
    list size : ${mutableList.size}
    list data : ${mutableList[0]}, ${mutableList.get(1)},
             ${mutableList.get(2)}, ${mutableList.get(3)}
        """

    )
}