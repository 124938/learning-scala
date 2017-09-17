/*
- Argument to function - Data type is mandatory
- Return from function - Data type is optional (it will be inferred automatically by scala compiler)
 */

println("************* Create function to find out factorial of number **************")
def fact(n: Int) :Int = {
  var res = 1
  for (e <- 1 to n)
    res = res * e
  res
}
fact(5)
fact(9)

println("************* Create recursive function to find out factorial of number **************")
def factR(n: Int) :Int = {
  if (n == 1) 1 else n * factR(n - 1)
}
factR(5)
factR(9)

println("************* Create function to print number of elements in fibonacci series **************")
def fibo(n: Int) = {
  var prev = -1
  var curr = -1
  var sum = 0
  for (e <- 0 to n-1) {
    if (e == 0 ) {
      prev = e
      print(e + "\t")
    } else if (e == 1) {
      curr = e
      print(e + "\t")
    } else {
      sum = prev + curr
      prev = curr
      curr = sum
      print(sum + "\t")
    }
  }
}
fibo(9)
fibo(15)

println("************* Create function to check input number is present in fibonacci series or not **************")
def isFibo(n: Int) :Boolean = {
  var prev = -1
  var curr = -1
  var sum = 0
  for (e <- 0 to n-1) {
    if (e == 0 ) {
      prev = e
    } else if (e == 1) {
      curr = e
    } else {
      sum = prev + curr
      prev = curr
      curr = sum
    }
    if (prev == n || curr == n || sum == n)
      return true
  }
  false
}
isFibo(13) // should return true
isFibo(21) // should return true
isFibo(24) // should return false
isFibo(34) // should return true

println("************* Create nested function to compute nCr **************")
def nCr(n: Int, r: Int) :Int = {
  def factRec(num: Int) :Int = {
    if (num == 1) 1 else n * factR(num - 1)
  }
  factRec(n) / (factRec(n-r) * factRec(r))
}

println("************* Create function to calculate sum of integer (using formula) **************")
def sumOfInteger(n: Int) :Int = {
  /*
  var sum = 0
  for (e <- 1 to n)
    sum = sum + e
  sum
  */
  // Try to use formula instead of doing same operations multiple times (to gain performance benefit)
  n * (n + 1) / 2
}
sumOfInteger(5)

println("************* Create function to calculate sum of integer (using formula) **************")
def sumOfSquareOfInteger(n: Int) = {
  /*
  var sum = 0
  for (e <- 1 to n)
    sum = sum + (e * e)
  sum
  */
  // Try to use formula instead of doing same operations multiple times (to gain performance benefit)
  n * (n + 1) * (2*n + 1) / 6
}
sumOfSquareOfInteger(5)

println("************* Create function to calculate cube of integer (using formula) **************")
def sumOfCubeOfInteger(n: Int) = {
  /*
  var sum = 0
  for (e <- 1 to n)
    sum = sum + (e * e * e)
  sum
  */
  // Try to use formula instead of doing same operations multiple times (to gain performance benefit)
  (n * (n + 1) / 2 ) * (n * (n + 1) / 2 )
}
sumOfCubeOfInteger(5)

println("************* Create nested function to calculate cube of integer **************")
def sumOfCubeOfIntegerNested(n: Int) = {
  def sumOfInteger(n: Int) = {
    n * (n + 1) / 2
  }
  sumOfInteger(n) * sumOfInteger(n)
}
sumOfCubeOfIntegerNested(5)
