package com.example.dsaquestions.Tree

import com.example.dsaquestions.Tree.TreeUtils.TreeNode
import java.util.LinkedList
import java.util.Queue



fun invertTree(node: TreeNode?): TreeNode? {
    if (node == null) {
        return null;
    }
  val invertNodeQueue: Queue<TreeNode> = LinkedList()
   invertNodeQueue.add(node)
   while (!invertNodeQueue.isEmpty())
   {
       val treeNode = invertNodeQueue.poll()
       // Swap nodes
       val temp: TreeNode = node.left!!
       node.left = node.right;
       node.right = temp;

       if(treeNode.left!=null) invertNodeQueue.add(treeNode.left)
       if(treeNode.right!=null) invertNodeQueue.add(treeNode.right)
   }
return node
}
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

    println("\n Original Tree: ")
    printTree1(root)

    println("\n Invert Tree: ")
    printTree1(invertTree(root))

}



