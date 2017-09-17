println("************** Immutable variables - Usage ******************")
val a = 0
val b: Int = 2
//b = 3 /* As b is declared as immutable variable b can't be assigned again */

println("************ Mutable variables - Usage ******************")
var c = 0
c = 1
//c = "Hello" /* Can't change the type of variable after declaration as scala is strongly typed */

println("************** Exercises **************")
val i = 42
val j = 42L
val k = 42.02F
val l = (i * j * k).toDouble
val m:Short = 42
val n:Byte = 42
val o = m.toFloat * n.toDouble