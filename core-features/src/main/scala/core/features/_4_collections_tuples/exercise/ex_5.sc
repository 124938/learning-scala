import scala.io.Source

val electionFile = "/home/asus/source_code/github/124938/learning-scala/core-features/src/main/resources/ls2014.tsv"

println("***** Ex-5: Get top 10 candidates by margin (for each state per constituency) ********")

case class Candidate(state: String, const: String, candName: String, party: String, votes: Int, var margin: Int)

Source.fromFile(electionFile)
  .getLines()
  .drop(1)
  .map((rec: String) => {
    val recArray = rec.split("\t")
    (recArray(0).trim, recArray(1).trim, recArray(2).trim, recArray(6).trim, recArray(10).toInt)
  })
  .toList
  .groupBy((t: (String, String, String, String, Int)) => (t._1, t._2))
  .toList
  .sortWith((s1, s2) => {
    if (s1._1._1 < s2._1._1)
      true
    else if (s1._1._1 > s2._1._1)
      false
    else {
      if (s1._1._2 < s2._1._2)
        true
      else
        false
    }
  })
  .flatMap((t: ((String, String), List[(String, String, String, String, Int)])) => {
    val candidate = t._2.map((input: (String, String, String, String, Int) ) => {
      Candidate(input._1, input._2, input._3, input._4, input._5, 0)
    })
    .sortBy(rec => -rec.votes)
    .take(11)

    for (index <- 0 to candidate.size-2) {
      candidate(index).margin = candidate(index).votes - candidate(index+1).votes
    }
    candidate.take(10)
  })
  .map((c: Candidate) => (c.state, c.const, c.party, c.candName, c.votes, c.margin))
  .foreach(println)
