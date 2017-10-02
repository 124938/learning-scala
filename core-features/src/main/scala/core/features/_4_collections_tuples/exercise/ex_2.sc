import scala.io.Source

val electionFile = "/home/asus/source_code/github/124938/learning-scala/core-features/src/main/resources/ls2014.tsv"

println("***** Ex-2: Find out total number of constituencies for each state (With number of constituencies in descending order) ********")
Source.fromFile(electionFile)
  .getLines()
  .drop(1)
  .map((record: String) => {
    val recordArray = record.split("\t")
    (recordArray(0).trim, recordArray(1).trim)
  })
  .toSet
  .groupBy((t: (String, String)) => t._1)
  .map((t: (String, Set[(String, String)])) => (t._1, t._2.size))
  .toList
  //.sortBy((t: (String, Int)) => -t._2)
  .sortWith((t1: (String, Int), t2: (String, Int)) => {
    if (t1._2 > t2._2)
      true
    else if (t1._2 < t2._2)
      false
    else {
      if (t1._1 < t2._1)
        true
      else
        false

    }
  })
  .foreach(println)