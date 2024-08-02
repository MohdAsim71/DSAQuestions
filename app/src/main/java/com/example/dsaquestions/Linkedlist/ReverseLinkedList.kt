package com.example.dsaquestions.Linkedlist

import java.util.Stack


class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

// Helper function to print the list
fun printList(head: ListNode?): String {
    val result = StringBuilder()
    var current = head
    while (current != null) {
        result.append(current.`val`)
        if (current.next != null) {
            result.append(" -> ")
        }
        current = current.next
    }
    return result.toString()
}

fun main() {
    // Creating a linked list 1 -> 2 -> 3 -> 4 -> 5
    val head = ListNode(1)
    head.next = ListNode(2)
    head.next?.next = ListNode(3)
    head.next?.next?.next = ListNode(4)
    head.next?.next?.next?.next = ListNode(5)

    // Printing the original list
    println("Original List: ${printList(head)}")

    // Reversing the linked list

    // val reversedHead =reverseList(head)
    val reversedHeadUsingStack = reverseUsingStack(head)


    // Printing the reversed list
    //  println("Reversed List: ${printList(reversedHead)}")
    println("Reversed List Using Stack: ${printList(reversedHeadUsingStack)}")


}


fun reverseList(head: ListNode?): ListNode? {
    var current = head
    var pre: ListNode? = null
    var next: ListNode? = null

    while (current != null) {
        next = current.next
        current.next = pre
        pre = current
        current = next

    }
    return pre

}

fun reverseUsingStack(head: ListNode?): ListNode? {
    var current = head
    var stack = Stack<Int>()
    while (current != null) {
        stack.push(current.`val`)
        current = current.next
    }

    val newReversedList = ListNode(Int.MIN_VALUE)
    var currentPre = newReversedList
    while (stack.isNotEmpty()) {
        currentPre.next = ListNode(stack.pop())
        currentPre = currentPre.next!!
    }
    return newReversedList.next
}
