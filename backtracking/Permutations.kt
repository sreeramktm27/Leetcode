class Solution {
    fun permute(nums: IntArray): List<List<Int>> {
        //Brute force
        // if(nums.isEmpty()){
        //     return listOf(listOf())
        // }

        // val res = mutableListOf<List<Int>>()

        // val perm = permute(nums.sliceArray(1 until nums.size))
        // for(p in perm){
        //     for(i in 0..p.size){
        //         val curr = p.toMutableList()
        //         curr.add(i, nums[0])
        //         res.add(curr)
        //     }
        // }

        // return res

        //Backtracking
        val res = mutableListOf<List<Int>>()
        fun dfs(curr: MutableList<Int>, shouldItemBePicked: BooleanArray){
            //Base case
            if(curr.size >= nums.size){
                res.add(curr.toList())
                return
            }

            for(i in nums.indices){
                if(!shouldItemBePicked[i]){
                    curr.add(nums[i])
                    shouldItemBePicked[i] = true
                    dfs(curr, shouldItemBePicked)
                    curr.removeAt(curr.size - 1)
                    shouldItemBePicked[i] = false
                }
            }
        }

        dfs(mutableListOf(), BooleanArray(nums.size))
        return res
    }
}