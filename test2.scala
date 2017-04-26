var n1 = 23.0
var sum = 0.0

while(n1 > 0){
    var n2 = n1 % 10
    sum += math.pow(n2, 2)
    n1 = (n1 - n2) / 10
    println(n1, sum)
}
