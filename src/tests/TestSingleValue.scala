package tests

import genetics.GeneticAlgorithm
import genetics.geometry.SingleValue
import org.scalatest.FunSuite

class TestSingleValue extends FunSuite {

  val EPSILON: Double = 0.05

  def equalDoubles(d1: Double, d2: Double): Boolean = {
    (d1 - d2).abs < EPSILON
  }


  test("Genetic Algorithm Finds a Single Number") {
    val hiddenNumber = 50.0
    val numberOfGenes = 1
    val computed = GeneticAlgorithm.geneticAlgorithm(SingleValue.incubator, SingleValue.costFunction(hiddenNumber), numberOfGenes)
    println(computed.value)
    assert(equalDoubles(hiddenNumber, computed.value))
  }

}
