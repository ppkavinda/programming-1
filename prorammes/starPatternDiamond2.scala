for(i <- 1 to 10){
    if(i < 5){
        println(" " * (7 - i) + "*" * (i ) + "*" * (i - 1))
    }else{
        println(" " * (i - 3) + "*" * (10-i) + "*" *(9 - i))
    }
}
