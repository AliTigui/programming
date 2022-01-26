/*
hello this my first kotlin code i write here the basik that i learn
*/
fun main(){
// all code that we want to use should be inside main function
  
  
 // declare variable
  var x=5
  val y=6
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
  # char : it represent 1 character should be inside ' '
  # string : it represent serie of character should be inside " "
  -We can't assigne variabl to another that don't have the same type
  -After creat variable kotlin compiler se the value and creat object with type based in that value for integer the default is int 
      for real number the default is double, then put the value in this objet then put it referance in our variable
  -We can pre-determine the type of a variable using suffix after it name exemple : Byte Int Short Long Double Char String Boolean Float
  - we can add L at the  end of integer declaration for make it long
  - we can add f or F in end of double declaration for make it float
  -kotlin support binaire and hexadecimal number for write nomber in binaire or hexadecimal we use 01 for binaire 0x for hexadecimal
      kotlind don't support octal number 
  
  */
  var a: Long=5// creat Long withe  prefix method
  var b=64L//creat long
  var c=1.84f// creat float
  var d=0b11001// use binaire number
  var e=0x1ef // hexadecimal number
}
