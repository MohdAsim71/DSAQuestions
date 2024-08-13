package com.example.dsaquestions.Tree.TreeUtils

class HardcodedTree {
    companion object {
        // Method to create a hardcoded BST without calling insert repeatedly
        fun createHardcodedTree(): TreeNode? {
            val root = TreeNode(50)
            root.left = TreeNode(30)
            root.right = TreeNode(70)
            root.left?.left = TreeNode(20)
            root.left?.right = TreeNode(40)
            root.right?.left = TreeNode(60)
            root.right?.right = TreeNode(80)
            return root
        }
    }
}
