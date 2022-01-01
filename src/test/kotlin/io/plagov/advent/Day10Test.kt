package io.plagov.advent

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import util.readInputFile

class Day10Test {

  private val day10 = Day10()

  private val sampleInput = readInputFile("day10-sample.txt")
  private val taskInput = readInputFile("day10.txt")

  @Test
  fun solveFirstForSampleInput() {
    assertEquals(26_397, day10.partOne(sampleInput))
  }

  @Test
  fun solveFirstForTaskInput() {
    assertEquals(167_379, day10.partOne(taskInput))
  }
}
