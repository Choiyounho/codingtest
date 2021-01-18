package com.soten.codility

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class DistinctKtTest {

	val distinct = Distinct()
	val numbers = intArrayOf(1, 1, 2, 2, 3, 3)

	@Test
	@DisplayName("Kotlin-Codility : Distinct - 100%")
	fun solution() {
		assertThat(distinct.solution(numbers)).isEqualTo(3)
	}

	@Test
	@DisplayName("Kotlin-Codility : Distinct - 100%")
	fun solution1() {
		assertThat(distinct.solution1(numbers)).isEqualTo(3)
	}
}
