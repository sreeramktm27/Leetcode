class Solution {
    fun partition(s: String): List<List<String>> {
        val res = mutableListOf<List<String>>()
        val curr = mutableListOf<String>()


        fun dfs(j: Int, i: Int){
            //Base Case
            if(i >= s.length){
                if(i == j){
                    res.add(curr.toList())
                }
                return
            }

            if(isPalindrome(s, j, i)){
                curr.add(s.substring(j, i + 1))
                dfs(i + 1, i + 1)
                curr.removeAt(curr.size - 1)
            }

            dfs(j, i + 1)
        }

        dfs(0,0)
        return res
    }

    private fun isPalindrome(s: String, l: Int, r: Int): Boolean{
        var left = l
        var right = r

        while(left <= right){
            if(s[left] != s[right]){
                return false
            }
            left++
            right--
        }

        return true
    }
}