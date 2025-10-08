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
    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
        if(preorder.isEmpty() || inorder.isEmpty()){
            return null
        }

        val root = TreeNode(preorder[0])
        val mid = inorder.indexOf(preorder[0])

        root.left = buildTree(
            preorder.slice(1..mid).toIntArray(),
            inorder.slice(0 until mid).toIntArray()
        )

        root.right = buildTree(
            preorder.slice(mid + 1 until preorder.size).toIntArray(),
            inorder.slice(mid + 1 until preorder.size).toIntArray()
        )

        return root
    }
}