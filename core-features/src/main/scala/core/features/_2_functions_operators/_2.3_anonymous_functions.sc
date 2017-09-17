
println("********** Calculate sum of integers using higher order function ************")
def sumR(f: Int => Int, startN: Int, endN: Int) :Int = {
  if (startN > endN)
    0
  else
    f(startN) + sumR(f, startN + 1, endN)
}

println("************** Anonymous function usage **************")

// Function without name can't be use further
(n: Int) => n * n * n

// Function without name but usable (as function is assigned to variable)
val x = (n:Int) => n * n

// Calculate sum by invoking function assigned to variable
sumR(x, 1, 10)

// Calculate sum of square of number by using anonymous function
sumR((n: Int) => n*n*n, 1, 5)

// Calculate sum of even numbers by using anonymous function
sumR(n => {
  if (n % 2 == 0)
    n
  else
    0
}, 1 , 5)

// Calculate sum of number multiplied with 4 using anonymous function
sumR(_ * 4, 1, 5)
