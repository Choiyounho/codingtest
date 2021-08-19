package com.soten.programers.level2



private fun solution(s: String): String {
	var isLowerCase = false

	val splitString = s.split("")
	var answer = ""
	for (i in 1 until splitString.size) {
		if (splitString[i] == " ") {
			isLowerCase = false
			answer += splitString[i]
			continue
		}

		if (isLowerCase.not()) {
			isLowerCase = true
			answer += splitString[i].toUpperCase()
			continue
		}
		answer += splitString[i].toLowerCase()
	}

	return answer
}

fun main() {
	println(solution("3people unFollowed me")) // "3people Unfollowed Me"

	println(solution("for the last week")) // "For The Last Week"
}
