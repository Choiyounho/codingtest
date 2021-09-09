package com.soten.programers.level2

class JoyStick {

	companion object {
		fun solution(name: String): Int {
			var answer = 0
			var min = name.length - 1

			for (i in name.indices) {
				val asciCode = name[i]
				val count = if (asciCode - 'A' < 'Z' - asciCode + 1) asciCode - 'A' else 'Z' - asciCode + 1
				answer += count // 상하

				var nextIndex = i + 1
				while (nextIndex < name.length && name[nextIndex] == 'A') {
					nextIndex++
				}
				min = min.coerceAtMost(i * 2 + name.length - nextIndex) // 좌우
			}

			return answer + min
		}

	}

}

fun main() {

	println(JoyStick.solution("JEROEN"))

}
