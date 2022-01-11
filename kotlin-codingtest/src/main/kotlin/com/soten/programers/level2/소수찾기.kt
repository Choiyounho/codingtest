package com.soten.programers.level2

import kotlin.math.sqrt

class Solution {

    fun solution(numbers: String): Int {

        // 1. 숫자 섞기 Set 넣음
        // 2.
        var answer = 0
        val numSet = HashSet<Int>()
        mixAllNumber("", numbers, numSet) // 모든 숫자 추가
        while (numSet.iterator().hasNext()) {
            val num = numSet.iterator().next()
            numSet.remove(num)
            if (isPrime(num)) {
                answer++
            }
        }
        return answer
    }

    private fun mixAllNumber(prefix: String, numbers: String, numSet: HashSet<Int>) {
        if (prefix != "") {
            numSet.add(prefix.toInt())
        }

        for (i in numbers.indices) {
            mixAllNumber(
                "$prefix${numbers[i]}",
                numbers.substring(0, i) + numbers.substring(i + 1),
                numSet
            )
        }
    }

    private fun isPrime(num: Int): Boolean {
        if (num <= 1) {
            return false
        }

        return (2..sqrt(num.toDouble()).toInt()).none { num % it == 0 }
    }
}
