package com.soten.programers.level2

fun main() {

}

private fun solution(word: String): Int {
    var answer = 0
    val number = hashMapOf<Char, Int>()
    number['A'] = 0
    number['E'] = 1
    number['I'] = 2
    number['O'] = 3
    number['U'] = 4

    val array = arrayOf(781, 156, 31, 6, 1)

    for (i in word.indices) {
        answer += number[word[i]]!! * array[i] + 1
    }
    return answer
}