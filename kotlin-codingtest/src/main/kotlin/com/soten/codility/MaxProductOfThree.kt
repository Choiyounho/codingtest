package com.soten.codility

import kotlin.math.max

class MaxProductOfThree {

	fun solution(arr: IntArray): Int {
		arr.sort()
		return max(arr[0] * arr[1] * arr[arr.size - 1], arr[arr.size - 1] * arr[arr.size - 2] * arr[arr.size - 3])
	}

}
