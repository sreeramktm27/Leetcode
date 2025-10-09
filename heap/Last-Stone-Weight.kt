class Solution {
    fun lastStoneWeight(stones: IntArray): Int {
        val stonesList = stones.toMutableList()

        while(stonesList.size > 1){
            stonesList.sort()
            val curr = stonesList.removeAt(stonesList.size - 1) - stonesList.removeAt(stonesList.size - 1)
            if(curr > 0){
                stonesList.add(curr)
            }
        }

        if(stonesList.isEmpty()){
            return 0
        }else{
            return stonesList[0]
        }
    }
}