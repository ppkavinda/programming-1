def gcd(m:Int, n:Int):Int = {
    if(n==0) m
    else if(m<n) gcd(n, m)
    else gcd(n, m%n)
}
println(gcd(22, 11))
