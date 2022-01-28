/*
hello this my first kotlin code i write here the basik that i learn
*/
fun main(){
// all code that we want to use should be inside main function

 // declare variable
  // var can be changed but val no
  /*
  -variables type are :
  #Boolean : it can be true or false
  # byte : integer it take 8 bit it value between -128 and 127
  # short : integer it take 16 bit
  # int : integer it take 32 bit
  # long : integer it take 64 bit
  # float : real number  it take 32 bit (3.45)
  # double : real number it take 64 bit (4.65)
  # we can format how much degit we want take after print  or store in double using "%.DegitNumber".format(doubleVariable
  # we can get max and min value of any number tipe using .MIN_VALUE and .MAX_VALUE exemple : Int.MIN_VALUE
  # char : it represent 1 character should be inside ' '
  # string : it represent serie of character should be inside " "
  # we can use .trim() for remove spaces at the end and the begin of string or trimEnd() remove from the end , trimStart() remove frome begin
  # using """ """ can help us to make paragraph and print it like we write it it have trimMargin() method that remove annicecarry whitspace
        but it default value is | that mean remove space before | we can change that by putting value inside the method
  # string have  .uppercase() methode that transform it to uppercase .lowercase() that transforme it to lower case and .replace("a","v") 
        for replace valeu in string with other one we can get substring using str.substring(start , end) or str.subSequence(start,end)
  -We can't assigne variabl to another that don't have the same type
  -After creat variable kotlin compiler se the value and creat object with type based in that value for integer the default is int 
      for real number the default is double, then put the value in this objet then put it referance in our variable
  -We can pre-determine the type of a variable using suffix after it name exemple : Byte Int Short Long Double Char String Boolean Float
  - we can add L at the  end of integer declaration for make it long
  - we can add f or F in end of double declaration for make it float
  - we can change type of numerical variable using one of those methodes toByte(), toShort(),	toInt(),	toLong(),	toFloat()	and	toDouble().
  -kotlin support binaire and hexadecimal number for write nomber in binaire or hexadecimal we use 01 for binaire 0x for hexadecimal
      kotlind don't support octal number 
  -Array :
  # we can make array  using arrayOf(4,5,6,7) it see the element inside the function then creat arrey objetc based en element inside it
  # the arae object can't be changed if it arre of integer it will not be abbel to change to string or float ...
  # we can get element inside the array using index first index is 0
  # we can change element of the array by index
  # by creating array using val we cant assign it to new array but we can change value of variable inside it
  # we can get size of array using  arrayName.size
  # We can pre-determine the type of array like normal variable by using Array<type> after array name type are : Byte Int Short Long Double Char String Boolean Float
  
  
  */
   var x=5
  val y=6
  var a: Long=5 // creat Long withe  prefix method
  var b=64L //creat long
  var c=1.84f // creat float
  c= a.toFloat()
  var d=0b11001 // use binaire number
  var e=0x1ef // hexadecimal number
  var arr=arrayOf(4,5,6,7) //creat array of integer
  arr[0]=10 //change first value to 10
 var l=arr.size
 var  arr2:Array<Byte> =arrayOf(8,57,2,7)
 
 /*
 -Loop and controle flow : there is three type of loop
 # do{ }while() run code then test condition  while(){} check condition before run code for(){} run code for know number of time 
     repeat(n){} repeat statement n time
 # for loop is the mor complicated when we can use it for loop through array element or we can use it for loop through range of number
     Exemple : for(i in el){ println(i)} or we can use for(i in 0..9){println(i)} if we want it revers count we use for(i in 6 downTo 0 step 2){ println(i)}
     if we didn't add step it will be 1
 # comparaison operateur are > < == <= >= !=
 # Logical operateur are || (or) && (and)
 # if(condition 1){ code 1}else if(condition 2){ code 2} else{ code if all false }
 # we can use if else to return value exemple var a= if(j>5) "big" else "small"
 # we can use when(var){val1 -> statement val2-> statement else{statement}} it work like switch case
      we can test for range exmple when(var){ in 0..9-> statement else{}}
 - print we can print using print or println deferance is println add line break in the end of the value that we print
      we can print value of  variable and write expression inside string by putting it inside ${} (this is string template)
 -Arithmetic operations
 # + addition - substractoin /division * multiplication % modulo and we have += *= -= /= %= ++a a++ a-- --a 
 
 
 */
 while(x<10){
 println("${x}")
 x+=1
 }
 do{
 println("${a}")
 a+=1
 }while(a<10)
 var j=5
 if(j>10 ){
  println("big")
 }else if(j%2 ==0){
  println("even")
 }else{
  println("odd ") 
 }
 println(" 4+5 = ${4+5}")
 var u=if(a>10) "big" else "small"
 
 
 
 
 
 
 
 
 
 
 
 
 
 

}
