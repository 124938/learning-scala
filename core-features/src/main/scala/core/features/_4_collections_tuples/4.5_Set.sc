println("************** Immutable Set - Exploring API *******************")

println("==== Create immutable set ===")
val s = Set(1, 2, 3, 4, 6, 8, 10, 2, 3, 5)

println(s"Test whether element 1 is present in set or not : ${s.contains(1)}")
println(s"Test whether element 15 is present in set or not : ${s(15)}")
println(s"Total number of elements in set is : ${s.size}")

println("==== Add/Remove single element in immutable set and yield new set ===")
s.+(8)
s.-(8)

println("==== Add/Remove collection in immutable set and yield new set ===")
s ++ List(1, 2, 90, 58, "abc")
s -- Set(25, 8, 1, 2)

println("************** Mutable Set - Exploring API *******************")

println("==== Create mutable set ===")
val ms = scala.collection.mutable.Set(1, 2, 3, 4, 6, 8, 10, 2, 3, 5)

println("==== Add/Remove single element in mutable set and yield new set ===")
ms + 50
ms.+(50)

ms - 8
ms.-(8)

println("==== Add/Remove single element in existing mutable set ===")
ms += 50
ms -= 50

println("==== Add/Remove collection in mutable set and yield new set ===")
ms ++= List(1, 2, 90, 58)
ms --= List(1, 2, 90, 58)

println("************** Perform operations on multiple sets *******************")
val ms1 = scala.collection.mutable.Set(1, 2, 3, 5)
val ms2 = scala.collection.mutable.Set(1, 6, 8)

println("=== Union ===")
ms1 ++ ms2 // More generic operation
ms1 | ms2  // Same as ++

println("=== Diff ===")
ms1 &~ ms2 // Elements presents in ms1 only
ms2 &~ ms1 // Elements presents in ms2 only

println("=== Intersection ===")
ms1 & ms2
