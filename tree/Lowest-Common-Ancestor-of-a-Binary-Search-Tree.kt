/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int = 0) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        
        // var curr = root

        // while(curr != null){
        //     if(p?.`val` > curr?.`val` && q?.`val` > curr?.`val`){
        //         curr = curr?.right
        //     }else if(p?.`val` < curr?.`val` && q?.`val` < curr?.`val`){
        //         curr = curr?.left
        //     }else{
        //         return curr
        //     }
        // }

        while(root == null || p == null || q == null){
            return null
        }

        return when {
            maxOf(p.`val`, q.`val`) < root.`val` -> lowestCommonAncestor(root.left, p, q)
            minOf(p.`val`, q.`val`) > root.`val` -> lowestCommonAncestor(root.right, p, q)
            else -> root
        }
    }
}