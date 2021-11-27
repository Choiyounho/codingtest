package com.soten.programers.level1

private fun solution(s: String): Int {
	var answer = ""

	val alphabetMap = initAlphabetMap()

	val answerList = mutableListOf<Int>()
	var blankString = ""

	for (i in s.indices) {
		// 48 ~ 57   숫자 0 부터 9
		if (s[i].toInt() in 48..57) {
			val transFormNumber = Character.getNumericValue(s[i])
			answerList.add(transFormNumber)
		} else {
			blankString += s[i].toString()
			if (blankString.length >= 3) {
				if (alphabetMap.containsKey(blankString)) {
					answerList.add(alphabetMap[blankString]!!)
					blankString = ""
				}
			}
		}
	}

	// 키값을 받아와서 키 값에 해당하는 값이 있으면 replace

	for (i in 0 until answerList.size) {
		answer += answerList[i]
	}
	return answer.toInt()
}

private fun initAlphabetMap(): HashMap<String, Int> {
	return hashMapOf(
		"zero" to 0,
		"one" to 1,
		"two" to 2,
		"three" to 3,
		"four" to 4,
		"five" to 5,
		"six" to 6,
		"seven" to 7,
		"eight" to 8,
		"nine" to 9
	)
}
