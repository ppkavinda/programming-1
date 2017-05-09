// 3
def div(n:Int) = {
    var i = 1

    while(i <= n){
        if(n % i == 0){
            println(i.toString + " is a divisor of " + n.toString);
        }
        i += 1;
    }
}
div(4)

// 4
def consecutive1(n:String){
    var one = 0
    var prev =0
    var big = 0
    for(l <- n){
        if(prev != l){
            one = 0
        }
        if(l == '1'){
            one += 1
        }
        if(one > big){
            big = one
        }
        prev = l
    }
    println(big)
}
consecutive1("00110001001110")

// 5
def twos(m:Int, n:Int){
    var i = m
    var two  = 0
    while(i <= n){
        for(c <- i.toString){
            if(c == '2'){
                two += 1
            }
        }
        i += 1
    }
    print(two)
}
twos(20 ,30)

// 6
def charOrder(word:String ) = {
    for(l <- word){
        print(l)
    }
}
