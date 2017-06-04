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
def charOrder(sample:String, txt:String) = {
    var text = txt
    var ans:Boolean = true

    for(sl <- sample){
        var i = 0
        if(text.length() == 0 ) println("Not Match.")
        while(i < text.length()){
            println(text(i) + sl.toString)
            if (text(i) == sl) {
                text = text.substring(i, text.length())
                println("1")
            }
            i += 1
        }
    }
}
charOrder("b", "abCd")

// 7
def guess() = {
    print("Think a number with in range 0 & 100")
    print("\ntype g for greate rthan\nl for less than\ne for equal\n")
    var guess = 50
    var count = 0
    var hit = false
    var range = 25
    var hint = ""

    while(!hit){
        count += 1
        println("Is it < or > or = , " + guess.toString + " ?\n")
        hint = scala.io.StdIn.readLine

        if (hint == "g" || hint == "G") {
            guess += range
        }else if(hint == "l" || hint == "L"){
            guess -= range
        }else if(hint == "e" || hint == "E"){
            print(guess.toString + " is the number you guessed!")
            print("\nit took " +count.toString+ " guesses to find it.")
            hit = true
        }
        if(range != 1) range = range / 2


    }
}

guess()
