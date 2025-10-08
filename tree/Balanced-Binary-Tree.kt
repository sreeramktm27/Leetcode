/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun isBalanced(root: TreeNode?): Boolean {
        if(root == null){
            return true
        }

        val left = treeHeight(root?.left)
        val right = treeHeight(root?.right)

        return abs(left - right) <= 1 && isBalanced(root?.left) && isBalanced(root?.right)
    }

    fun treeHeight(root: TreeNode?): Int{
        if(root == null){
            return 0
        }
        return 1 + maxOf(treeHeight(root?.left), treeHeight(root?.right))
    }
}