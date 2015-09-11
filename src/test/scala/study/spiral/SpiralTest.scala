package study.spiral

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
    val spiralArray = spiral.createSprialArray(List[String](), 6, new West)
    spiralArray.foreach(println)
  }

  @Test
  def spiralStreamToMatrix(): Unit = {
    val stream = List("-", "-", "+")
    val matrix = spiral.spiralStreamToMatrix(
    spiralArray.foreach(println)
  }

  @Test
  def range: Unit = {
    assertEquals(3, (0 until 3).length)
    assertEquals(4, (0 to 3).length)
  }
}
