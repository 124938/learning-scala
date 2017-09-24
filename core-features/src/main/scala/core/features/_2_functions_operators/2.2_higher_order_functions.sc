println("********* Reason behind providing feature of higher order function *******")
def sumId(startN: Int, endN: Int) = {
  var sum = 0
  for (e <- startN to endN)
    sum = sum + e
  sum
}
sumId(1, 5)

def sumSquare(startN: Int, endN: Int) = {
  var sum = 0
  for (e <- startN to endN)
    sum = sum + (e * e)
  sum

}
sumSquare(1, 5)

def sumCube(startN: Int, endN: Int) = {
  var sum = 0
  for (e <- startN to endN)
    sum = sum + (e * e * e)
  sum
}
sumCube(1, 5)

/*
- Above functions can be replaced by using higher order function
 */
println("********* Calculate sum of id/square/cube of integer using higher order function *******")
def sum(f: Int => Int, startN: Int, endN: Int) = {
  var sum = 0
  for (e <- startN to endN)
    sum = sum + f(e)
  sum
}

println("*** Higher order function using named function *****")
def id(n: Int) :Int =  n
sum(id, 1, 5)

println("*** Higher order function using function assigned to variable *****")
val square = (n: Int) => n * n
sum(square, 1, 5)

println("*** Higher order function using anonymous function *****")
sum(n => n*n*n, 1, 5)
sum(n => n*2, 1, 5)