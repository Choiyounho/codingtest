package com.soten.codility

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class MaxProductOfThreeTest {

	private val maxProductOfThree = MaxProductOfThree()
	private val intArray = intArrayOf(-5, -6, -4, -7, -10)

	@Test
	@DisplayName("Kotlin-Codility : MaxProductOfThree - 100%")
	fun solution() {
		assertThat(maxProductOfThree.solution(intArray)).isEqualTo(-120)
	}
}
