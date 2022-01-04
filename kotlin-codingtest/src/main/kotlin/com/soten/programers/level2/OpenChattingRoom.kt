package com.soten.programers.level2

import java.util.*

fun main() {
    solution(arrayOf("Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"))
}

private fun solution(record: Array<String>): Array<String> {
    var answer = mutableListOf<String>()

    val chatLogQueue = LinkedList<Pair<String, String>>()

    val userTable = hashMapOf<String, String>()

    var splitList = listOf<String>()
    for (log in record) {
        when {
            log.startsWith("E") -> {
                splitList = log.split(" ")
                userTable[splitList[1]] = splitList[2] // 1 인덱스는 uid 2 인덱스는 닉네임

                chatLogQueue.offer(Pair("E", splitList[1]))
            }

            log.startsWith("L") -> {
                splitList = log.split(" ")
                chatLogQueue.offer(Pair("L", splitList[1]))
            }

            log.startsWith("C") -> {
                splitList = log.split(" ")
                userTable[splitList[1]] = splitList[2]
            }
        }
    }

    while (!chatLogQueue.isEmpty()) {
        val log = chatLogQueue.poll()
        if (log.first == "E") {
            answer.add("${userTable[log.second]}님이 들어왔습니다.")
        } else {
            answer.add("${userTable[log.second]}님이 나갔습니다.")
        }
    }

    return answer.toTypedArray()
}