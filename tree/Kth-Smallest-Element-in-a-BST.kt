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
    var result = -1
    fun kthSmallest(root: TreeNode?, k: Int): Int {
       if(root == null){
        return 0
       } 

       kthSmallest(root.left, k)
       count++
       if(count == k){
        result = root.`val`
        return result
       }
       kthSmallest(root.right, k)

       return result
    }
}