package com.soten.leetcode.medium
 // 중복 안 되는 문자로 최대 길이 완성
fun lengthOfLongestSubstring(s: String): Int {

	if (s == "") {
		return 0
	}

	if (s.length == 1) {
		return 1
	}

	val charList = mutableListOf<Char>() // 현재까지 사용된 문자를 담는 리스트  (a b c) a b c
	val answerList = mutableListOf<Int>()  // 문자열의 길이를 담는 리스트  (abc).lenth

	for (i in 0..(s.length - 1)) {
		var str = s[i].toString()   // 첫 문자 a
		charList.add(s[i])
		for (j in i + 1 until s.length) {
			if (charList.contains(s[j])) { // 포함여부 확인
				answerList.add(str.length) //
				charList.clear()
				break
			} else {
				str += s[j] // abc
				charList.add(s[j])
			}
		}
		answerList.add(str.length)
		charList.clear()
	}

	return answerList.max() ?: s.length
}

fun main() {
	println(lengthOfLongestSubstring(" "))
}
