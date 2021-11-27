package com.soten.programers.level1

private fun solution(sizes: Array<IntArray>): Int {
	val bigLengthList = mutableListOf<Int>()
	val smallLengthList = mutableListOf<Int>()

	for (i in sizes.indices) {
		val first = sizes[i][0]
		val second = sizes[i][1]

		if (first >= second) {
			bigLengthList.add(first)
			smallLengthList.add(second)
		} else {
			bigLengthList.add(second)
			smallLengthList.add(first)
		}
	}

	return bigLengthList.max()!! * smallLengthList.max()!!
}
