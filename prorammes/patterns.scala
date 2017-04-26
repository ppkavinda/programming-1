for(i <- 1 to 5){
    println(" " * (5 - i) + "*" * i);
}

for(i <- 0 to 5){
    println(" " * i + "*" * (5 - i))
}

for(j <- 0 to 5){
    println(" " * (5 -j) + "*")
}

for(i <- 0 to 5){
    println(" " * (5 - i) + "*" * i + "*" * (i - 1))
}

for(i <- 0 to 5){
    println(" " * i + "*" * (5 - i) + "*" * (4 - i))
}
