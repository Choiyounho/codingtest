package com.soten.programers.level2

import kotlin.math.max

class Fatigue {

	private lateinit var visited: Array<Boolean>
	private var answer = 0

	private fun solution(k: Int, dungeons: Array<IntArray>): Int {
		visited = Array(dungeons.size) { false }
		dfs(0, k, dungeons)
		return answer
	}

	private fun dfs(enter: Int, k: Int, dungeons: Array<IntArray>) {
		for (i in dungeons.indices) {
			if (!visited[i] && dungeons[i][0] <= k) {
				visited[i] = true
				dfs(enter + 1, k - dungeons[i][1], dungeons)
				visited[i] = false
			}
		}
		answer = max(answer, enter)
	}

}
