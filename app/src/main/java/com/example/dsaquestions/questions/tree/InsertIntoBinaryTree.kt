package com.example.dsaquestions.questions.tree
import com.example.dsaquestions.questions.tree.treeUtils.HardcodedTree.Companion.createHardcodedTree
import com.example.dsaquestions.questions.tree.treeUtils.TreeNode
import com.example.dsaquestions.questions.tree.treeUtils.TreePrinter.Companion.printTree


private fun insertRec(node:TreeNode?, value: Int):TreeNode? {
    if (node == null) {
        return TreeNode(value)
    }

    if (value < node.`val`) {
        node.left =
            insertRec(node.left, value)
    } else if (value > node.`val`) {
        node.right =
            insertRec(node.right, value)
    }

    return node
}



fun main() {

    // Create a hardcoded tree
    val root = createHardcodedTree()

    // Print the tree
    println("Printing the hardcoded BST:")
  printTree(root)

    // Optionally, insert a new value into the tree
    val newRoot = insertRec(root, 35)

    // Print the tree after insertion
    println("\nPrinting the BST after insertion:")
  printTree(newRoot)
}


