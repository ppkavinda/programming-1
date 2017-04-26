def interest(amount:Double, a:Double):Double=
 a match {
 case x if x<0 => 0
 case x if x<1000 => x*.05
 case x if x<10000 => x*.06
 case x if x<100000 => x*.07
 case x if x>=100000 => x*.08
}

print(interest(500, 2))
