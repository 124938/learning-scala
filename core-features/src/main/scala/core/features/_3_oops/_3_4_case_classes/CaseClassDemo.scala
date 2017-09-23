package core.features._3_oops._3_4_case_classes

case class DepartmentCase(id: Int, name: String) {
  override def toString: String = s"DepartmentCase($id, $name)"
}

object DepartmentCaseTest {
  def main(args: Array[String]): Unit = {
    val d = DepartmentCase(1, "HR")
    println(s"toString() implementation : $d")
    println(s"Department Id : ${d.id}")
    println(s"Department Id : ${d.name}")
    println(s"Name of case class : ${d.productPrefix}")
    println(s"Number of elements in case class : ${d.productArity}")
    println(s"Value of first element in case class : ${d.productElement(0)}")
    println(s"Value of second element in case class : ${d.productElement(1)}")
    println("All elements of department : ")
    d.productIterator.foreach(println)
  }
}
