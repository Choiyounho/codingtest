package com.soten.leetcode.easy

fun maxProfit(prices: IntArray): Int {
	if (prices.size == 1) {
		return 0
	}

	var minBenefit = Int.MAX_VALUE
	var maxBenefit = 0

	for (price in prices) {
		minBenefit = minBenefit.coerceAtMost(price) // Math.min(minBenefit, i)
		maxBenefit = maxBenefit.coerceAtLeast(price - minBenefit)
	}
	//   0  900 1 39 999 99999
	// 100 1000 1 40 1000 100000

	return maxBenefit
}

fun main() {
	println(maxProfit(intArrayOf(100, 1000, 1, 40, 1000, 100000)))
}


/*
*
* dp를 사용
*
*
* 최소값과 현재 위치 가격과 비교
* */
