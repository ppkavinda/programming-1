def lucky(n:Double):Unit = {
    var n1 = n;
    var sum = 0.0;
    while(n1 > 0){
        var n2 = n1 % 10
        sum += math.pow(n2, 2)
        n1 = (n1 - n2) / 10
    }
    if(sum == 4 || sum == 16 || sum == 37 || sum == 58 || sum ==  89 || sum == 145 || sum == 42 || sum == 20 ){
        println("Not a LUCKY Number");
    }else if(sum != 1){
        lucky(sum)
    }else if( sum == 1){
        printf("LUCKY number\n")
    }
    // println(n, sum)
}
lucky(27)
