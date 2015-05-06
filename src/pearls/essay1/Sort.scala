package pearls.essay1

import java.io.File
import scala.io.Source
import pearls.support.Utils
import scala.util.Sorting

object Sort {
  def sortUsingBitmap(file: String): Unit = {
    val difference = 1000000
    val bitMap = new Array[Boolean](9000000)
    val lines = Source.fromFile(file).getLines()
    lines.foreach {
      x => bitMap(x.toInt - difference) = true
    }
    
    Utils.printToFile(new File("resources/pearls/essay1/outputdata.txt")) {
      p => for(i <- bitMap.indices) if(bitMap(i)) p.println(i + difference) 
    }
  }
  
  def mutableQuickSort(file: String): Unit = {
    val lines = Source.fromFile(file).getLines()
    val values = lines.map[Int]( x => x.toInt ).toArray
    Sorting.quickSort(values)
    
    Utils.printToFile(new File("resources/pearls/essay1/outputdata2.txt")) {
      p => values.foreach(p.println)
    }
  }
  
  def main(args: Array[String]): Unit = {
    var start = System.currentTimeMillis()
    sortUsingBitmap("resources/pearls/essay1/inputdata.txt")
    var end = System.currentTimeMillis();
    println("소요 시간 : " + (end - start) + " millsec")
    
    start = System.currentTimeMillis()
    mutableQuickSort("resources/pearls/essay1/inputdata.txt")
    end = System.currentTimeMillis();
    println("소요 시간 : " + (end - start) + " millsec")
  }
}