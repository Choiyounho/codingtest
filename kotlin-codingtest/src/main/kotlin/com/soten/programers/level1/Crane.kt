package com.soten.programers.level1

import java.util.*

private fun solution(board: Array<IntArray>, moves: IntArray): Int {
	val stack = Stack<Int>()
	var answer = 0

	for (i in moves.indices) {
		for (j in board[0].indices) {
			if (board[j][moves[i] - 1] != 0) {
				if (stack.isNotEmpty() && stack.peek() == board[j][moves[i] - 1]) {
					stack.pop()
					answer += 2
				} else {
					stack.push(board[j][moves[i] - 1])
				}
				board[j][moves[i] - 1] = 0
				break
			}
		}
	}

	return answer
}
