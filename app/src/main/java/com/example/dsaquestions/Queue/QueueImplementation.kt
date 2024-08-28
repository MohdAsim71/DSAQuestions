package com.example.dsaquestions.Queue

class QueueNode<T>(var data: T) {
    var next: QueueNode<T>? = null
}

class Queue<T> {
    private var front: QueueNode<T>? = null
    private var rear: QueueNode<T>? = null

    // Enqueue an element into the queue
    fun enqueue(data: T) {
        val newNode = QueueNode(data)
        if (rear == null) {
            front = newNode
            rear = newNode
        } else {
            rear?.next = newNode
            rear = newNode
        }
    }

    // Dequeue an element from the queue
    fun dequeue(): T? {
        if (front == null) {
            println("Queue is empty")
            return null
        }
        val dequeuedData = front?.data
        front = front?.next
        if (front == null) {
            rear = null
        }
        return dequeuedData
    }

    // Peek at the front element of the queue
    fun peek(): T? {
        return front?.data
    }

    // Check if the queue is empty
    fun isEmpty(): Boolean {
        return front == null
    }

    // Get the size of the queue
    fun size(): Int {
        var count = 0
        var current = front
        while (current != null) {
            count++
            current = current.next
        }
        return count
    }
}

// Example usage
fun main() {
    val queue = Queue<Int>()

    queue.enqueue(10)
    queue.enqueue(20)
    queue.enqueue(30)

    println("Front element is: ${queue.peek()}")  // Output: Front element is: 10

    println("Queue size is: ${queue.size()}")     // Output: Queue size is: 3

    println("Dequeued element is: ${queue.dequeue()}") // Output: Dequeued element is: 10

    println("Front element after dequeue is: ${queue.peek()}") // Output: Front element after dequeue is: 20
}
