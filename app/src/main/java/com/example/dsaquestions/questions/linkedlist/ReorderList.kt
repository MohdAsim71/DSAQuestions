package com.example.dsaquestions.questions.linkedlist

class ListNode1(var `val`: Int) {
    var next: ListNode1? = null
}

fun reorderList(head: com.example.dsaquestions.questions.linkedlist.ListNode1?) {
    if (head?.next == null) return

    // Step 1: Find the middle of the list
    var slow: com.example.dsaquestions.questions.linkedlist.ListNode1? = head
    var fast: com.example.dsaquestions.questions.linkedlist.ListNode1? = head
    while (fast?.next != null && fast.next?.next != null) {
        slow = slow?.next
        fast = fast.next?.next
    }

    // Step 2: Reverse the second half of the list
    var secondHalf: com.example.dsaquestions.questions.linkedlist.ListNode1? = slow?.next
    slow?.next = null
    var prev: com.example.dsaquestions.questions.linkedlist.ListNode1? = null
    while (secondHalf != null) {
        val nextNode = secondHalf.next
        secondHalf.next = prev
        prev = secondHalf
        secondHalf = nextNode
    }
    secondHalf = prev

    // Step 3: Merge the two halves
    var firstHalf: com.example.dsaquestions.questions.linkedlist.ListNode1? = head
    while (secondHalf != null) {
        val temp1 = firstHalf?.next
        val temp2 = secondHalf.next

        firstHalf?.next = secondHalf
        secondHalf.next = temp1

        firstHalf = temp1
        secondHalf = temp2
    }
}

// Helper function to print the list
fun printList1(head: com.example.dsaquestions.questions.linkedlist.ListNode1?) {
    var current = head
    while (current != null) {
        print("${current.`val`} ")
        current = current.next
    }
    println()
}

// Example usage:
fun main() {
    // Creating the list: 1 -> 2 -> 3 -> 4
    val head = ListNode1(1)
    head.next = ListNode1(2)
    head.next?.next = ListNode1(3)
    head.next?.next?.next =
        ListNode1(4)

    println("Original list:")
    printList1(head)

    reorderList(head)

    println("Reordered list:")
    printList(head)
}
