class Solution {
    fun numWaterBottles(numBottles: Int, numExchange: Int): Int {
        var tb = 0

        //initially drink the whole bottles
        tb += numBottles

        var currCount = numBottles
        while(currCount >= numExchange){
            val (bottles, carry) = getCount(currCount, numExchange)
            tb += bottles
            currCount = bottles + carry
        }

        return tb
    }

    fun getCount(numBottles: Int, numExchange: Int): Pair<Int, Int>{
        return Pair(numBottles / numExchange, numBottles % numExchange)
    }
}