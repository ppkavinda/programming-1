for(i <- 0 to 8){
    if(i < 5){
        println("*" * (5 - i) + " " * i + " " * i + "*" * (5 -i))
    }else{
        println("*" * (i - 3) + " " * (8-i) + " " *(8 - i) + "*" * (i - 3))
    }
}
