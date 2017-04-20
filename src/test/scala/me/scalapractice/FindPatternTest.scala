package me.scalapractice

import FindPattern
import org.scalatest.FlatSpec

class FindPatternTest extends FlatSpec {

  val pattern1 = "ababababab"
  val result1 = "ab"

  val pattern2 = "accaccaccacc"
  val result2 = "acc"

  val pattern3 = "1233211233211"
  val result3 = "123321"

  val pattern4 = "0001000100"
  val result4 = "0001"

  val pattern5 = "1234567"
  val result5 = "1234567"

  val pattern6 = "ababdbabb"
  val result6 = "ababdbabb"

  val pattern7 = "ababcabab"
  val result7 = "ababc"

  val pattern8 = "1232123"
  val result8 = "1232"

  val pattern9 = "aaaabaa"
  val result9 = "aaaab"

  "pattern1 " should "return result1" in {
    val x = FindPattern.findPattern(pattern1)
    assert(FindPattern.findPattern(pattern1) == result1)
  }

  "pattern2 " should "return result2" in {
    assert(FindPattern.findPattern(pattern2) == result2)
  }

  "pattern3 " should "return result3" in {
    assert(FindPattern.findPattern(pattern3) == result3)
  }

  "pattern4 " should "return result4" in {
    assert(FindPattern.findPattern(pattern4) == result4)
  }

  "pattern5 " should "return result5" in {
    assert(FindPattern.findPattern(pattern5) == result5)
  }

  "pattern6 " should "return result6" in {
    assert(FindPattern.findPattern(pattern6) == result6)
  }

  "pattern7 " should "return result7" in {
    assert(FindPattern.findPattern(pattern7) == result7)
  }

  "pattern8 " should "return result8" in {
    assert(FindPattern.findPattern(pattern8) == result8)
  }

  "pattern9 " should "return result9" in {
    assert(FindPattern.findPattern(pattern9) == result9)
  }

}
