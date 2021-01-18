package com.soten.codility

class Distinct {

	fun solution(A: IntArray): Int {
		return A.distinct().size
	}

	fun solution1(A: IntArray): Int {
		val set = mutableSetOf<Int>()

		for (element in A) {
			set.add(element)
		}

		return set.size
	}

}
