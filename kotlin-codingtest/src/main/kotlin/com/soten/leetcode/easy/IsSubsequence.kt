package com.soten.leetcode.easy

fun isSubsequence(s: String, t: String): Boolean {
	if (s == "") return true

	var sMatch: Int = 0
	var tMatch: Int = 0

	while (sMatch < s.length && tMatch < t.length) {
		if (s[sMatch] == t[tMatch]) {
			sMatch++
		}
		tMatch++
	}

	return sMatch == s.length
}

