package com.example.dsaquestions.Tree.TreeUtils

// Utility class to print a binary search tree
class TreePrinter {
    companion object {
        // Companion method to print the tree with arrows
        fun printTree(root: TreeNode?) {
            printTreeRec(root, "", "")
        }

        // Recursive helper function to print the tree
        private fun printTreeRec(root: TreeNode?, indent: String, pointer: String) {
            if (root != null) {
                println(indent + pointer + root.`val`)
                val childIndent = indent + "    "
                printTreeRec(root.left, childIndent, "└──L ")
                printTreeRec(root.right, childIndent, "└──R ")
            }
        }
    }
}
