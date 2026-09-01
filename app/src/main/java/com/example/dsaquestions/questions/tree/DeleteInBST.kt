package com.example.dsaquestions.questions.tree

import com.example.dsaquestions.questions.tree.treeUtils.HardcodedTree.Companion.createHardcodedTree
import com.example.dsaquestions.questions.tree.treeUtils.TreePrinter.Companion.printTree

fun deleteNode(root: com.example.dsaquestions.questions.tree.treeUtils.TreeNode?, key: Int): com.example.dsaquestions.questions.tree.treeUtils.TreeNode? {
    // Base case: empty tree or value not found
    if (root == null) {
        return null
    }

    // If key to be searched is in a subtree
    if (key < root.`val` ) {
        root.left =
            deleteNode(root.left, key)
    } else if (key > root.`val`) {
        root.right =
            deleteNode(root.right, key)
    } else {
        // If root matches with the given key

        // Cases when root has 0 children or
        // only right child

        if (root.left == null && root.right == null) {
            return null
        }

        // Case 2: Node has only one child
        if (root.left == null) {
            return root.right
        }
        if (root.right == null) {
            return root.left
        }

        // Case 3: Node has two children
        // Get the in-order successor (smallest in the right subtree)
        val minValueNode =
            getLeftMostElement(root.right!!)
        root.`val` = minValueNode!!.`val`
        root.right = deleteNode(
            root.right,
            minValueNode.`val`!!
        )
    }


    return root
}

fun getLeftMostElement(root: com.example.dsaquestions.questions.tree.treeUtils.TreeNode): com.example.dsaquestions.questions.tree.treeUtils.TreeNode?{
    var current = root
    while (current?.left != null) {
        current = current.left!!
    }
    return current!!
}

fun main() {

    // Create a hardcoded tree
    val root = createHardcodedTree()

    // Print the tree
    println("Printing the hardcoded BST:")
    printTree(root)

    // Optionally, insert a new value into the tree
    val newRoot = deleteNode(root, 30)

    // Print the tree after insertion
    println("\nPrinting the BST after insertion:")
    printTree(newRoot)
}