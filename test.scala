for(i <- 0 to 9){
    if(i < 5){
        println("*" * (5 - i) + " " * i + " " * i + "*" * (5 -i))
    }else{
        println("*" * (i - 4) + " " * (9-i) + " " *(9 - i) + "*" * (i - 4))
    }
}
