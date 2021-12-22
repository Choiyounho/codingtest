package com.soten.programers.level1


private fun solution(num: Int): Int {
	var answer = 0
	var number = num
	while (true) {
		if (number == 1) {
			return answer
		}
		number = if (number % 2 == 0) number / 2 else number * 3 + 1
		answer++
		if (answer == 500) {
			return -1
		}
	}
}

fun main() {
	println(solution(6))
}
