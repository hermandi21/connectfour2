package model

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class MatrixSpec extends AnyFlatSpec with Matchers {

  "A Matrix" should "be created with the correct size" in {
    val matrix = new Matrix[Int](3, 3, (row, col) => row * col)
    matrix.size should be (3)
  }

  it should "return the correct cell value" in {
    val matrix = new Matrix[Int](3, 3, (row, col) => row * col)
    matrix.cell(1, 2) should be (2)
  }

  it should "fill the matrix with the correct value" in {
    val matrix = new Matrix[Int](3, 3, (row, col) => row * col)
    val filledMatrix = matrix.fill(5)
    filledMatrix.cell(1, 2) should be (5)
  }

  it should "replace a cell with the correct value" in {
    val matrix = new Matrix[Int](3, 3, (row, col) => row * col)
    val updatedMatrix = matrix.replaceCell(1, 2, 5)
    updatedMatrix.cell(1, 2) should be (5)
  }

  it should "throw an exception when accessing a cell out of bounds" in {
    val matrix = new Matrix[Int](3, 3, (row, col) => row * col)
    an [IndexOutOfBoundsException] should be thrownBy matrix.cell(3, 3)
  }

  it should "throw an exception when replacing a cell out of bounds" in {
    val matrix = new Matrix[Int](3, 3, (row, col) => row * col)
    an [IndexOutOfBoundsException] should be thrownBy matrix.replaceCell(3, 3, 5)
  }
  
  it should "allow accessing a cell" in {
    val matrix = Matrix(Vector(Vector(1, 2), Vector(3, 4)))
    matrix.cell(0, 0) should be(1)
    matrix.cell(0, 1) should be(2)
    matrix.cell(1, 0) should be(3)
    matrix.cell(1, 1) should be(4)
  }

  it should "allow filling with a value" in {
    val matrix = Matrix(Vector(Vector(1, 2), Vector(3, 4)))
    val filledMatrix = matrix.fill(0)
    filledMatrix.cell(0, 0) should be(0)
    filledMatrix.cell(0, 1) should be(0)
    filledMatrix.cell(1, 0) should be(0)
    filledMatrix.cell(1, 1) should be(0)
  }

  it should "allow replacing a cell" in {
    val matrix = Matrix(Vector(Vector(1, 2), Vector(3, 4)))
    val replacedMatrix = matrix.replaceCell(0, 0, 0)
    replacedMatrix.cell(0, 0) should be(0)
    replacedMatrix.cell(0, 1) should be(2)
    replacedMatrix.cell(1, 0) should be(3)
    replacedMatrix.cell(1, 1) should be(4)
  }

  
}
