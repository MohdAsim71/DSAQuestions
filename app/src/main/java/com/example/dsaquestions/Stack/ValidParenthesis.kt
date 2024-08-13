package com.example.dsaquestions.Stack

import java.util.Stack

fun isValid(s: String): Boolean {
    val st = Stack<Char>()
    for (it in s.toCharArray()) {
        if (it == '(' || it == '[' || it == '{') {
            st.push(it)
        } else {
            if (st.isEmpty()) return false
            val ch = st.pop()
            if ((it == ')' && ch != '(' || it == ']' && ch != '[' || it == '}' && ch != '{')) {
                return false
            }
        }
    }
    return st.isEmpty()
}

fun main() {
    val s = "()()[{}()]}"
    if (isValid(s) == true) println("True") else println("False")
}