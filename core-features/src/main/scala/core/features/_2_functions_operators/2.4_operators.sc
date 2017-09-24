
println("****************** Operators for Int ******************")
val a = 1
val b = 2

// operators are functions
a.+(b)
a.-(b)

// operators/functions can be invoked without using .
a + b
a - b

println("****************** Operators for String ******************")
val s1 = "Hello"
val space = " "
val s2 = "World"

// operators are functions
s1.==(s2)
s1.concat(" ").concat(s2)

// operators/functions can be invoked without using .
s1 == s2
s1 + space + s2

// Below method is used to compare object reference (same as == in java)
s1.eq(s2)

// == and equals are same as java
s1.equals(s2)

println("****************** Operators for Boolean ******************")
val b1 = true
val b2 = true
val b3 = false

// operators are functions
b1.&&(b2)
b1.||(b2)

// operators/functions can be invoked without using .
b1 && b2
b1 || b2
