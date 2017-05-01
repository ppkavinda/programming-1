def divisors(n:Int) = {
    var n1 = 1
    while(n1 <= n){
        if(n % n1 == 0){
            print(n1)
            print(" is a divisor of ")
            println(n)
        }
        n1 += 1
    }
}

divisors(25)
