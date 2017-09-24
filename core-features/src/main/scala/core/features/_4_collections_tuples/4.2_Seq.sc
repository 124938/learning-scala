println("***************** Usage of LinearSeq : List *******************")

val l = List(1, 2, 3, 5, 6)
println(s"Element at first position in list is -> ${l.apply(0)}")
println(s"Element at third position in list is -> ${l(2)}")
println(s"The length of list is -> ${l.length}")
println(s"The size of list is -> ${l.size}")
println(s"Index of element 3 is -> ${l.indexOf(3)}")
println(s"Index of element 256 is -> ${l.indexOf(256)}")

// Add new element -5 at the start of list, yielding a new list
val l1 = -5 +: l

// Add new element -5 at end of list, yielding a new list
val l2 = l :+ -5

println("Printing all elements from list :")
l.foreach(e => print(s"$e "))

println("***************** Usage of IndexedSeq : Array *******************")

var a = Array("Hello", "World", "How", "Are", "You")
println(s"Element at first position in array is -> ${a.apply(0)}")
println(s"Element at third position in array is -> ${a(2)}")
println(s"The length of array is -> ${a.length}")
println(s"The size of array is -> ${a.size}")
println(s"Index of element How is -> ${a.indexOf("How")}")
println(s"Index of element Shrey is -> ${a.indexOf("Shrey")}")

// Add new element "Saying" at the start of array, yielding a new array
a = "Saying" +: a

// Add new element "Saying" at the end of array, yielding a new array
a = a :+ "Saying again"

println("Printing all elements from array :")
a.toList.foreach(e => print(s"$e "))


println("***************** Usage of IndexedSeq : String (exploring API) *******************")

val s = "1,2017-01-01,100,COMPLETE"
println(s"The length of string is -> ${s.length}")
println(s"The sub-string from index 5 is -> ${s.substring(5)}")
println(s"The sub-string from index 2 to 12 is -> ${s.substring(2, 12)}")
println(s"The year extracted from string is -> ${s.substring(2, 6)}")
println("Extracting orderId using split -> "+s.split(",")(0))
println("Extracting orderDate using split -> "+s.split(",")(1))
println("Extracting orderCustomerId using split -> "+s.split(",")(2))
println("Extracting orderStatus using split -> "+s.split(",")(3))

println("***************** Usage of collection + variable arguments + case class *******************")
case class OrderSample(orderId: Int,
                       orderDate: String,
                       orderCustomerId: Int,
                       orderStatus: String)

case class OrderIdInt(oid: Int*)
println("Creating instance of OrderIdInt with variable number of Int as arguments -> "+OrderIdInt(1, 2, 3, 4))

case class OrderAny(o: Any*)
println("Creating instance of OrderAny with variable number of Any as arguments -> "+OrderAny(1, 2.0F, "Sample"))

case class OrderSamples(o: OrderSample*) {
  def toList() : List[OrderSample] = o.toList
}

println("Creating instance of OrderSamples with variable number of OrderSample as arguments -> ")
val os = OrderSamples(
  OrderSample(1, "2017-01-01", 100, "NEW"),
  OrderSample(2, "2017-01-01", 200, "PENDING"),
  OrderSample(3, "2017-01-01", 300, "CLOSED"),
  OrderSample(4, "2017-01-01", 400, "COMPLETED")
).toList()
os.foreach(println)

object CustomIntList {
  def apply(i: Int*) = i.toList
}
println("Creating list of Int from object -> "+CustomIntList(1, 2, 3, 4))


println("********** Functional way to calculate sum/min/max of square of even number ranges from 0 to 1000 *********")

// Calculate sum of square of ranges
val range = (0 to 1000).toList
val evens = range.filter(n => n % 2 == 0)
val squares = evens.map(n => n * n)
val sum = squares.reduce((total, ele) => total + ele)
val sum1 = squares.sum // Find out summation without using reduce function

println(s"Sum of square of event number ranges from o to 1000 is ${sum}")

// Calculate min of square of ranges
val min = (0 to 1000).filter(n => n % 2 == 0)
  .map(n => n * n)
  .reduce((min, ele) => {
    if (min < ele)
      min
    else
      ele
    })
val min1 = (0 to 1000).filter(n => n % 2 == 0)
  .map(n => n * n)
  .min // Find out minimum without using reduce function

println(s"Min of square of event number ranges from o to 1000 is ${min}")

// Calculate max of square of ranges
val max = (0 to 1000).filter(n => n % 2 == 0)
  .map(n => n * n)
  .reduce((max, ele) => {
    if (max > ele)
      max
    else
      ele
  })
val max1 = (0 to 1000).filter(n => n % 2 == 0)
  .map(n => n * n)
  .max // Find out maximum without using reduce function

println(s"Max of square of event number ranges from o to 1000 is ${max}")

println("********** Traditional way to find out count of orders with status 'COMPLETED' *********")

val as = List[OrderSample](
  OrderSample(1, "2017-01-01", 100, "COMPLETE"),
  OrderSample(2, "2017-01-01", 20, "CLOSED"),
  OrderSample(3, "2017-01-01", 301, "PENDING"),
  OrderSample(4, "2017-01-01", 202, "CLOSED"),
  OrderSample(5, "2017-01-01", 3013, "COMPLETE"),
  OrderSample(6, "2017-01-01", 203, "PENDING"),
  OrderSample(7, "2017-01-01", 3014, "COMPLETE"),
  OrderSample(8, "2017-01-01", 20, "NEW"),
  OrderSample(9, "2017-01-01", 301, "PENDING"),
  OrderSample(10, "2017-01-01", 2, "CLOSED"),
  OrderSample(11, "2017-01-01", 1, "COMPLETE"),
  OrderSample(12, "2017-01-01", 3, "NEW"),
  OrderSample(13, "2017-01-01", 301, "COMPLETE")
)

var co = List[OrderSample]()
for (o <- as) {
  if (o.orderStatus == "COMPLETE")
    co = co :+ o
}
println(s"Count of completed orders are : ${co.length}")

println("********** Functional way to find out count of orders with status 'COMPLETED' *********")
println("Count of COMPLETED orders are : "+as.filter(o => o.orderStatus == "COMPLETE").length)
println("Count of COMPLETED orders are : "+as.filter(o => o.orderStatus == "COMPLETE").size)
println("Count of COMPLETED orders are : "+as.count(o => o.orderStatus == "COMPLETE"))
println("Count of COMPLETED orders are : "+as.count(_.orderStatus == "COMPLETE"))
println("Count of COMPLETED orders are : "+as.filter(o => o.orderStatus == "COMPLETE").map(o => 1).sum)
println("Count of COMPLETED orders are : "+as.filter(o => o.orderStatus == "COMPLETE").map(o => 1).reduce((sum, e) => sum + e))