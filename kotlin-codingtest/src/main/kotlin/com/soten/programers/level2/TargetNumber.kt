package com.soten.programers.level2

private var answer = 0

private fun solution(numbers: IntArray, target: Int): Int {
	targeting(target, 0, numbers, 0)
	return answer
}

fun targeting(target: Int, index: Int, numbers: IntArray, cycle: Int) {
	if (cycle == target && index == numbers.size) {
		answer++
	}

	if (index >= numbers.size) {
		return
	}

	val plusCycle = cycle + numbers[index]
	val minusCycle = cycle - numbers[index]

	targeting(target, index + 1, numbers, plusCycle)
	targeting(target, index + 1, numbers, minusCycle)
}

fun main() {
	println(solution(intArrayOf(1, 1, 1, 1, 1), 3))
}
