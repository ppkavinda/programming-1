def recursion(n:Int, m:Int):Unit = {
	println(n)
	if(n<m){
		recursion(n + 1, m)
	}
}
recursion(5, 10)

