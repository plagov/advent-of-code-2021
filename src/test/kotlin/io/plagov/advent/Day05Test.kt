package io.plagov.advent

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import util.readInputFile

class Day05Test : ShouldSpec({

  val day5 = Day05()

  val sampleInput = readInputFile("day05-sample.txt")
  val realInput = readInputFile("day05.txt")

  should("day 5, part 1 - sample") {
    day5.numberOfOverlappingPointsOfHorizontalAndVerticalLines(sampleInput) shouldBe 5
  }

  should("day 5, part 1 - task") {
    day5.numberOfOverlappingPointsOfHorizontalAndVerticalLines(realInput) shouldBe 5576
  }

  should("day 5, part 2 - sample") {
    day5.numberOfOverlappingPointsForAllLines(sampleInput) shouldBe 12
  }

  should("day 5, part 2 - task") {
    day5.numberOfOverlappingPointsForAllLines(realInput) shouldBe 18144
  }
})
