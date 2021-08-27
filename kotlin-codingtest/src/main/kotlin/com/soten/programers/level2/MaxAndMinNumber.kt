package com.soten.programers.level2

private fun solution(s: String): String {
	val list = s.split(" ") as MutableList<String>
	val numList = mutableListOf<Int>()

	list.forEach {
		numList.add(it.toInt())
	}

	return "${numList.maxOrNull()} ${numList.minOrNull()}"
}

fun main() {
	solution("1 2 4 3 -1 -3")
}
