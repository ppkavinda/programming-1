def factorial(n:Int):Int = {
	if(n == 1) {
		1
	}else{
		n * factorial(n-1)
	}
}


println("Fractorial : " + factorial(15))
