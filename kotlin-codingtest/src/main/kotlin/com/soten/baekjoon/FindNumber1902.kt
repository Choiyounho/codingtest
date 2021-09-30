package com.soten.baekjoon

import java.util.*


fun main() = with(Scanner(System.`in`)) {

	val conditionCount = nextInt()
	val conditionQuery = arrayListOf<Int>()
	for (i in 0 until conditionCount) {
		conditionQuery.add(nextInt())
	}
	conditionQuery.sort()

	val findNumberCount = nextInt()

	for (i in 0 until findNumberCount) {
		var left = 0
		var right = conditionCount - 1
		val findNumber = nextInt()
		var isPass = false
		while (left <= right) {
			val index = (left + right) / 2
			val value = conditionQuery[index]

			if (value == findNumber) {
				isPass = true
				println(1)
				break
			}
			if (value > findNumber) {
				right = index - 1
			}
			if (value < findNumber) {
				left = index + 1
			}
		}
		if (isPass.not()) {
			println(0)
		}
	}

}
