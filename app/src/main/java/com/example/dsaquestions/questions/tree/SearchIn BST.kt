package com.example.dsaquestions.questions.tree

import com.example.dsaquestions.questions.tree.treeUtils.HardcodedTree.Companion.createHardcodedTree
import com.example.dsaquestions.questions.tree.treeUtils.TreePrinter.Companion.printTree

fun searchRec(node: com.example.dsaquestions.questions.tree.treeUtils.TreeNode?, value: Int): com.example.dsaquestions.questions.tree.treeUtils.TreeNode? {
    if (node == null || node.`val` == value) {
        return node // Either found the node or reached a leaf (null)
    }

    return if (value < node.`val`) {
        searchRec(
            node.left,
            value
        ) // Search in the left subtree
    } else {
        searchRec(
            node.right,
            value
        ) // Search in the right subtree
    }
}

fun main() {
    // Create a hardcoded tree
    val root = createHardcodedTree()

    // Print the tree
    println("Printing the hardcoded BST:")
   printTree(root)

    // Optionally, insert a new value into the tree
    val newRoot =searchRec(root, 30)

    // Print the tree after insertion
    println("\nPrinting the search node: ${newRoot!!.`val`}")
   printTree(newRoot)
}
