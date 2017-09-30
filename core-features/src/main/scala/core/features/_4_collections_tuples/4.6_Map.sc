println("******** Different ways of creating Map **********")
("k1","v1")
"k2" -> "v2"
val im = Map(1 -> "Hello", 2 -> "World")

println("******** Immutable Map - Exploring API **********")

case class OrderM(orderId: Int,
                  orderDate: String,
                  orderCustomerId: Int,
                  orderStatus: String)

val mo = Map(1 -> OrderM(1, "2017-01-01", 100, "COMPLETE"),
  2 -> OrderM(2, "2017-01-01", 20, "CLOSED"),
  3 -> OrderM(3, "2017-01-01", 30, "PENDING"))

println("=== Common APIs ===")
println(s"Check presence of key 1 : ${mo.contains(1)}")
println(s"Check presence of key 1 : ${mo.isDefinedAt(1)}")
println(s"Check presence of key 50 : ${mo.contains(50)}")

println("=== Lookup value using key ===")
println(s"The value against key -> 1 is : ${mo(1)}")
println(s"The value against key -> 2 is : ${mo.apply(2)}")

// Below will throw exception as key 50 is not present
// println(s"The value against key -> 50 is : ${mo(50)}")

// Below will not throw exception though key 50 is not present
println(s"The optional value against key -> 50 is : ${mo.get(50)}")
println(s"The optional value against key -> 3 is : ${mo.get(3)}")
println(s"The actual value against key -> 3 is : ${mo.get(3).get}")
println(s"The else value against key -> 58 is : "+mo.getOrElse(58, OrderM(58, "2017-01-01", 109, "NEW")))

println("=== Add/Remove single key->value pair and yield new map ===")
mo + (4 -> OrderM(4, "2017-01-01", 50, "NEW"))
mo - (3)

println("=== Getting sub-collections ===")
mo.keys.foreach(println)
mo.keySet.foreach(println)
mo.keysIterator.foreach(println)
mo.values.foreach(println)
mo.valuesIterator.foreach(println)

println("=== Transformations ===")
mo.filter((t: (Int, OrderM)) => t._2.orderStatus == "COMPLETE")
mo.filterKeys(key => key == 2)
mo.mapValues(o => o.orderDate)
mo.map(t => t._2.orderStatus)

println("******** Mutable Map - Exploring API **********")
val mmo = scala.collection.mutable.Map(1 -> OrderM(1, "2017-01-01", 100, "COMPLETE"),
  2 -> OrderM(2, "2017-01-01", 20, "CLOSED"),
  3 -> OrderM(3, "2017-01-01", 30, "PENDING"))

println("=== Add/Remove single key->value pair to existing map ===")
mmo += (4 -> OrderM(4, "2017-01-01", 50, "NEW"))
mmo -= (3)

