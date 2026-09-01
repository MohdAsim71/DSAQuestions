package com.example.dsaquestions.questions.linkedlist



class MergeTwoLLSort {

    // Method to merge two sorted linked lists
    fun sortedMerge(left: com.example.dsaquestions.questions.linkedlist.Node?, right: com.example.dsaquestions.questions.linkedlist.Node?): com.example.dsaquestions.questions.linkedlist.Node? {
        if (left == null) return right
        if (right == null) return left

        val result: com.example.dsaquestions.questions.linkedlist.Node?
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
    fun getMiddle(head: com.example.dsaquestions.questions.linkedlist.Node?): com.example.dsaquestions.questions.linkedlist.Node? {
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
    fun mergeSort(head: com.example.dsaquestions.questions.linkedlist.Node?): com.example.dsaquestions.questions.linkedlist.Node? {
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

    val sortedHead = MergeTwoLLSort()
        .mergeSort(head)

    println("Sorted Linked List:")
    printList(sortedHead)
}

