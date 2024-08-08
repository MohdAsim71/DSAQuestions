package com.example.dsaquestions.Linkedlist


class Node(var data: Int) {
    var next: Node? = null
}

fun hasLoop(head: Node?): Boolean {
    if (head?.next == null) {
        return false
    }

    var slow: Node? = head
    var fast: Node? = head

    while (fast?.next != null) {
        slow = slow?.next
        fast = fast.next?.next

        // Check if slow and fast pointers meet
        if (slow == fast) {
            return true
        }
    }

    return false // No loop detected
}

fun main() {
    // Example: Create a linked list with a loop
    val head = Node(1)
    head.next = Node(2)
    head.next?.next = Node(3)
    head.next?.next?.next = Node(4)
    head.next?.next?.next?.next = Node(5)

    // Create a loop for testing
    head.next?.next?.next?.next?.next = head.next?.next

    if (hasLoop(head)) {
        println("Loop detected in the linked list.")
        if (hasLoop(head)) {
            println("The loop is detected")
        }
    } else {
        println("No loop detected in the linked list.")
    }
}