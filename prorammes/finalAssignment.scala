var l1 = Array(1, 2, 3, 3, 3, 4, 4, 5, 4)
var l2:List[Int] = List()
var l3:List[Int] = List()
var k = 2

for(i <- l1){
    if(!l2.contains(i)){
        l2 = i::l2
    }
}
var mx = 0
var pre = 0
var ij = 0
for(i <- l2){
    mx = 0
    for(j <- l1){
        if(i == j){
            mx += 1
        }
    }
    if(mx > k){
        l3 = i::l3
    }
}
println(l3.length)

var l4 = l.distinct
for(i <- l4){
    if(l.count(_==i)>k) println(i)
}
