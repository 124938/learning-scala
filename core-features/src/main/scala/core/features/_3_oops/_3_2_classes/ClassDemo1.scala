package core.features._3_oops._3_2_classes

/**
  * Below class does not provide getter/setter methods for attributes id & name
  * Execute :javap -p DepartmentTemp command from REPL to print the metadata of class DepartmentTemp
 */
class DepartmentTemp(id: Int, name: String)

/**
  * Below class provides only getter methods for attributes id & name
  * Execute :javap -p DepartmentGetterTemp command from REPL to print the metadata of class DepartmentTemp
  */
class DepartmentGetterTemp(val id: Int, val name: String)

/**
  * Below class provides getter/setter methods for attributes id & name
  * Execute :javap -p DepartmentGetterSetterTemp command from REPL to print the metadata of class DepartmentTemp
  */
class DepartmentGetterSetterTemp(var id: Int, var name: String)

object DepartmentTempTest {
  def main(args: Array[String]) :Unit = {
    val d1 = new DepartmentTemp(1, "HR")
    println("d1 -> "+d1.toString)

    val d2 = new DepartmentGetterTemp(2, "Finance")
    println("d2 -> (id="+d2.id+", name="+d2.name+")")

    val d3 = new DepartmentGetterSetterTemp(3, "Admin")
    println("d3 -> (id="+d3.id+", name="+d3.name+")")

    // Apply first change
    d3.id = 30
    d3.name = "Admin - Operation"
    println("d3 (After first changes)  -> (id="+d3.id+", name="+d3.name+")")

    // Apply second change
    d3.id = 31
    d3.name = "Admin - Operation & Research"
    println("d3 (After second changes) -> (id="+d3.id+", name="+d3.name+")")

  }
}