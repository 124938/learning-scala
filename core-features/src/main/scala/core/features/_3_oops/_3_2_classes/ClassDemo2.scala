package core.features._3_oops._3_2_classes

/**
  * Default constructor of Department class with two arguments
  * @param id - Id of department
  * @param name - Name of department
  */
class Department(val id: Int, val name: String) {

  // All non functional code will be part of default constructor
  println("Begin of default constructor")
  println(s"Default  constructor initialized with (id=$id, name=$name)")
  require(id > 0, "department id must be positive")
  println("End of default constructor")

  /**
    * Constructor with one argument
    * @param id - Id of department
    */
  def this(id: Int) = {
    // Calling default constructor must be the first line of non default constructor
    this(id, "Resource Management Group")
    println("Constructor initialized with one argument")
  }

  /**
    * Implementation of toString
    * @return - String representation of Department object
    */
  override def toString = s"Department($id, $name)"
}

object DepartmentTest {
  def main(args: Array[String]) :Unit = {
    println("**** Creating instance with default constructor ****")
    val d1 = new Department(1, "HR")
    println(s"$d1")

    println("**** Creating instance with one argument constructor ****")
    val d2 = new Department(2)
    println(s"$d2")
  }
}
