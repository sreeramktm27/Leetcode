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
    fun isValidBST(root: TreeNode?): Boolean {

        fun isValid(root: TreeNode?, low: Long, high: Long): Boolean{

        if(root == null){
            return true
        }

        if(!(root.`val` > low && root.`val` < high)){
            return false
        }

        return isValid(root?.left, low, root.`val`.toLong()) && isValid(root.right, root.`val`.toLong(), high)
        }

        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE)


    }
}