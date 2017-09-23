package core.features._3_oops._3_3_companion_objects

class DepartmentApplyCompanion(val id: Int, val name: String) {
  println("Begin of default constructor")
  require(id > 0, "Department id must be positive")
  println("End of default constructor")

  def this(id: Int) = {
    this(id, "Resource Management Group")
    println("Constructor initialized with one argument")
  }

  def apply(s: String) = {
    println(s"Hello $s")
  }

  override def toString = s"DepartmentApplyCompanion($id, $name)"
}

object DepartmentApplyCompanion {
  // All non functional code will get initialized (Same as singleton object initialization in java)
  println("Companion object initialization - one time only")

  def apply(id: Int) :DepartmentApplyCompanion = new DepartmentApplyCompanion(id)

  def apply(id: Int, name: String) :DepartmentApplyCompanion = new DepartmentApplyCompanion(id, name)
}

object DepartmentApplyCompanionTest {
  def main(args: Array[String]): Unit = {
    println("****** Object initialization using apply method of companion object *****")
    println("---------------------------------------")
    println(DepartmentApplyCompanion.apply(1))
    println("---------------------------------------")
    println(DepartmentApplyCompanion(1)) // Without using apply method
    println("---------------------------------------")
    println(DepartmentApplyCompanion.apply(2, "HR"))
    println("---------------------------------------")
    println(DepartmentApplyCompanion(2, "HR")) // Without using apply method
    println("---------------------------------------")

    println("****** Usage of apply method under class *****")
    println("---------------------------------------")
    val d = DepartmentApplyCompanion(3, "Operations")
    println("---------------------------------------")
    d.apply("World 1")
    println("---------------------------------------")
    d("World 2") // Without using apply method
    println("---------------------------------------")
  }
}