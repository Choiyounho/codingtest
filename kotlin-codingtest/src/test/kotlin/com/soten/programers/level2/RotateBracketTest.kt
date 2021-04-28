package com.soten.programers.level2

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class RotateBracketTest {

	private val rotateBracket = RotateBracket()

	@Test
	@DisplayName("Kotlin - Level2 : 괄호 회전하기")
	fun test() {
		assertThat(rotateBracket.solution("[](){}")).isEqualTo(3)
	}
}
