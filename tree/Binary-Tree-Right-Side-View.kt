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
    fun rightSideView(root: TreeNode?): List<Int> {
        val res = mutableListOf<Int>()
        if(root == null){
            return res
        }
    
        val q = ArrayDeque<TreeNode>()
        q.add(root)

        while(q.isNotEmpty()){
            val qSize = q.size
            for(i in 0 until qSize){
                val node = q.removeFirst()
                if(i == qSize - 1){
                    if(node != null){
                    res.add(node.`val`)
                    }
                }
                node?.left?.let{q.add(it)}
                node?.right?.let{q.add(it)}
            }
        }

        return res
    }
}