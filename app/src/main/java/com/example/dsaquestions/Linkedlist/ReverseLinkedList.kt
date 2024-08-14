package com.example.dsaquestions.Linkedlist

import java.util.Stack


class ListNode(var `val`: Int) {
    var next: ListNode1? = null
}

// Helper function to print the list
fun printList(head: ListNode1?): String {
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
    val head = ListNode1(1)
    head.next = ListNode1(2)
    head.next?.next = ListNode1(3)
    head.next?.next?.next = ListNode1(4)
    head.next?.next?.next?.next = ListNode1(5)

    // Printing the original list
    println("Original List: ${printList(head)}")

    // Reversing the linked list

    // val reversedHead =reverseList(head)
    val reversedHeadUsingStack = reverseUsingStack(head)


    // Printing the reversed list
    //  println("Reversed List: ${printList(reversedHead)}")
    println("Reversed List Using Stack: ${printList(reversedHeadUsingStack)}")


}


fun reverseList(head: ListNode1?): ListNode1? {
    var current = head
    var pre: ListNode1? = null
    var next: ListNode1? = null

    while (current != null) {
        next = current.next
        current.next = pre
        pre = current
        current = next

    }
    return pre

}

fun reverseUsingStack(head: ListNode1?): ListNode1? {
    var current = head
    var stack = Stack<Int>()
    while (current != null) {
        stack.push(current.`val`)
        current = current.next
    }

    val newReversedList = ListNode1(Int.MIN_VALUE)
    var currentPre = newReversedList
    while (stack.isNotEmpty()) {
        currentPre.next = ListNode1(stack.pop())
        currentPre = currentPre.next!!
    }
    return newReversedList.next
}
