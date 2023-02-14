package com.example.test.ex01

fun main(args: Array<String>) {
    normalVarargs(1, 2, 3, 4)
    normalVarargs(4, 5, 6)
}

fun normalVarargs(vararg counts: Int) {
    for (num in counts) {
        println("$num")
    }
    print("\n")
}