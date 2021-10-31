package com.soten.leetcode.easy

private fun maxProfit(prices: IntArray): Int {
	if (prices.size == 1) {
		return 0
	}

	var minBenefit = Int.MAX_VALUE
	var maxBenefit = 0

	for (price in prices) {
		minBenefit = minBenefit.coerceAtMost(price)
		maxBenefit = maxBenefit.coerceAtLeast(price - minBenefit)
	}

	return maxBenefit
}
