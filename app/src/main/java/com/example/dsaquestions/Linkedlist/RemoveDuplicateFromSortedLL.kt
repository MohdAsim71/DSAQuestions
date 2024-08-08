package com.example.dsaquestions.Linkedlist


fun removeDuplicates(head: Node?): Node? {
    var current = head

    while (current?.next != null) {
        if (current.data == current.next?.data) {
            // Skip the next node since it's a duplicate
            current.next = current.next?.next
        } else {
            // Move to the next node if no duplication
            current = current.next
        }
    }

    return head
}

fun printList(head: Node?) {
    var current = head
    while (current != null) {
        print("${current.data} -> ")
        current = current.next
    }
    println("null")
}

fun main() {
    // Example: Create a sorted linked list with duplicates
    val head = Node(1)
    head.next = Node(1)
    head.next?.next = Node(2)
    head.next?.next?.next = Node(3)
    head.next?.next?.next?.next = Node(3)

    println("Original Linked List:")
    printList(head)

    removeDuplicates(head)

    println("Linked List after removing duplicates:")
    printList(head)
}
