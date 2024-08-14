package com.example.dsaquestions.Linkedlist

fun main() {
    val node1 = ListNode1(1)
    val node2 = ListNode1(2)
    val node3 = ListNode1(3)
    val node4 = ListNode1(4)
    val node5 = ListNode1(5)

    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5


    val middleNode = middleNode(node1)

    println("Middle Node: ${middleNode}") // Output: Middle Node: 3
}

fun middleNode(node1: ListNode1): Any {
    var slow = node1
    var fast = node1
    while (fast.next!=null && fast.next!!.next!=null){
        slow = slow.next!!
        fast = fast.next!!.next!!
    }
    return slow.`val`
}
