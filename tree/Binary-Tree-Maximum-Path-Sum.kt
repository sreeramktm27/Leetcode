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
    private var res = Int.MIN_VALUE
    fun maxPathSum(root: TreeNode?): Int {
        dfs(root)
        return res
    }

    private fun dfs(root: TreeNode?){
        if(root == null){
            return
        }

        val left = getMax(root.left)
        val right = getMax(root.right)

        res = maxOf(res, root.`val` + left + right)

        dfs(root.left)
        dfs(root.right)
    }

    private fun getMax(root: TreeNode?): Int{
        if(root == null){
            return 0
        }

        val left = getMax(root.left)
        val right = getMax(root.right)
        val path = root.`val` + maxOf(left, right)
        return maxOf(0, path)
    }


}