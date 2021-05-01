package com.soten.programers.level2

class Carpet {

	fun solution(brown: Int, yellow: Int): IntArray {
		val commonMultiple = brown + yellow
		val commonList = initList(commonMultiple)

		var answer = IntArray(2)

		var isPass = false

		for (i in commonList.indices) {
			for (j in commonList.indices) {
				if (commonList[i] * commonList[i] == commonMultiple) {
					answer[0] = commonList[i]
					answer[1] = commonList[i]
					if (isCheck(answer, brown, yellow)) {
						isPass = true
						break
					}
				}
				if (commonList[i] * commonList[j] == commonMultiple) {
					answer[0] = commonList[j]
					answer[1] = commonList[i]
					if (isCheck(answer, brown, yellow)) {
						isPass = true
						break
					}
				}
			}

			if (isPass) {
				break
			}

		}

		return answer
	}

	private fun isCheck(answer: IntArray, brown: Int, yellow: Int): Boolean {
		val ye = answer[1] // 세로
		val br = answer[0] // 가로
		/*
		가로 + 세로 = 브라운 / 2 + 2
		가로 * 세로 = 옐로우 + 브라운
	 */

		if (ye + br == brown / 2 + 2 && ye * br == yellow + brown) {
			return true
		}
		return false
	}

	private fun initList(commonMultiple: Int): ArrayList<Int> {
		val commonList = ArrayList<Int>()

		for (i in 1..(commonMultiple / 2)) {
			if (commonMultiple % i == 0) {
				commonList.add(i)
			}
		}
		return commonList
	}

}
