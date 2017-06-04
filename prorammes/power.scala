def power(p:Int, n:Int):Int = {
    if(n==0) 1
    if(n==1) p
    else p * power(p, n-1)

}
println(power(2,5))
