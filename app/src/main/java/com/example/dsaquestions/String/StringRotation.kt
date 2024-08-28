package com.example.dsaquestions.String

fun isRotation(str1: String, str2: String): Boolean {
    // Check if strings have the same length and are not empty
    if (str1.length != str2.length || str1.isEmpty()) {
        return false
    }

    // Concatenate str1 with itself
    val concatenated = str1 + str1

    // Check if str2 is a substring of the concatenated string
    return concatenated.contains(str2)
}

// Example usage
fun main() {
    val str1 = "waterbottle"
    val str2 = "erbottlewat"

    if (isRotation(str1, str2)) {
        println("\"$str2\" is a rotation of \"$str1\"")
    } else {
        println("\"$str2\" is not a rotation of \"$str1\"")
    }
}
