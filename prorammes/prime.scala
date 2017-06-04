def gcd(m:Int, n:Int):Int = {
    if(n==0) m
    else if(m<n) gcd(n, m)
    else gcd(n, m%n)
}

def prime(p:Int, n:Int=2):Boolean = {
    if(p==n) true
    else if(gcd(p,n)>1) false
    else prime(p, n+1)

}

println(prime(110))

def primel(p:Int):Boolean = {
    var st = true
    print(p + ": ")
    for(i <- 2 to p-1){
        if(p%i==0) st = false
    }
    if (st==false)print("Not a prime")
    else print("Prime")
    st
}
primel(110)
