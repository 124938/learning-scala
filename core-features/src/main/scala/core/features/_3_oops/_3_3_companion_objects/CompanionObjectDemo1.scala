package core.features._3_oops._3_3_companion_objects

class DepartmentCompanion(val id: Int, val name: String) {
  println("Begin of default constructor")
  require(id > 0, "Department id must be positive")
  println("End of default constructor")

  def this(id: Int) = {
    this(id, "Resource Management Group")
    println("Constructor initialized with 1 argument")
  }

  private def classPrint(s: String) = {
    println("### Begin of classPrint method ###")
    println(s"Hello $s from class")
    println("### End of classPrint method ###")
  }

  override def toString = s"DepartmentCompanion($id, $name)"
}

object DepartmentCompanion {
  // All non functional code will get initialized (Same as singleton object initialization in java)
  println("Companion object initialization - one time only")

  def objectPrint(s: String) = {
    println("### Begin of objectPrint method ###")
    val c = new DepartmentCompanion(1)
    c.classPrint("world")
    println("### End of objectPrint method ###")
  }
}

object DepartmentCompanionTest {
  def main(args: Array[String]) :Unit = {
    println("========= Usage of class ===========")
    val d = new DepartmentCompanion(1)
    println(d)

    println("========= Usage of companion object ===========")
    println(DepartmentCompanion.objectPrint("world"))
  }
}
