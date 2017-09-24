
println("********* Usage of Range ***********")
(1 to 10).foreach(n => print(s"$n "))
(1 to 10 by 2).foreach(n => print(s"$n "))
(20 to 1 by -3).foreach(n => print(s"$n "))

println("********* Usage of Mutable collection *********")

// Array is special type of mutable collection in scala
val a = Array(1, 2, 3)

// As array is mutable, update element in array is allowed
a(0) = 14

// Access element using index from collection
println("First element of array is -> "+a(0))
println("Third element of array is -> "+a(2))

// Convert array to list
println("Array converted to list -> "+a.toList)

println("********* Usage of Immutable collection *********")

// List is immutable collection in scala
val l = List(1, 2, 3, 4)

// As list is immutable, updating element is not allowed
// l(0) = 25

// Access element using index from collection
println("First element of list is -> "+l(0))
println("Third element of list is -> "+l(3))

println("********* Tradition way to calculate sum or square of even numbers *********")
var res1 = 0
for (e <- 1 to 100) {
  if (e % 2 == 0)
    res1 = res1 + (e * e)
}
println(s"Sum of square of even number from 1 to 100 -> $res1")

println("********* Functional way to calculate sum or square of even numbers *********")
val res2 = (1 to 100).filter(n => n% 2 == 0)
                    .map(n => n * n)
                    .reduce((agg, ele) => agg + ele)

println(s"Sum of square of even number from 1 to 100 -> $res2")

