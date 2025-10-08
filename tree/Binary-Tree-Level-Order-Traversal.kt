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
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        //dfs solution
        // val res = mutableListOf<MutableList<Int>>()

        // fun dfs(node: TreeNode?, depth: Int){
        //     if(node == null) return

        //     if(res.size == depth){
        //         res.add(mutableListOf())
        //     }

        //     res[depth].add(node.`val`)
        //     dfs(node?.left, depth + 1)
        //     dfs(node?.right, depth + 1)
        // }

        // dfs(root, 0)
        // return res

        //bfs solution
        val res = mutableListOf<MutableList<Int>>()

        if(root == null) return res

        val q =  ArrayDeque<TreeNode>()
        q.add(root)

        while(q.isNotEmpty()){
            val itemsList = mutableListOf<Int>()
            val qLen = q.size

            for(i in 0 until qLen){
                val element = q.removeFirst()
                itemsList.add(element.`val`)

                element.left?.let{q.add(it)}
                element.right?.let{q.add(it)}
            }
            res.add(itemsList)
        }

        return res
    }
}