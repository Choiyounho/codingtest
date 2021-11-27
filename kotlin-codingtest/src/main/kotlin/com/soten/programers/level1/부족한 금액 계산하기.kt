package com.soten.programers.level1

private fun solution(price: Int, money: Int, count: Int): Long {
	val answer = calculate(price, count) - money
	return if (answer > 0) answer else 0
}

private fun calculate(price: Int, count: Int): Long {
	var answer = 0L

	for (i in 1..count) {
		answer += price * i
	}

	return answer
}
