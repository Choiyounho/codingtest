package com.soten.baekjoon

fun main() = with(System.`in`.bufferedReader()) {

	var input = readLine().toInt()

	var kg3 = 0
	var kg5 = 0

	if (input <= 0) {
		println(-1)
		return@with
	}

	while (input > 0) {
		if (input % 5 == 0) {
			kg5 = input / 5
			break
		}
		input -= 3
		kg3++
	}

	if (input < 0) {
		println(-1)
	} else {
		println(kg5 + kg3)
	}
}
