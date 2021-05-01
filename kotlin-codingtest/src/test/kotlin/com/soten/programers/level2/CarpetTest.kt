package com.soten.programers.level2

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class CarpetTest {

	private val carpet = Carpet()

	@Test
	@DisplayName("Java-Level2 : 카펫")
	fun test() {
		assertThat(carpet.solution(50, 22)).isEqualTo(intArrayOf(24, 3))
	}

}
