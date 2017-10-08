import scala.io.Source

val electionFile = "/home/asus/source_code/github/124938/learning-scala/core-features/src/main/resources/ls2014.tsv"

println("***** Ex-3: Calculate number of seats for winning party for each state (With number of seats in descending order) ********")
Source.fromFile(electionFile)
  .getLines()
  .drop(1)
  .map((record: String) => {
    val recordArray = record.split("\t")
    (recordArray(0).trim, recordArray(1).trim, recordArray(6).trim, recordArray(10).toInt)
  })
  .toList
  .groupBy((t: (String, String, String, Int)) => (t._1, t._2))
  .map((t: ((String, String), List[(String, String, String, Int)])) => {
    (t._1,
    t._2.map((g: (String, String, String, Int)) => {
      (g._3, g._4)
    })
    .reduce((winner, ele) => {
      if (winner._2 > ele._2)
        winner
      else
        ele
    }))
  })
  .map((t) => {
      (t._1._1, t._2._1, 1)
  })
  .groupBy((t: (String, String, Int)) => (t._1, t._2))
  .map((t: ((String, String), Iterable[(String, String, Int)]))  => ((t._1._1, t._1._2), t._2.size))
  .map((t: ((String, String), Int)) => (t._1._1, t._1._2, t._2))
  .toList
  .sortWith((t1, t2) => {
    if (t1._1 < t2._1)
      true
    else if (t1._1 > t2._1)
      false
    else {
      if (t1._3 > t2._3)
        true
      else
        false
    }
  })
  .foreach(println)

/*
Above result should match results available at this link:
https://en.wikipedia.org/wiki/Indian_general_election,_2014#Statewise_Results
 */