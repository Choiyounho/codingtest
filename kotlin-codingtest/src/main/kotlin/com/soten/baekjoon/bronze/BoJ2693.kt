package com.soten.baekjoon.bronze

fun main() = with(System.`in`.bufferedReader()) {
	val count = readLine().toInt()

	val arr = Array(count) { Array(10) { 0 } }

	for (i in 0 until count) {
		val list = readLine().split(" ")
		for (j in 0 until 10) {
			arr[i][j] = list[j].toInt()
		}
	}

	for (i in 0 until count) {
		println(arr[i].sortedArrayDescending()[2])
	}
}
