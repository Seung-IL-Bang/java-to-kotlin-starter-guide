package com.lannstark.lec02

fun main() {
    val person = Person(null)
    startsWith(person.name)
}

fun startsWith(str: String): Boolean {
    return str.startsWith("abc")
}

fun startsWithA(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("str must not be null")
}

fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startsWithA4(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}