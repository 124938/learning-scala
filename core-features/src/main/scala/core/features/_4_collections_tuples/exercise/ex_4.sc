import scala.io.Source

val electionFile = "/home/asus/source_code/github/124938/learning-scala/core-features/src/main/resources/ls2014.tsv"

println("***** Ex-3: Calculate the percentage of polled votes of each party ********")
// number of votes per party across all the constituencies / total number of votes all the constituencies
val totalVotes = Source.fromFile(electionFile)
  .getLines()
  .drop(1)
  .filter((record: String) => record.split("\t")(2) != "None of the Above")
  .map((record: String) => record.split("\t")(10).toInt)
  .sum

Source.fromFile(electionFile)
  .getLines()
  .drop(1)
  .filter((record: String) => record.split("\t")(2) != "None of the Above")
  .map((record: String) => {
    val recordArray = record.split("\t")
    (recordArray(6).trim, recordArray(10).toInt)
  })
  .toList
  .groupBy((t: (String, Int)) => t._1)
  .map((t: (String, List[(String, Int)])) => {
    val party = t._1
    val partyVotes = t._2.map((k: (String, Int)) => k._2)
      .sum
      .toDouble
    val percentage = BigDecimal((partyVotes / totalVotes) * 100)
      .setScale(4, BigDecimal.RoundingMode.HALF_UP)
      .toDouble
    (party, percentage)
  })
  .toList
  .sortBy((t: (String, Double)) => -t._2)
  .foreach(println)
