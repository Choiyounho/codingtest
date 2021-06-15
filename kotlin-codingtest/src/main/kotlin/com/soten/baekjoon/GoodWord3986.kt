package com.soten.baekjoon

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {

	var input = readLine()

	val list = mutableListOf<String>()
	for (i in 0 until input.toInt()) {
		list.add(readLine())
	}

	var answer = 0

	// 같으면 빼고 다르면 추가
	for (i in list.indices) {
		val stack = Stack<Char>()

		for (j in list[i].indices) {
			if (!stack.isEmpty() && stack.peek() == list[i][j]) {
				stack.pop()
			} else {
				stack.push(list[i][j])
			}
		}

		if (stack.isEmpty()) {
			answer++
		}
	}

	println(answer)
}
