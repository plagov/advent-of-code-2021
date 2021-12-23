package io.plagov.advent

import util.readInputFile

class Day9 {
}

fun main() {
  val input = readInputFile("day09-sample.txt")

  val heightmap = mutableListOf<List<Int>>()

  for (currentLineIndex in input.indices) {
    val currentLine = input[currentLineIndex]
    val previousLine = input.getOrNull(currentLineIndex - 1)
    val nextLine = input.getOrNull(currentLineIndex + 1)
    for (currentNumberIndex in currentLine.indices) {
      val currentNumber = currentLine[currentNumberIndex]
      val previousNumber = currentLine.getOrNull(currentNumberIndex - 1)
      val nextNumber = currentLine.getOrNull(currentNumberIndex + 1)
      val location = mutableListOf<Char>()
      location.add(currentNumber)
      if (previousNumber != null) location.add(previousNumber)
      if (nextNumber != null) location.add(nextNumber)
      if (previousLine != null) location.add(previousLine[currentNumberIndex])
      if (nextLine != null) location.add(nextLine[currentNumberIndex])
      heightmap.add(location.map { it.digitToInt() })
    }
  }
  println("")
}
