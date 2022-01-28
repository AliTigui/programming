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

*/
fun main(){

  var a=5
  var b=6
  println(sum(a,b))
}
fun sum(p1:Int ,p2:Int):Int{
 return p1+p2
}
