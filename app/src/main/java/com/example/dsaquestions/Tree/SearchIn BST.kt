package com.example.dsaquestions.Tree

import com.example.dsaquestions.Tree.TreeUtils.HardcodedTree
import com.example.dsaquestions.Tree.TreeUtils.TreeNode
import com.example.dsaquestions.Tree.TreeUtils.TreePrinter

fun searchRec(node: TreeNode?, value: Int): TreeNode? {
    if (node == null || node.`val` == value) {
        return node // Either found the node or reached a leaf (null)
    }

    return if (value < node.`val`) {
        searchRec(node.left, value) // Search in the left subtree
    } else {
        searchRec(node.right, value) // Search in the right subtree
    }
}

fun main() {
    // Create a hardcoded tree
    val root = HardcodedTree.createHardcodedTree()

    // Print the tree
    println("Printing the hardcoded BST:")
    TreePrinter.printTree(root)

    // Optionally, insert a new value into the tree
    val newRoot = searchRec(root, 30)

    // Print the tree after insertion
    println("\nPrinting the search node: ${newRoot!!.`val`}")
    TreePrinter.printTree(newRoot)
}
