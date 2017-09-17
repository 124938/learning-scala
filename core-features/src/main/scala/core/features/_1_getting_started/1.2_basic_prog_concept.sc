println("*********** Expression - Usage *************")
val a = {
  val i = (math.random * 100).toFloat
  val j = (math.random * 100).toFloat
  i - j
}

val b = {
  val x: Int = 1
  val y = 23L
  val z = "Hi"
  false
}

println("*********** Nested block - Usage *************")
val c = {
  val x = 0
  val y = 1
  val z = {
    val y = 2
    println("Value of x inside nested block is -> "+x)
    println("Value of y inside nested block is -> "+y)
  }
  println("Value of x inside main block is -> "+x)
  println("Value of y inside main block is -> "+y)
}

println("*********** Conditional block - Usage ************")
val i = 10
val j = 20
if (i > j)
  println(i)
else if (i == j)
  println("equals")
else
  println(j)

println("*********** Ternary operator - Usage ************")
val k = 23
val l = 23
if (k == l) println("equals") else println("NOT equals")

println("*********** While loop - Usage ************")
var ctr = 1
while (ctr <= 5) {
  println(ctr)
  ctr += 1
}

println("*********** For loop - Usage ************")
for (e <- 1 to 10)
  println(e)

for (e <- 1 to 20 by 2) // increment e by 2
  println(e)

for (e <- 20 to 1 by -2) // decrement e by 2
  println(e)

for (e <- 1 to 100) {
  if (e % 2 == 0)
    println("Even Number -> "+e)
  else
    println("Odd Number  -> "+e)
}

println("*********** Exercise : Find out factorial of number ************")
val fact = 5
var factRes = 1
for (e <- 1 to fact) {
  factRes = factRes * e
}
println("Factorial of " +fact+ " is : "+factRes)

println("*********** Exercise : Print fibonacci series of number ************")
val fibo = 10
var prev = 0
var curr = 1
var sum = 0

println("Fibonacci series of " + fibo + " is :")
print(prev + "\t" + curr)
for (e <- 2 to fibo - 1) {
  sum = prev + curr
  prev = curr
  curr = sum
  print("\t" + sum)
}
