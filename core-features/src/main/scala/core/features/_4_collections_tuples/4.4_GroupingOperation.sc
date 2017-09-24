println("**************** Basic way of grouping data **************")
val l = (0 to 100).toList
val g = l.partition(n => n % 2 == 0)
println(s"Even number list : ${g._1}")
println(s"Odd  number list : ${g._2}")


println("**************** Usage of groupBy method **************")
case class OrderGp(orderId: Int,
                   orderDate: String,
                   orderCustomerId: Int,
                   orderStatus: String)

val og = List[OrderGp](
  OrderGp(1, "2017-01-01", 100, "COMPLETE"),
  OrderGp(2, "2017-01-01", 20, "CLOSED"),
  OrderGp(3, "2017-01-01", 301, "PENDING"),
  OrderGp(4, "2017-01-01", 202, "CLOSED"),
  OrderGp(5, "2017-01-01", 3013, "COMPLETE"),
  OrderGp(6, "2017-01-01", 203, "PENDING"),
  OrderGp(7, "2017-01-01", 3014, "COMPLETE"),
  OrderGp(8, "2017-01-01", 20, "NEW"),
  OrderGp(9, "2017-01-01", 301, "PENDING"),
  OrderGp(10, "2017-01-01", 2, "CLOSED"),
  OrderGp(11, "2017-01-01", 1, "COMPLETE"),
  OrderGp(12, "2017-01-01", 3, "NEW"),
  OrderGp(13, "2017-01-01", 301, "COMPLETE")
)

println("=== Find out number of order by status ===")
og.groupBy(o => o.orderStatus)
  .map((t: (String, List[OrderGp])) => (t._1, t._2.size))
  .foreach(println)

println("=== Find out number of order by date & customer id with sorting count of orders in descending order===")
og.groupBy(o => (o.orderDate, o.orderCustomerId))
  .map((t: ((String, Int), List[OrderGp])) => (t._1, t._2.size))
  .toList
  .sortWith((s1, s2) => {
    if (s1._2 > s2._2)
      true
    else
      false
  })
  .foreach(println)