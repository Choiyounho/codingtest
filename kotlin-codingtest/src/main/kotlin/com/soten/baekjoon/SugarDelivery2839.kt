package com.soten

fun main() = with(System.`in`.bufferedReader()) {

	var input = readLine().toInt()

	var kg3 = 0
	var kg5 = 0

	if (input % 5 == 0) {
		println(input / 5)
		return@with
	}

	if (input <= 0) {
		println(-1)
		return@with
	}


	while (input > 0) { // kg5 * 5 + kg3 * 3 == input ||
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


/*
	설탕을 배달해야한다.
	3kg 봉지와 5kg 봉지가 있다.
	최대한 적은 봉지를 들 것이다.
	주어진 N을 3kg과 5kg을 분배하여 최소한의 봉지 수를 구하라.


 */
