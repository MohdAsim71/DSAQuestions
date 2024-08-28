package com.example.dsaquestions.Linkedlist



class LinkedList {
    private var head: Node? = null

    // Function to add elements to the linked list
    fun append(data: Int) {
        if (head == null) {
            head = Node(data)
        } else {
            var current = head
            while (current?.next != null) {
                current = current.next
            }
            current?.next = Node(data)
        }
    }

    // Function to sort the linked list of 0s, 1s, and 2s
    fun sortList() {
        var count0 = 0
        var count1 = 0
        var count2 = 0

        var current = head
        // Count the number of 0s, 1s, and 2s
        while (current != null) {
            when (current.data) {
                0 -> count0++
                1 -> count1++
                2 -> count2++
            }
            current = current.next
        }

        current = head
        // Update the linked list with sorted values
        while (current != null) {
            when {
                count0 > 0 -> {
                    current.data = 0
                    count0--
                }
                count1 > 0 -> {
                    current.data = 1
                    count1--
                }
                count2 > 0 -> {
                    current.data = 2
                    count2--
                }
            }
            current = current.next
        }
    }

    // Function to print the linked list
    fun printList() {
        var current = head
        while (current != null) {
            print("${current.data} ")
            current = current.next
        }
        println()
    }
}

// Example usage
fun main() {
    val list = LinkedList()
    list.append(1)
    list.append(2)
    list.append(0)
    list.append(1)
    list.append(2)
    list.append(0)
    list.append(1)

    println("Original List:")
    list.printList()

    list.sortList()

    println("Sorted List:")
    list.printList()
}
