package plinscala.spiral

import org.junit.Assert._
import org.junit.{Before, Test}

class SpiralTest {
  private var spiral: Spiral = _

  @Before
  def setup(): Unit = {
    spiral = new Spiral
  }

  @Test
  def goDirection(): Unit = {
    val direction = spiral.goDirection(3, new West)
    direction.foreach(println)
  }

  @Test
  def createSpiralArray(): Unit = {
    val spiralArray = spiral.createSpriral(List[String](), 6, new East)
    spiralArray.foreach(println)
  }

  @Test
  def myspiral(): Unit = {
    val length = 10
    val stream = spiral.createSpriral(List[String](), length, new East)
    val matrix = spiral.spiral(stream, Array.ofDim(length, length), (0, 0), new East)
    spiral.drawSpiral(matrix)
  }

  @Test
  def range: Unit = {
    assertEquals(3, (0 until 3).length)
    assertEquals(4, (0 to 3).length)
  }
}
