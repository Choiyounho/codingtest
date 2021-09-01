package com.soten.programers.level2

private fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
	val answer = Array(arr1.size) { IntArray(arr2.first().size) { 0 } }

	for (x in arr1.indices) {
		for (y in arr2[0].indices) {
			for (z in arr1[0].indices) {
				answer[x][y] += arr1[x][z] * arr2[z][y]
			}
		}
	}
	return answer
}
