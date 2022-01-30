/*
kotlin have 8 basic variable types
#Numeric types
* Byte : integer it take 8 bit it value between -128 and 127
* Short : integer it take 16 bit
* Int : integer it take 32 bit
* Long : integer it take 64 bit
* Float : real number  it take 32 bit (3.45)
* Double : real number it take 64 bit (4.65)
for get max or min value of numeric types we use type.MIN_VALUE for min type .MAX_VALUE for max exmple : Int.MIN_VALUE
we can format double and float and specific how much degit we want take after print . using "%.DegitNumber".format(doubleVariable) exemple : var a="%.2".format(3.49744)

#No numeric types
* Boolean : it can be true or false
* Char : it represent 1 character should be inside ' '
* String : it represent serie of character should be inside " " we can get string length using  str.count()
* null : w can creat null using var a = null
- null is not type in kotlin that mean if we creat null variable we can't assign other type value for it and also we can't creat type and make it value null
- for make variable that accept null and other type we use type? exmeple var num:Byte?= null with this we can make it value null  or short
- for prevent error we use !! after calling or using methodes in this type it will rise exeption if it value null 
#Types convert 
_we can convert between type using toByte(), toShort(),	toInt(),	toLong(),	toFloat()	and	toDouble() toChar() toString() toBoolean()
_we can convert from Byes to all other type except boolean (Byte to char will give us char with bytes value in unicode table)
-we can convert from Short to all other type except boolean (Byte to char will give us char with bytes value in unicode table and for byte it will take only 
the 8 weak  byte of our number)
-we can convert from Int to all except Boolean
-we can convert from Float to String Int  double and long
-we can convert from Double to String Int  double and long and char
-we can convert from Long to all except Boolean
-from Boolean we can convert only to string
-we can convert from Char to all except Boolean when we convert we get unicode of the character 
-we can convert from String to all number if it don't depace their max  or min value we can't convert from String to Char if the stirng is true or false it can be converted 
to boolean
#Remarque
_kotlin know type of variable when we creat it automaticly by it value but if we want predifine the type we use var variablename:typeName exemple: var num:short=45
_in kotlin Int is default type of integer and Double is default type of real number if we want variable be float we use L after if if we want it be float number we
use f or F exemple var num1=54L  / var num2=548.48f
_we cant asign variable to another one if they are not the same type 
_kotlin support binaire and hexadecimal base number we can writ number in hexa by add the prefix 0x and for binaire we use 0b exemple var n=0xf ->(15) but kotlin dont support
octal number 
_for remove in neccesary white space in string we use str.trim() for remove for remoe from the end only we use str.trimEnd() and for begin only we use str.trimStart()
_ str.uppercase() make string ypper case str.lowercase() make string lower case we can use str.toUpperCase str.toLowerCase()  str.toCapitalize()
_we can replace value in string with other using str.replace("old value","new value")
_we can get substring using str.substring(start , end) or str.subSequence(start,end)
_we can also get string character by index
_we can write paragraph in kotline by putting them inside """ """ this support break line
var a=""" hello
this line 2
this line 3 
"""
-for remove in nessecary white space we use para.trimMargin() it default value is | that mean remove in necessary space after and before | we can change that by
pass deferent value to this method









*/
