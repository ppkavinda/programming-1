println(" " * 5 + "*")
for(i <- 1 to 9){
    if(i < 5){
        println(" " * (5 - i) + "*" + " " * (i) + " " * (i - 1) + "*")
    }else{
        println(" " * (i - 5) + "*" + " " * (10 - i) + " " * (9 - i) + "*")
    }
}
println(" " * 5 + "*")
