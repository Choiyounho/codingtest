package com.soten.programers.level1

private fun solution(n: Int): Int {
	var answer: Int = 2

	while (true) {
		if (n % answer == 1) {
			break
		}
		answer++
	}
	return answer
}

