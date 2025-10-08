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
    fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
        if(root == null){
            return false
        }

        if(isSameTree(root, subRoot)){
            return true
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot)
    }

    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if(p == null && q == null){
            return true
        }
        if(p == null || q == null){
            return false
        }
        if(p?.`val` != q?.`val`){
            return false
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
    }
}