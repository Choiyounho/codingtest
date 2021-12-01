package com.soten.programers.level1

import kotlin.math.pow
import kotlin.math.sqrt

private fun solution(numbers: IntArray, hand: String): String {
	var answer = ""

	val myHand = if (hand.startsWith("r")) "R" else "L"

	val keypadMap = initKeypad()

	val leftSet = setOf(1, 4, 7)
	val rightSet = setOf(3, 6, 9)

	var leftHandPosition = intArrayOf(1, 1)
	var rightHandPosition = intArrayOf(1, 3)

	var leftLength = 0
	var rightLength = 0

	for (i in numbers.indices) {
		if (leftSet.contains(numbers[i])) {
			leftHandPosition = keypadMap[numbers[i]] ?: intArrayOf()
			answer += "L"
			continue
		}

		if (rightSet.contains(numbers[i])) {
			rightHandPosition = keypadMap[numbers[i]] ?: intArrayOf()
			answer += "R"
			continue
		}

		leftLength = calculateLength(leftHandPosition, keypadMap[numbers[i]]!!)
		rightLength = calculateLength(rightHandPosition, keypadMap[numbers[i]]!!)

		if (leftLength == rightLength) {
			answer += myHand
			if (myHand == "L") {
				leftHandPosition = keypadMap[numbers[i]]!!
			} else {
				rightHandPosition = keypadMap[numbers[i]]!!
			}

			continue
		}

		if (leftLength > rightLength) {
			rightHandPosition = keypadMap[numbers[i]]!!
			answer += "R"
		} else {
			leftHandPosition =  keypadMap[numbers[i]]!!
			answer += "L"
		}

	}

	return answer
}

private fun calculateLength(array: IntArray, array2: IntArray): Int {
	var answer = 0

	val leftFirst = array[0]
	val leftSecond = array[1]

	val rightFirst = array2[0]
	val rightSecond = array2[1]

	var length = 0.0

	length = sqrt((leftFirst - rightFirst).toDouble().pow(2) + (leftSecond - rightSecond).toDouble().pow(2))

	answer = when {
		length > 1.0 && length < 2.0 -> 2
		length > 2.0 && length < 3.0 -> 3
		length > 3.0 && length < 4.0 -> 4
		else -> length.toInt()
	}

	return answer
}

private fun initKeypad(): HashMap<Int, IntArray> {
	val keypadMap = hashMapOf<Int, IntArray>()

	keypadMap[-1] = intArrayOf(1, 1)
	keypadMap[0] = intArrayOf(1, 2)
	keypadMap[-2] = intArrayOf(1, 3)

	keypadMap[7] = intArrayOf(2, 1)
	keypadMap[8] = intArrayOf(2, 2)
	keypadMap[9] = intArrayOf(2, 3)

	keypadMap[4] = intArrayOf(3, 1)
	keypadMap[5] = intArrayOf(3, 2)
	keypadMap[6] = intArrayOf(3, 3)

	keypadMap[1] = intArrayOf(4, 1)
	keypadMap[2] = intArrayOf(4, 2)
	keypadMap[3] = intArrayOf(4, 3)

	return keypadMap
}

fun main() {

	println(solution(intArrayOf(1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5), "r"))
}
