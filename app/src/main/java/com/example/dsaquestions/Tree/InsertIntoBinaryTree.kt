package com.example.dsaquestions.Tree
import com.example.dsaquestions.Tree.TreeUtils.HardcodedTree
import com.example.dsaquestions.Tree.TreeUtils.TreeNode
import com.example.dsaquestions.Tree.TreeUtils.TreePrinter


private fun insertRec(node: TreeNode?, value: Int): TreeNode? {
    if (node == null) {
        return TreeNode(value)
    }

    if (value < node.`val`) {
        node.left = insertRec(node.left, value)
    } else if (value > node.`val`) {
        node.right = insertRec(node.right, value)
    }

    return node
}



fun main() {

    // Create a hardcoded tree
    val root = HardcodedTree.createHardcodedTree()

    // Print the tree
    println("Printing the hardcoded BST:")
    TreePrinter.printTree(root)

    // Optionally, insert a new value into the tree
    val newRoot = insertRec(root, 35)

    // Print the tree after insertion
    println("\nPrinting the BST after insertion:")
    TreePrinter.printTree(newRoot)
}


