package com.soten.baekjoon.bronze

fun main() = with(System.`in`.bufferedReader()) {

	val count = readLine().toInt()

	val arr = Array(count) { Array(2) { 0 } }

	for (i in 0 until count) {
		val numList = readLine().split(" ")
		arr[i][0] = numList[0].toInt()
		arr[i][1] = numList[1].toInt()
	}

	for (i in 0 until count) {
		val num1 = arr[i][0]
		val num2 = arr[i][1]
		arr[i][0] = (num1 * num2) / gcd(num1, num2)
		arr[i][1] = gcd(num1, num2)
	}

	for (i in 0 until count) {
		println("${arr[i][0]} ${arr[i][1]}")
	}

}

private fun gcd(a: Int, b: Int): Int = if (b != 0) gcd(b, a % b) else a


