/*
  

 
  -Array :
  # we can make array  using arrayOf(4,5,6,7) it see the element inside the function then creat arrey objetc based en element inside it we can make array of mixed type
  # the array object can't be changed if it array of integer it will not be abbel to change to string or float ...
  # we can get element inside the array using index first index is 0
  # we can change element of the array by index
  # by creating array using val we cant assign it to new array but we can change value of variable inside it
  # we can get size of array using  arrayName.size
  #We can pre-determine the type of array like normal variable by using Array<type>(length){el} after array name type are : Byte Int Short Long Double Char String Boolean Float 
  #we can use make array using ByteArray(length){ fill with} IntArray(length) ShortArray(length) LongArray(length) DoubleArray(length) CharArray(length) 
  #StringArray(length) BooleanArray(length) FloatArray(length)
  # we can transform string to array of string using str.toCharArray()
  # we can max to or three or n dimenstion array exmple var a= arrayOf(arrayOf(1,2,3),arrayOf(4,5,6),arrayOf(7,8,9)) we use double index for get element
  # we can loop element of array using  for loop with the keyword in
  we can get  length of array using .count() or .size
  -list
  #List arr like array collection of data but we wan add end remove element
  # for creat list we use var list=ArrayList<type>()
  # for add element we use listName.add(value) for get element we use index or listName.get(index)
  # for remove value we use listName.remove(value) or listName.removeAt(index)
  # for remove all element we use listName.removeAll(listName)
  # for edit element we can use index listName[index] = nexValue or listName.set(index,value)
  # for add other list or element to or list we use listName.addAll(arr)
  # we can make list with var l = listOf(1,4,"9") but this type we can't add or change value or remove element 
  # we can use var l = arrayListOf(1 ,5,"ali") here like ArrayList() we can edit add and modify
  - there is mutableListOf()  it can be change to
  - we can loop in array or list using .withIndex() Exemple : for((Index,Valur) in arr.widthIndex()) println("in index = $Index we have $Value")
  - we can use arr.forEach{ print(it)} for print all element of array or list it referre to element we can change it
  - exemple arr.forEach{ el-> print(el)} we can do other operatoin to the element not just print them
  - we can use arr.forEachIndexed{index,val-> statement} it return the index and value
  */

 var  arr2:Array<Byte> =arrayOf(8,57,2,7)
 
 /*
 -Loop and controle flow : there is three type of loop
 # do{ }while() run code then test condition  while(){} check condition before run code for(){} run code for know number of time 
     repeat(n){} repeat statement n time
 # for loop is the mor complicated when we can use it for loop through array element or we can use it for loop through range of number
     Exemple : for(i in el){ println(i)} or we can use for(i in 0..9){println(i)} if we want it revers count we use for(i in 6 downTo 0 step 2){ println(i)}
     if we didn't add step it will be 1
 
 # if(condition 1){ code 1}else if(condition 2){ code 2} else{ code if all false }
 # we can use if else to return value exemple var a= if(j>5) "big" else "small"
 # we can use when(var){val1 -> statement val2-> statement else->statement} it work like switch case
      we can test for range exmple when(var){ in 0..9-> statement else{}}

     
 
 
 
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
