package com.example.dsaquestions.Array

class TwoStacks(size: Int) {
    private val arr = IntArray(size)
    private var top1 = -1  // Top of the first stack
    private var top2 = size // Top of the second stack

    // Push an element onto the first stack
    fun push1(data: Int) {
        if (top1 < top2 - 1) {  // Check for available space
            top1++
            arr[top1] = data
        } else {
            println("Stack Overflow for Stack 1")
        }
    }

    // Push an element onto the second stack
    fun push2(data: Int) {
        if (top1 < top2 - 1) {  // Check for available space
            top2--
            arr[top2] = data
        } else {
            println("Stack Overflow for Stack 2")
        }
    }

    // Pop an element from the first stack
    fun pop1(): Int? {
        return if (top1 >= 0) {
            val poppedValue = arr[top1]
            top1--
            poppedValue
        } else {
            println("Stack Underflow for Stack 1")
            null
        }
    }

    // Pop an element from the second stack
    fun pop2(): Int? {
        return if (top2 < arr.size) {
            val poppedValue = arr[top2]
            top2++
            poppedValue
        } else {
            println("Stack Underflow for Stack 2")
            null
        }
    }

    // Peek the top element of the first stack
    fun peek1(): Int? {
        return if (top1 >= 0) {
            arr[top1]
        } else {
            println("Stack 1 is empty")
            null
        }
    }

    // Peek the top element of the second stack
    fun peek2(): Int? {
        return if (top2 < arr.size) {
            arr[top2]
        } else {
            println("Stack 2 is empty")
            null
        }
    }

    // Check if the first stack is empty
    fun isEmpty1(): Boolean {
        return top1 == -1
    }

    // Check if the second stack is empty
    fun isEmpty2(): Boolean {
        return top2 == arr.size
    }
}

// Example usage
fun main() {
    val twoStacks = TwoStacks(10)

    // Push elements to the first stack
    twoStacks.push1(5)
    twoStacks.push1(10)
    twoStacks.push1(15)

    // Push elements to the second stack
    twoStacks.push2(20)
    twoStacks.push2(25)
    twoStacks.push2(30)

    // Pop from the first stack
    println("Popped from Stack 1: ${twoStacks.pop1()}")  // Output: 15

    // Pop from the second stack
    println("Popped from Stack 2: ${twoStacks.pop2()}")  // Output: 30

    // Peek the top element of the first stack
    println("Top of Stack 1: ${twoStacks.peek1()}")  // Output: 10

    // Peek the top element of the second stack
    println("Top of Stack 2: ${twoStacks.peek2()}")  // Output: 25

    // Check if Stack 1 is empty
    println("Is Stack 1 empty? ${twoStacks.isEmpty1()}")  // Output: false

    // Check if Stack 2 is empty
    println("Is Stack 2 empty? ${twoStacks.isEmpty2()}")  // Output: false
}
