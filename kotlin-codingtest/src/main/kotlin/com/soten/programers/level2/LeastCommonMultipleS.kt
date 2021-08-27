package com.soten.programers.level2

// N개의 최소공배수
private fun solution(arr: IntArray): Int {
	var answer = 0

	for (i in 0..arr.size - 2) {
		answer = lcd(arr[i], arr[i + 1])
		arr[i + 1] = answer
	}

	return answer
}

private fun gcd(a: Int, b: Int): Int = if (b != 0) gcd(b, a % b) else a // 최대 공약수
private fun lcd(a: Int, b: Int): Int = (a * b / gcd(a, b)) // 최소 공배수

fun main() {
	println(solution(intArrayOf(2, 6, 8, 14)))
}
