package com.soten.programers.level2

import java.util.*


fun main() {
	print(solution(intArrayOf(95, 90, 99, 99, 80, 99), intArrayOf(1, 1, 1, 1, 1, 1)).contentToString())
}

private fun solution(progresses: IntArray, speeds: IntArray): IntArray {
	val answer = mutableListOf<Int>()

	val developPairQueue = LinkedList<Pair<Int, Int>>()

	for (i in progresses.indices) {
		developPairQueue.add(Pair(progresses[i], speeds[i]))
	}

	var count = 0 // 한번에 몇개가 개발 되었는 지
	var days = 0 // 며칠 지났는 지

	while (!developPairQueue.isEmpty()) {
		val qPeek = developPairQueue.peek()
		days++
		if (qPeek.first + (qPeek.second * days) >= 100) {
			developPairQueue.poll()
			count++

			if (developPairQueue.isNotEmpty()) {
				count = isPoll(developPairQueue, days, count)
			}
			answer.add(count)

			count = 0
		}

	}

	return answer.toIntArray()
}

fun isPoll(developPairQueue: LinkedList<Pair<Int, Int>>, days: Int, count: Int): Int {
	var count2 = count
	val qPeek = developPairQueue.peek()
	if (qPeek.first + (qPeek.second * days) >= 100) {
		developPairQueue.poll()
		count2++
		if (developPairQueue.isNotEmpty()) {
			count2 = isPoll(developPairQueue, days, count2)
		}
	}
	return count2
}


