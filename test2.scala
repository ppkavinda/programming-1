def charOrder(sample:String, txt:String) = {
    var text = txt
    var ans:Boolean = true

    for(sl <- sample){
        var i = 0
        if(text.length() == 0 ) println("Not Match.")
        while(i < text.length()){
            println(text(i) + sl.toString)
            if (text(i) == sl) {
                text = text.substring(i, text.length())
                println("1")
            }
            i += 1
        }
    }
}
charOrder("b", "abCd")
