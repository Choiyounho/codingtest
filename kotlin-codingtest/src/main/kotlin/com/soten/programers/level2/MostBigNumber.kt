package com.soten.programers.level2

class MostBigNumber {

	companion object {
		fun solution(numbers: IntArray): String {
			var answer = ""

			numbers.sortedWith { o1, o2 ->
				"$o2$o1".compareTo("$o1$o2")
			}.forEach { answer += it }

			if (answer[0] == '0') {
				answer = "0"
			}

			return answer
		}
	}

}

fun main() {

	print(MostBigNumber.solution(intArrayOf(6, 10, 2, 5)))

}
