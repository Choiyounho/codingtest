package com.soten.programers.level1

private fun solution(strings: Array<String>, n: Int): Array<String> {
	return strings.also {
		it.sort()
		it.sortBy { it[n] }
	}
}
