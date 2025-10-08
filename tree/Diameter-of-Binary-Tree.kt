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

    var result = 0
    fun diameterOfBinaryTree(root: TreeNode?): Int {
        findDiameter(root)
        return result
    }

    fun findDiameter(root: TreeNode?): Int{

        if(root == null){
            return 0
        }

        val left = findDiameter(root.left)
        val right = findDiameter(root.right)

        result = Math.max(result, left + right)
        return 1 + Math.max(left, right)


    }
}