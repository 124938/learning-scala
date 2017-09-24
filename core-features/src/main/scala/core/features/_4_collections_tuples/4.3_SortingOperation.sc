println("**************** Usage of sorted method in collection **************")
val l = List(3, 1, 2, 4, 5, 8, 4, 5, 3, 6, 9, 10)

// Sorted elements in ascending order (As implicit ordering is defined on Int class, sorting is allowed here)
l.sorted

// Sorted elements in descending order (by reversing the ascending data)
l.reverse

println("**************** Usage of sortBy method in collection **************")
case class OrderSt(orderId: Int,
                  orderDate: String,
                  orderCustomerId: Int,
                  orderStatus: String)
val os = List[OrderSt](
  OrderSt(1, "2017-01-01", 100, "COMPLETE"),
  OrderSt(2, "2017-01-01", 20, "CLOSED"),
  OrderSt(3, "2017-01-01", 301, "PENDING"),
  OrderSt(4, "2017-01-01", 202, "CLOSED"),
  OrderSt(5, "2017-01-01", 3013, "COMPLETE"),
  OrderSt(6, "2017-01-01", 203, "PENDING"),
  OrderSt(7, "2017-01-01", 3014, "COMPLETE"),
  OrderSt(8, "2017-01-01", 20, "NEW"),
  OrderSt(9, "2017-01-01", 301, "PENDING"),
  OrderSt(10, "2017-01-01", 2, "CLOSED"),
  OrderSt(11, "2017-01-01", 1, "COMPLETE"),
  OrderSt(12, "2017-01-01", 3, "NEW"),
  OrderSt(13, "2017-01-01", 301, "COMPLETE")
)

// As implicit ordering is not defined on OrderSt class, sorting is not allowed here
// os.sorted

println("=== Sort orders by customer id in ascending order ===")
os.sortBy(o => o.orderCustomerId)
.foreach(println)

println("=== Sort orders by customer id in descending order ===")
// Here - can be used only for val classes i.e. Int, Float, Double etc.
os.sortBy(o => -o.orderCustomerId)
  .foreach(println)

println("=== Sort orders by status in ascending order ===")
os.sortBy(o => o.orderStatus)
  .foreach(println)


println("**************** Usage of sortWith method in collection **************")

val orders = List[String](
  "1,2017-01-01,100,COMPLETE",
  "2,2017-01-01,20,CLOSED",
  "3,2017-01-01,301,PENDING",
  "4,2017-01-01,202,CLOSED",
  "5,2017-01-01,3013,COMPLETE",
  "6,2017-01-01,203,PENDING",
  "7,2017-01-01,3014,COMPLETE",
  "8,2017-01-01,20,NEW",
  "9,2017-01-01,301,PENDING",
  "10,2017-01-01,2,CLOSED",
  "11,2017-01-01,1,COMPLETE",
  "12,2017-01-01,3,NEW",
  "13,2017-01-01,301,COMPLETE"
)

println("=== Sort orders by customer id in ascending order ===")
orders.sortWith((o1, o2) => {
  if (o1.split(",")(2).toInt < o2.split(",")(2).toInt)
    true
  else
    false
})
  .foreach(println)

println("=== Sort orders by customer id in descending order ===")
orders.sortWith((o1, o2) => {
  if (o1.split(",")(2).toInt > o2.split(",")(2).toInt)
    true
  else
    false
})
  .foreach(println)

println("=== Sort orders by status in ascending order ===")
orders.sortWith((o1, o2) => {
  if (o1.split(",")(3) < o2.split(",")(3))
    true
  else
    false
})
  .foreach(println)

println("=== Sort orders by status in descending order ===")
orders.sortWith((o1, o2) => {
  if (o1.split(",")(3) > o2.split(",")(3))
    true
  else
    false
})
  .foreach(println)

println("=== Sort orders by customer id in ascending order & order id in descending order ===")
orders.sortWith((o1, o2) => {
  if (o1.split(",")(2).toInt < o2.split(",")(2).toInt)
    true
  else if (o1.split(",")(2).toInt > o2.split(",")(2).toInt)
    false
  else {
    if (o1.split(",")(0).toInt > o2.split(",")(0).toInt)
      true
    else
      false
  }
})
  .foreach(println)
