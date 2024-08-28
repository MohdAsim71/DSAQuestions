package com.example.dsaquestions.Stack

class Node<T>(var data: T) {
    var next: Node<T>? = null
}

class Stack<T> {
    private var top: Node<T>? = null

    // Push an element onto the stack
    fun push(data: T) {
        val newNode = Node(data)
        newNode.next = top
        top = newNode
    }

    // Pop an element from the stack
    fun pop(): T? {
        if (top == null) {
            println("Stack is empty")
            return null
        }
        val poppedData = top?.data
        top = top?.next
        return poppedData
    }

    // Peek at the top element of the stack
    fun peek(): T? {
        return top?.data
    }

    // Check if the stack is empty
    fun isEmpty(): Boolean {
        return top == null
    }

    // Get the size of the stack
    fun size(): Int {
        var count = 0
        var current = top
        while (current != null) {
            count++
            current = current.next
        }
        return count
    }
}

// Example usage
fun main() {
    val stack = Stack<Int>()

    stack.push(10)
    stack.push(20)
    stack.push(30)

    println("Top element is: ${stack.peek()}")  // Output: Top element is: 30

    println("Stack size is: ${stack.size()}")   // Output: Stack size is: 3

    println("Popped element is: ${stack.pop()}") // Output: Popped element is: 30

    println("Top element after pop is: ${stack.peek()}") // Output: Top element after pop is: 20
}
