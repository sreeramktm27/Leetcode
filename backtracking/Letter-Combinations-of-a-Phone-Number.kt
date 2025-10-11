class Solution {
    fun letterCombinations(digits: String): List<String> {
        //Brute force solution
        // if(digits.isEmpty()) return listOf()
        // var res = listOf("")
        // for(digit in digits){
        //     val letters = digit.letters
        //     res = letters.flatMap{letter->
        //         res.map{
        //             it + letter
        //         }
        //     }
        // }

        // return res
        //DFS Solution
        if(digits.isEmpty()){
            return listOf()
        }
        val res = mutableListOf<String>()

        fun dfs(i: Int, strBuilder: StringBuilder){
            //Base Case
            if(i == digits.length){
                res.add(strBuilder.toString())
                return
            }

            val letters = digits[i].letters

            for(ch in letters){
                strBuilder.append(ch)
                dfs(i + 1, strBuilder)
                strBuilder.deleteCharAt(strBuilder.length - 1)
            }
        }

        dfs(0, StringBuilder())

        return res

    }

    private val Char.letters get() = when(this) {
        '2' -> listOf('a', 'b', 'c')
        '3' -> listOf('d', 'e', 'f')
        '4' -> listOf('g', 'h', 'i')
        '5' -> listOf('j', 'k', 'l')
        '6' -> listOf('m', 'n', 'o')
        '7' -> listOf('p', 'q', 'r', 's')
        '8' -> listOf('t', 'u', 'v')
        '9' -> listOf('w', 'x', 'y', 'z')
        else -> listOf()
    }
}