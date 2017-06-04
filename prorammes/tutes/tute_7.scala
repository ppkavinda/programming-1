// 1
// var numbers = List(32, 95, 24, 21, 17)
var numbers:List[Int] = List(32, 95, 24, 21, 17)

// 2
print(numbers.head)

//3
print(numbers(numbers.length-1))

//4
print(numbers.reverse)

// 3
print(numbers.tail)

// 4
val l = List range(0, 101)
for(i <- l){
    if(i%2==0) println(i+": Even")
    else println(i+": Odd")
}

// 5
def rev(l:List[Int]){
    var l1 = l
    var l2:List[Int] = List()
    while(l1.length>0){
        l2 = l1.head::l2
        l1 = l1.tail
    }
    println(l2)
}

// 6
var l1 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
var l2:List[Int] = List()
var c = 0
for(i <- l1){
    if(c%2 != 0){
        l2 = l2:+i
    }
    c += 1
}
println(l2)

// 7
c = 0
for(i <- l1){
    c += 1
}
println(c)

// 8
var n = 23244232
var l3:List[Int] = List()
while(n>0){
    l3 = n%10::l3
    n = n/10
}
var l4:List[Int] = l3.reverse
if(l4==l3) println("pal")
else print("Not pal")

// 10
var l5:List[Int] = List()
var nu = 6
while(nu>0){
    l5 = nu%2::l5
    nu /= 2
}
println(l5)
