package com.soten.programers.level2

private fun solution(w: Int, h: Int): Long {
	return (w.toLong() * h.toLong() - (w + h - gcd(w, h)))
}

private fun gcd(a: Int, b: Int): Long = if (b != 0) gcd(b, a % b) else a.toLong()
// w * h - (w + h - 최대공약수)

fun main() {
	println(solution(8, 12))
}
