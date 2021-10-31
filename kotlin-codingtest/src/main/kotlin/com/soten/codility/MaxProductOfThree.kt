package com.soten.codility

import kotlin.math.max

class MaxProductOfThree {
	fun solution(A: IntArray): Int {
		A.sort()
		return max(A[0] * A[1] * A[A.size - 1], A[A.size - 1] * A[A.size - 2] * A[A.size - 3])
	}
}
