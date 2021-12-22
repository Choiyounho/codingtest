package com.soten.programers.level2

private fun solution(numbers: LongArray): LongArray {
	val answer = mutableListOf<Long>()

	numbers.forEach {
		if (it % 2 == 0L) {
			answer.add(it + 1)
		} else {
			var myBinary = it.toString(2)

			val zeroIndex = myBinary.lastIndexOf("0")
			if (zeroIndex != -1) {
				myBinary = myBinary.substring(0, zeroIndex) + "10" + myBinary.substring(zeroIndex + 2, myBinary.length)
				answer.add(myBinary.toLong(2))
			} else {
				myBinary = "10" + myBinary.substring(1, myBinary.length)
				answer.add(myBinary.toLong(2))
			}
		}
	}

	return answer.toLongArray()
}
