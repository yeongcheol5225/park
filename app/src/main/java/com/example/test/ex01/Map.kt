package com.example.test.ex01

fun main() {
    var map = mapOf<String, String>(Pair("one", "hello"), "two" to "world")
    println(
        """
            map size : ${map.size}
            map data : ${map.get("one")}, ${map.get("two")}
        """

    )
}