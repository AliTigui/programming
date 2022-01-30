/*
kotlin have 8 basic variable types
-Numeric types
* Byte : integer it take 8 bit it value between -128 and 127
* Short : integer it take 16 bit
* Int : integer it take 32 bit
* Long : integer it take 64 bit
* Float : real number  it take 32 bit (3.45)
* Double : real number it take 64 bit (4.65)
for get max or min value of numeric types we use type.MIN_VALUE for min type .MAX_VALUE for max exmple : Int.MIN_VALUE
we can format double and float and specific how much degit we want take after print . using "%.DegitNumber".format(doubleVariable) exemple : var a="%.2".format(3.49744)
-No numeric types
* Boolean : it can be true or false
* Char : it represent 1 character should be inside ' '
* String : it represent serie of character should be inside " " we can get string length using  str.count() 
-Remarque
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
