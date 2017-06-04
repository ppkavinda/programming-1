def printw(n:Int, m:Int):Unit={
    println(n)
    if(n<m){
        printw(n+1, m)
    }
}

printw(3, 5)
