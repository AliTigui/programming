/*  
-function
    #for creat function we use fun name(par1:type,par2:type):retunType{statement }
    # every paramatre should have type and we most respect it when call it if function don"t use parametre we can use empty ()
    # retun type is what functoin return when we call it if return nothing we put it Unit or don't write it at all
    # for return value we use return
    # if paramatre is array we use fun name (par:Array<type>)
    # if function have only 1 line of code we can use fun name (par1:type,par2:type) = a+b or somthing else
    # in kotlin we par argument by reference but we can't modify them because when we pass them to funtion they arr represented inside it like val variables
    # for make one of the argument optional we add vararg befor it exemple fun name(par1:type,vararg par2:type):retunType{statement } we can put as much as argument
        that we want in vararg parametre and all those argument will be like array if we want pass those argument in array or list format we use * before argument name
    # we can use name parametre when call function for pass for chack name  the correct argumen exmple  fun1(par="ali",par2=2) but if swe use it we have to use it for all paramatre
    # functoin parametre defalut value and when we call it we can use it without passing argument exemple fun name(par1:type=val,vararg par2:type=val)
    we can creat function inside other one 
    
    we can make functin return 2 value using Pair exemple :
    fun myFunc(a:Int, b:String):Pair<Int,String>{ return Pair(a + 1, n + " hi")} for use it we do var (a, b)=myFun(4,'ali');
    shorthand function fun addnumb(a:Int, b:Int):Int = a+b here we can creat it without specific the return value  function fun addnumb(a:Int, b:Int) = a+b
    we can do  fun addnumb(a:Int, b:Int) = println(a+b)
    we can creat function like variable exemple val sayHello ={paramatre -> statmend1;statement2 ; value that it return}
    val myFun = {name:String -> println("hello " + name)} we use it myFun("ali")
    in function we can use recrusive function 
    for avoid stackoverflow in recrusive we use tailrec before the fun keyword 
    we can make fun creat fun
    exemple 
    fun add(n:Int):(Int)->Int= {num2-> num2+n}
    for use it we use
    val a= add(7)
    println(a(5))
    we can make function accept other function by specific it return type and it argument type
    fun func1(a:Int,func:(b:Int)->int){}
    */
