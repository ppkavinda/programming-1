/*   1   */
def natural(n:Int):Unit = {
  println(n)
  if(n != 0) natural(n-1)
}
natural(5)

/*   2   */
def love(N:Int):Unit = {
  println("I lova Scala")
  if( N>= 1) love(N-1)
}
love(5)

/*   3   */
def sumN(n:Int):Int = {
  if (n == 1) 1
  else n + sumN(n-1)
}
println(sumN(3))

/*   4   */
def fac(n:Int):Int = {
  if(n == 1) 1
  else n * fac(n - 1)
}
println(fac(5))

//   5   
def power(n:Int, p:Int) = {
  if (p == 0) 1
  if (p == 1) n
  else{
    n * power(n, p - 1)
  }
}
println(power(2, 4))


//   6
def oddoreven(n:Int, m:Int):Unit = {
  if(n<=m){
    if(n%2 == 0) println(n + " is even.")
    else if (n%2 != 0) println(n + " is odd.")

    oddoreven(n + 1, m)
  }
}

oddoreven(5, 20)


//  7
def reverseString(s:String):Unit = {
  print(s.substring(s.length() - 1, s.length()))
  if(s.length() != 1) reverseString(s.substring(0, s.length() - 1))
}

reverseString("123456789")


//  8
def primeornot(n:Int) = {
  
}