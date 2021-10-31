package com.soten.programers.level2

private fun solution(citations: IntArray): Int {
	var answer = 0

	val list = citations.sorted()
	for (i in list.indices) {
		if (list[list.size - 1 - i] > answer) {
			answer++
		} else {
			return answer
		}
	}
	return answer
}
