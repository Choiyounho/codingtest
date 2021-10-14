package com.soten.programers.level3

fun main() {
	println(
		solution(
			arrayOf("classic", "pop", "classic", "classic", "pop"),
			intArrayOf(500, 600, 150, 800, 2500)
		).contentToString()
	)
}

private fun solution(genres: Array<String>, plays: IntArray): IntArray {
	val genresSet = genres.toSet()

	val genresMap = mutableMapOf<String, MutableList<Song>>()
	genresSet.forEach {
		genresMap[it] = mutableListOf()
	}

	for (i in genres.indices) {
		genresMap[genres[i]]?.add(Song(i, plays[i]))
	}

	var streamingMap = mutableMapOf<String, Int>()

	genresMap.forEach {
		streamingMap[it.key] = it.value.sumBy { it.streaming }
		val list = it.value.sortedByDescending { song ->
			song.streaming
		}.toMutableList()
		genresMap[it.key] = list
	}

	val list = streamingMap.toList().sortedByDescending { it.second }
	streamingMap = list.toMap().toMutableMap()

	val answerList = mutableListOf<Int>()

	streamingMap.forEach {
		if (genresMap[it.key]?.size == 1) {
			answerList.add(genresMap[it.key]?.first()!!.id)
		} else {
			genresMap[it.key]?.get(0)?.let { it1 -> answerList.add(it1.id) }
			genresMap[it.key]?.get(1)?.let { it1 -> answerList.add(it1.id) }
		}
	}
	return answerList.toIntArray()
}

data class Song(
	val id: Int,
	val streaming: Int
)


