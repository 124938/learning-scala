println("******** Way of creating tuple *********")

println("=== Creating tuple with 2 elements ===")
(1, "Hello") // If tuple contains 2 elements then it can be considered as map

println("=== Creating tuple with 4 elements ===")
(1, 2.0F, 3.1425D, "Hello", "World")


println("=== Creating tuple with case class as element ===")
case class OrderT(orderId: Int,
                  orderDate: String,
                  orderCustomerId: Int,
                  orderStatus: String)

val t = (1, "Hello", 2.0, OrderT(1, "2017-01-01", 100, "COMPLETE"))
println(s"First element of tuple : ${t._1}")
println(s"Second element of tuple : ${t._2}")
println(s"Third element of tuple : ${t._3}")
println(s"Fourth element of tuple : ${t._4}")

println("=== Creating tuple with collection as element ===")
val tc = (1, "Hello", 2.0, Set(OrderT(1, "2017-01-01", 100, "COMPLETE"),
  OrderT(25, "2017-01-01", 1, "CLOSED"),
  OrderT(30, "2017-01-01", 2, "NEW"),
  OrderT(15, "2017-01-01", 3, "PENDING")))

println("Find out total number of orders from fourth element of tuple")
tc._4.size

println("Find out max order details from fourth element of tuple")
tc._4.reduce((o1: OrderT, o2: OrderT) => if (o1.orderId > o2.orderId) o1 else o2)

println("Filter out PENDING orders from fourth element of tuple")
tc._4.filter((o: OrderT) => o.orderStatus == "PENDING")

println("=== Creating collection with tuple as element ===")
val listOfTuple = List(
  (1, Set(
    OrderT(1, "2017-01-01", 100, "COMPLETE"),
    OrderT(2, "2017-01-01", 20, "CLOSED"),
    OrderT(3, "2017-01-01", 301, "PENDING"),
    OrderT(4, "2017-01-01", 202, "CLOSED"),
    OrderT(5, "2017-01-01", 3013, "COMPLETE"),
    OrderT(6, "2017-01-01", 203, "PENDING"),
    OrderT(7, "2017-01-01", 3014, "COMPLETE"),
    OrderT(8, "2017-01-01", 20, "NEW"),
    OrderT(9, "2017-01-01", 301, "PENDING"),
    OrderT(10, "2017-01-01", 2, "CLOSED"),
    OrderT(11, "2017-01-01", 1, "COMPLETE"),
    OrderT(12, "2017-01-01", 3, "NEW"),
    OrderT(13, "2017-01-01", 301, "COMPLETE"))
  ),
  (2, Set(
    OrderT(1, "2017-01-01", 100, "COMPLETE"),
    OrderT(2, "2017-01-01", 20, "CLOSED"),
    OrderT(3, "2017-01-01", 301, "PENDING"),
    OrderT(4, "2017-01-01", 202, "CLOSED"),
    OrderT(5, "2017-01-01", 3013, "COMPLETE"),
    OrderT(6, "2017-01-01", 203, "PENDING"),
    OrderT(7, "2017-01-01", 3014, "COMPLETE"),
    OrderT(8, "2017-01-01", 20, "NEW"),
    OrderT(9, "2017-01-01", 301, "PENDING"),
    OrderT(10, "2017-01-01", 2, "CLOSED"),
    OrderT(11, "2017-01-01", 1, "COMPLETE"),
    OrderT(12, "2017-01-01", 3, "NEW"),
    OrderT(13, "2017-01-01", 301, "COMPLETE"))
  ))
println("Find out total number of orders in each tuple")
listOfTuple.map((t: (Int, Set[OrderT])) => (t._1, t._2.size))
.foreach(println)

println("Find out COMPLETED orders in each tuple")
listOfTuple.map((t: (Int, Set[OrderT])) => (t._1, t._2.filter(o => o.orderStatus == "COMPLETE")))
.foreach(println)