def fibonacci(n:Int):Int = {
    n match{
        case x if x == 0 => 0
        case x if x == 1 => 1
        case x => fibonacci(n - 1) + fibonacci(n - 2)
    }
}

println(fibonacci(20))

def seviesf(n:Int){
    if(n!=1) servicesf(n-1)
    println(fibonacci(n))
}

def fi(num:Int)= {
    var i = 0
    var pre = 0
    var ans = 1
    while(i < num){

        println(ans)
        i = ans
        ans = ans + pre
        pre = i
        i = ans
    }
}
fi(50)
