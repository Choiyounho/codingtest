package com.soten.programers.level2

import java.util.*

private fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
	var answer = 0

	val truckWeights = LinkedList<Int>() // 트럭들  truck_weights -> 큐로 변환 //  주어진 트럭 무게들

	for (i in truck_weights.indices) {
		truckWeights.offer(truck_weights[i])
	}

	val current = ArrayList<Truck>()  // (무게, 현재 거리) 현재 다리에 있는 트럭 리스트

	while (true) {
		answer++
		if (current.isNotEmpty()) { // 다리에 트럭이 있으면
			if (current[0].length == bridge_length) { // 맨 앞에 있는 트럭의 거리가 다리길이와 갔다면 건넘 처리
				current.removeAt(0)
			}
		}

		plusLength(current) // 트럭들 한칸씩 앞으로

		if (truckWeights.isNotEmpty()) {
			// 다리에 있는 트럭들 무게 + 건너지 않은 트럭 중 맨 앞에있는 트럭과 무게 합이 다리가 견딜 수 있는 무게보다 적고,
			// 다리에 있을 수 있는 트럭 개수
			if (currentTruckWeights(current) + truckWeights.peek() <= weight && current.size <= bridge_length) { // 다리에있는 트럭들 무게
				current.add(Truck(truckWeights.poll())) // 제한 사항이 안 된다면 트럭 하나 추가
			}
		}

		if (current.isEmpty() && truckWeights.isEmpty()) {
			break
		}
	}

	return answer
}

private fun currentTruckWeights(list: List<Truck>): Int { // 현재 다리에 있는 트럭들의 무게 합
	var count = 0
	if (list.isNotEmpty()) {
		for (i in list.indices) {
			count += list[i].truckWeight
		}
	}
	return count
}

private fun plusLength(list: List<Truck>) { // 다리들 한칸씩 앞으로 가는 메서드
	if (list.isNotEmpty()) {
		for (i in list.indices) {
			list[i].length++
		}
	}
}

data class Truck(
	val truckWeight: Int,
	var length: Int = 1
)

fun main() {
	println(solution(2, 10, intArrayOf(7, 4, 5, 6))) // 8

	println(solution(100, 100, intArrayOf(101))) // 101

	println(solution(100, 100, intArrayOf(10, 10, 10, 10, 10, 10, 10, 10, 10, 10))) // 110
}


/**
 * bridge_length : 다리 길이
 *
 * weight : 다리가 버틸 수 있는 무게
 *
 * truck_weights : 트럭들의 무게
 *
 * 트럭이 건너는 데에는 2초가 걸림
 * */
