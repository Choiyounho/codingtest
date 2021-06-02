package com.soten.programers.level1

fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
	var zeroCount = 0
	val winList = win_nums.toMutableList()
	val myLotto = lottos.toMutableList()

	while (myLotto.contains(0)) {
		myLotto.remove(0)
		zeroCount++
	}

	var last = 0
	for (i in 0 until winList.size) {
		for (j in 0 until myLotto.size) {
			if (winList[i] == myLotto[j]) {
				last++
			}
		}
	}

	return intArrayOf(level(last + zeroCount), level(last))
}

fun level(n: Int): Int { 
	if (n == 2) return 5
	if (n == 3) return 4
	if (n == 4) return 3
	if (n == 5) return 2
	if (n == 6) return 1
	return 6
}

fun main() {
	val my = intArrayOf(44, 1, 0, 0, 31, 25)
	val win = intArrayOf(31, 10, 45, 1, 6, 19)

	println(solution(my, win))
}
