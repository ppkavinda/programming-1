def eqRoots(ex:String) = {
    var exp = ex.split('+')
    var a = exp(0)
    var b = exp(1)
    var c = exp(2)

    var _A = a.substring(0, a.indexOf("x"))
    var _B = b.substring(0, b.indexOf("x"))

    if (_A == "") { _A = "1"}
    if (_B == "") { _B = "1"}

    var A = _A.toDouble
    var B = _B.toDouble
    var C = c.toDouble
    var D = math.pow(B, 2) - 4 * A * C

    if(D >= 0){
        var root1 = (-1) * (B + math.sqrt(D)) / (2 * A)
        var root2 = (-1) * (B - math.sqrt(D)) / (2 * A)
        printf("Root 1: %f\n" ,root1)
        printf("Root 2: %f\n" ,root2)
    }else{
        println("This has no real roots.")
    }
}

var x = "4x^2+6x+2"
eqRoots(x)
