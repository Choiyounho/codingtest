package com.soten.leetcode.easy

fun isSubsequence(s: String, t: String): Boolean {
	if (s == "") return true

	var pointS = 0
	var pointT = 0

	while (pointS < s.length && pointT < t.length) {
		if (s[pointS] == t[pointT]) {
			pointS++
		}
		pointT++
	}

	return pointS == s.length
}
