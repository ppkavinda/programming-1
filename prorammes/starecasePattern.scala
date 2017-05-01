def step(n:Int) = {
    for(j <- 1 to n){
        for(i <- 1 to 4){
            print(("  ") * (n - j + 1) * 4  + "*");
            println()
            if (i == 4) {
                print("  " * (n - j) * 4 + "* " * 5)
                println()
            }

        }
    }
}

step(5)
