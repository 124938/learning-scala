package core.features._3_oops._3_1_objects

/**
  * Create object for nCr formula i.e. n! / (r! * (n-r)!)
  */
object Combination {

  def nCr(n: Int, r: Int) :Int = {

    def factR(number: Int) :Int = {
      if (number == 1) 1 else number * factR(number - 1)
    }

    factR(n) / (factR(r) * factR(n-r))
  }

  def main(args: Array[String]) :Unit = {
    val n = 6
    val r = 3
    val c = nCr(n, r)
    println(s"There are $c combination of $r in $n elements")
  }
}
