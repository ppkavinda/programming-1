def charOrder(sample:String, txt:String) = {
    var text = txt
    var ans:Boolean = true

    for(sl <- sample){
        if(ans == true){
            var i = 0
            var j = 0
            var t = text(0)
            while(t != sl){
                t = text(i)
                println(sl.toString + t + " E")
                if(t == sl){
                    text = text.substring(i+1, text.length())
                    j = 0
                }
                if(text.length() ==  j){
                    ans = false
                }
                println(ans + text.length().toString + i.toString + " D")
                j += 1
                i += 1
            }
        }else{
            print("Not Match")
        }
    }
    if(ans == true){
        print("Match !!")
    }
}
charOrder("C", "abC")
