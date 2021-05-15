package com.soten.leetcode

import java.util.LinkedList


/*
   / 있으면 무시, . 한개 무시 .. 앞에 디렉토리 들어가기 ...은 파일 이름
 */

fun simplifyPath(path: String): String {

	val splits: List<String> = path.split("/")
	val linkedList = LinkedList<String>()

	for (i in splits) {
		if (i == "" || i == ".") { // 지나치는 조건 '.' 은 현재 디렉토리 들어가기고, 빈칸은 경로입니다.
			continue
		} else if (i == "..") {        // ..이 된다면 바로 앞에 있는 경로로 다시 들어갑니다.
			if (!linkedList.isEmpty()) { // 큐에 아무것도 없다면, 아무일도 일어나지 않은 것, 무엇이 존재한다면 맨 앞을 제거, 이유는 상위 디렉토리로 가는 것이기 떄문
				linkedList.removeFirst()
			}
		} else {
			linkedList.offerFirst(i) // 문자가 들어있다면 경로로 인정하고 맨앞에 넣는다.
		}
	}

	var answer = ""

	if (linkedList.isEmpty()) {
		linkedList.offer("")
	}

	while (!linkedList.isEmpty()) {
		answer += "/" + linkedList.removeLast()
	}
	return answer

}

fun main() {
	println(simplifyPath("//a/../b/c/d/./../"))

}
