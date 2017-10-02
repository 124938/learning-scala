import scala.io.Source

val electionFile = "/home/asus/source_code/github/124938/learning-scala/core-features/src/main/resources/ls2014.tsv"

println("***** Ex-1: Find out distinct constituencies by state ********")
Source.fromFile(electionFile)
  .getLines()
  .drop(1)
  .map((record: String) => {
    val recordArray = record.split("\t")
    (recordArray(0).trim, recordArray(1).trim)
  })
  .toSet
  .toList
  .sorted
  .foreach(println)