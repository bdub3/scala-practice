package me.scalapractice

import java.util.Scanner

object FindPattern extends App {

  args.length match {
    case 1 => Console.println(findPattern(args(0)))
    case 0 =>
      val sc = new Scanner(System.in)
      val line = if (sc.hasNextLine) sc.nextLine() else None
      if (line == None)
        Console.println("Error: input string needed")
      else
        Console.println(findPattern(line.toString))
    case _ => Console.println("Error: args accepts exactly one input string")
  }

  def findPattern(input: String) = {
    var currentShortestPattern = input.substring(0, 1)
    var patternPosition = 0

    (for (i <- 1 to input.length-1) yield {
      if (input(i) != currentShortestPattern(patternPosition) ||
        (i < input.length-1 && input(i+1) != currentShortestPattern((patternPosition+1) % currentShortestPattern.length))) {
        patternPosition = 0
        currentShortestPattern = input.substring(0, i+1)
        currentShortestPattern
      }
      else {
        patternPosition = (patternPosition + 1) % currentShortestPattern.length
        currentShortestPattern
      }
    }).last
  }

  System.exit(0)
}

