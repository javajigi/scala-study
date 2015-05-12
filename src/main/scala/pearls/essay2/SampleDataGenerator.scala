package pearls.essay2

import java.io.File

import scala.Range
import scala.util.Random

import pearls.support.Utils

object SampleDataGenerator {
	val prefix = "resources/pearls/essay2/"
	
	def generate(file: String) {
		val shuffles = Random.shuffle(Range(0, 1000).toList)
    val splitedShuffles = shuffles.take(999)
    printToFile(prefix + file, splitedShuffles)
	}
	
	private def printToFile(file: String, numbers: List[Int]) {
		Utils.withPrintWriter(new File(file)) {
      p => numbers.foreach(p.println)
    }
	}
	
  def main(args: Array[String]): Unit = {
  	generate("missfiledata.txt")
  }
}