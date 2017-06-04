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
