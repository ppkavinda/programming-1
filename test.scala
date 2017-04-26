for(i <- 0 to 5; j <- 0 to 5){
    if(i == j){
        print(" ")
    }else{
        print("*")
    }
    if(j == 5){
        println()
    }
}

for(i <- 1 to 4){
    println(" " * 8 + "*")
    if(i == 4){
        for(j <- 1 to 5){
            print("* ")
        }
    }
}
println()
