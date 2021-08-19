package com.soten.programers.level2

import java.util.*

private fun solution(priorities: IntArray, location: Int): Int {
	var answer = 1

	val priority = PriorityQueue<Int>(Collections.reverseOrder()) // 내림 차순

	for (element in priorities) {
		priority.offer(element)
	}

	while (!priority.isEmpty()) {
		for (i in priorities.indices) {
			if (priorities[i] == priority.peek()) {
				if (i == location) {
					return answer
				}
				priority.poll()
				answer++
			}
		}
	}

	return answer
}

fun main() {
	solution(intArrayOf(2, 1, 3, 2), 2)
}
