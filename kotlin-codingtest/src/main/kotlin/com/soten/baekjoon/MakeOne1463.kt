package com.soten.baekjoon

//fun main() = with(System.`in`.bufferedReader()) {
//
//	var input = readLine().toInt()
//	var list = MutableList(input + 1) { i -> i }
//
//	list[0] = 0
//	list[1] = 0
//
//	for (i in 2 until list.size) {
//		list[i] = list[i - 1] + 1
//
//		if (i % 2 == 0) {
//			list[i] = min(list[i], list[i / 2] + 1)
//		}
//		if (i % 3 == 0) {
//			list[i] = min(list[i], list[i / 3] + 1)
//		}
//	}
//
//	println(list[input])
//}
//
//fun min(num1: Int, num2: Int) = if (num1 < num2) num1 else num2
//

fun main() = with(System.`in`.bufferedReader()) {

	var input = readLine().toInt()

	var count = 0

	if (input == 1) {
		println(0)
		return@with
	}

	while (input != 1) {
		if ((input - 1) % 3 == 0) {
			input -= 1
			input /= 3
			count += 2
			continue
		}

		if (input % 3 == 0) {
			input /= 3
			count++
			continue
		}
		if (input % 2 == 0) {
			input /= 2
			count++
			continue
		}
		input -= 1
		count++
	}

	println(count)
}
