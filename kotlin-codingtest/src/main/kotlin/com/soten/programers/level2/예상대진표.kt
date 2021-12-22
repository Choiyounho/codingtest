package com.soten.programers.level2

private fun solution(n: Int, a: Int, b: Int): Int {
	var answer = 0

	var a1 = a
	var b1 = b
	while (a1 != b1) {
		answer++
		a1 = (a1 + 1) / 2
		b1 = (b1 + 1) / 2
	}

	return answer
}
