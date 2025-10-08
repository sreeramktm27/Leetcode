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
    var count = 0
    fun goodNodes(root: TreeNode?): Int {
        if(root == null) {
            return -1
        }

        dfs(root, root.`val`)

        return count
    }

    private tailrec fun dfs(root: TreeNode?, max: Int){
            // if(root == null){
            //     return
            // }

            // if(((parent?.`val` ?: 0) <= (root?.`val` ?: 0))){
            //     count++
            // }

            // dfs(root?.left, root)
            // dfs(root?.right, root)

            if(root == null){
                return
            }

            if(root.`val` >= max){
                count++
            }

            val newMax = root.`val`.coerceAtLeast(max)
            dfs(root.left, newMax)
            dfs(root.right, newMax)
        }
}