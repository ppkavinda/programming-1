def sum(f:Int => Int, a:Int, b:Int):Int = f(a) + f(b)

def id(x:Int) :Int = x
def square(x:Int):Int = x * x
def cubic(x:Int):Int = x * x * x

def sumInts(a:Int, b:Int):Int = sum(id, a, b)
def sumSquares(a:Int, b:Int):Int = sum(square, a, b)
def sumCubic(a:Int, b:Int):Int = sum(cubic, a, b)

print(sumCubic(1, 2))
