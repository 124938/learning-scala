import scala.io.Source

val electionFile = "/home/asus/source_code/github/124938/learning-scala/core-features/src/main/resources/ls2014.tsv"

println("*************** Find out distinct states in sorted order ************************")
Source.fromFile(electionFile)
  .getLines()
  .drop(1)
  .map((line: String) => line.split("\t")(0))
  .toSet
  .toList
  .sorted
  .foreach(println)

println("*************** Find out total number of constituencies ************************")
Source.fromFile(electionFile)
  .getLines()
  .drop(1)
  .map((line: String) => line.split("\t")(1))
  .toSet
  .size

println("*************** Find out distinct constituencies by state in sorting order ************************")
Source.fromFile(electionFile)
  .getLines()
  .drop(1)
  .map((line: String) => {
    val lineArray = line.split("\t")
    (lineArray(0), lineArray(1))
  })
  .toSet
  .toList
  .sorted
  .foreach(println)

println("*************** Find out number of constituencies by state (With max number of constituencies be first) ************************")
Source.fromFile(electionFile)
  .getLines()
  .drop(1)
  .map((line: String) => {
    val lineArray = line.split("\t")
    (lineArray(0), lineArray(1))
  })
  .toList
  .distinct
  .groupBy((t: (String, String)) => t._1)
  .map((t: (String, List[(String, String)])) => (t._1, t._2.size))
  .toList
  .sortBy((t: (String, Int)) => -t._2)
  .foreach(println)

println("*************** Find out total number of NOTAS for each state (With max number of NOTAs be first) ************************")
Source.fromFile(electionFile)
  .getLines()
  .drop(1)
  .filter(line => line.split("\t")(2).trim == "None of the Above")
  .map(line => {
    val lineArray = line.split("\t")
    (lineArray(0), lineArray(10).toInt)
  })
  .toList
  .groupBy((t: (String, Int)) => t._1)
  .map((t: (String, List[(String, Int)])) => {
    (t._1, t._2.map(g => g._2).reduce((total, ele) => total + ele))
  })
  .toList
  .sortBy((t: (String, Int)) => -t._2)
  .foreach(println)