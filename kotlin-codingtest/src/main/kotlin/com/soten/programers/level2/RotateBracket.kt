package com.soten.programers.level2

import java.util.*
import kotlin.collections.ArrayList

class RotateBracket {

	fun solution(s: String): Int {
		var answer = 0

		val list = initList(s)

		for (i in list.indices) {
			if (i != 0) {
				list.add(list[0])
				list.removeAt(0)
			}
			if (checkList(list)) answer++
		}

		return answer
	}

	private fun initList(s: String): ArrayList<Char> {
		val list = ArrayList<Char>()

		for (i in s.indices) {
			list.add(s[i])
		}
		return list
	}

	private fun checkList(list: ArrayList<Char>): Boolean {
		val stack = Stack<Char>()
		for (i in list.indices) {
			try {
				when (list[i]) {
					'(', '{', '[' -> stack.push(list[i])
					')' -> if (stack.peek() != '(') return false else stack.pop()
					'}' -> if (stack.peek() != '{') return false else stack.pop()
					']' -> if (stack.peek() != '[') return false else stack.pop()
				}
			} catch (e: Exception) {
				return false
			}
		}
		if (!stack.isEmpty()) {
			return false
		}
		return true
	}
}
