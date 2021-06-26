package com.soten.baekjoon

val answerList = ArrayList<Int>()

var count = 0

fun main() = with(System.`in`.bufferedReader()) {

	val input = readLine().toInt()

	val checkList = ArrayList<Int>()

	for (i in 1..input) {
		checkList.add(readLine().toInt())
	}

	for (i in checkList.indices) {
		startPlus(0, checkList[i])
		answerList.add(count)
		count = 0
	}

	for (i in answerList.indices) {
		println(answerList[i])
	}
}

fun startPlus(check: Int, result: Int) {
	if (check == result) {
		count++
		return
	}
	if (check > result) {
		return
	}
	startPlus(check + 1, result)
	startPlus(check + 2, result)
	startPlus(check + 3, result)
}
