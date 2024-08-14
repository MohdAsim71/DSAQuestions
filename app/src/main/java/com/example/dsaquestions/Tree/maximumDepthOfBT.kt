package com.example.dsaquestions.Tree

import com.example.dsaquestions.Tree.TreeUtils.TreeNode
import java.util.LinkedList
import java.util.Queue

fun main(args: Array<String>) {

    // Creating a tree that looks like
    //            2
    val root = TreeNode(2)

    // Adding left and right child
    //            2
    //          /  \
    //        8     4
    root.left = TreeNode(8)
    root.right = TreeNode(4)
    val leftNode = root.left
    val rightNode = root.right

    // Adding more child to left node
    //            2
    //          /  \
    //        8     4
    //      /  \
    //     3   7
    leftNode!!.left = TreeNode(3)
    leftNode.right = TreeNode(7)

    // Adding child to right node
    //            2
    //          /  \
    //        8     4
    //      /  \     \
    //     3   7      1
    rightNode!!.right = TreeNode(1)

    // Adding child to child of right node
    //            2
    //          /  \
    //        8     4
    //      /  \     \
    //     3   7      1
    //               /
    //              6
    rightNode.right!!.left = TreeNode(6)
    rightNode.right!!.right = TreeNode(7)

    println("\n Original Tree: ")
    printTree1(root)


    println("\nmaximumDepthOfBT: ${maxDepth(root)}")
    //maximumDepthOfBT(invertTree(root))

}


fun maxDepth(root: TreeNode?): Int {
    if (root == null) return 0
    val nodes: Queue<TreeNode?> = LinkedList()
    nodes.add(root)
    var levels = 0
    while (!nodes.isEmpty()) {
        levels++
        val size = nodes.size
        for (i in 0 until size) {
            val poppedNode = nodes.poll()
            if (poppedNode!!.left != null) nodes.add(poppedNode.left)
            if (poppedNode.right != null) nodes.add(poppedNode.right)
        }
    }
    return levels
}
fun printTree1(node: TreeNode?, prefix: String = "", isLeft: Boolean = true) {
    if (node != null) {
        println(prefix + (if (isLeft) "├── " else "└── ") + node.`val`)
        printTree1(node.left, prefix + (if (isLeft) "│   " else "    "), true)
        printTree1(node.right, prefix + (if (isLeft) "│   " else "    "), false)
    }}