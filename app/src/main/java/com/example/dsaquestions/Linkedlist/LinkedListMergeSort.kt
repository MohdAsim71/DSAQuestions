package com.example.dsaquestions.Linkedlist


class LinkedListMergeSort {

    // Method to merge two sorted linked lists
    fun sortedMerge(left: Node?, right: Node?): Node? {
        if (left == null) return right
        if (right == null) return left

        val result: Node?
        if (left.data <= right.data) {
            result = left
            result.next = sortedMerge(left.next, right)
        } else {
            result = right
            result.next = sortedMerge(left, right.next)
        }
        return result
    }

    // Method to split the linked list into two halves
    fun getMiddle(head: Node?): Node? {
        if (head == null || head.next == null) {
            return head
        }

        var slow = head
        var fast = head.next

        while (fast?.next != null) {
            slow = slow?.next
            fast = fast.next?.next
        }

        return slow
    }

    // Method to perform merge sort on a linked list
    fun mergeSort(head: Node?): Node? {
        if (head == null || head.next == null) {
            return head
        }

        // Get the middle of the list
        val middle = getMiddle(head)
        val nextOfMiddle = middle?.next

        // Split the list into two halves
        middle?.next = null

        // Apply merge sort on both halves
        val left = mergeSort(head)
        val right = mergeSort(nextOfMiddle)

        // Merge the sorted halves
        return sortedMerge(left, right)
    }
}



// Example usage
fun main() {
    val head = Node(4)
    head.next = Node(2)
    head.next?.next = Node(1)
    head.next?.next?.next = Node(3)

    println("Unsorted Linked List:")
    printList(head)

    val sortedHead = LinkedListMergeSort().mergeSort(head)

    println("Sorted Linked List:")
    printList(sortedHead)
}
