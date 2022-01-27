package converter
fun from_dec(){
    val arr = mutableListOf<String>("A","B","C","D","E","F")
    println("Enter number in decimal system: ")
    var a = readLine()!!.toInt()
    println("Enter target base : ")
    var b = readLine()!!.toInt()
    var q = 1
    var str=""
    while( a != 0 ){

        q=a%b
        a=a/b
       
        if(q>9){
            str += arr[q-10]
        }else{
          str += q.toString()
        }
        
        
    }
    print("Conversion result: ")
    for(i in str.length-1 downTo 0){
        print(str[i])
        
    }
    println()
}
fun main() {
    while (true){
    println("Do you want to convert /from decimal or /to decimal? (To quit type /exit)")
    var ch=readLine()!!
    if(ch == "/from"){
    from_dec()
    }else if(ch == "/to"){
        println("Enter source number: ")
        var m = readLine()!!
        println("Enter source base:")
        var base = readLine()!!.toDouble()
        
        var res=0.0
        for(i in 0..(m.length-1)){
            if(m[i].equals('A') ||m[i].equals('a')){res+=10*Math.pow(base,(m.length-1.0-i))}
            else if(m[i].equals('B') ||m[i].equals('b')){res+=11*Math.pow(base,(m.length-1.0-i))}
            else if(m[i].equals('C') ||m[i].equals('c')){res+=12*Math.pow(base,(m.length-1.0-i))}
            else if(m[i].equals('D') ||m[i].equals('d')){res+=13*Math.pow(base,(m.length-1.0-i))}
            else if(m[i].equals('E') ||m[i].equals('e')){res+=14*Math.pow(base,(m.length-1.0-i))}
            else if(m[i].equals('F') ||m[i].equals('f')){res+=15*Math.pow(base,(m.length-1.0-i))}
            else {res+=(m[i].toInt()-48)*Math.pow(base,(m.length-1.0-i))}
            
           
        }
        println("Conversion to decimal result: ${res.toInt()} ")
  
    }else{
     break   
    }
    }
}
