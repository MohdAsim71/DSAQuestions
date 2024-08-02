package com.example.dsaquestions.Linkedlist

fun main() {
    val node1 = ListNode(1)
    val node2 = ListNode(2)
    val node3 = ListNode(3)
    val node4 = ListNode(4)
    val node5 = ListNode(5)

    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5


    val middleNode = middleNode(node1)

    println("Middle Node: ${middleNode}") // Output: Middle Node: 3
}

fun middleNode(node1: ListNode): Any {
    var slow = node1
    var fast = node1
    while (fast.next!=null && fast.next!!.next!=null){
        slow = slow.next!!
        fast = fast.next!!.next!!
    }
    return slow.`val`
}
