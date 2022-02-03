/* //o O
-Array :
Array are collection of data that have a specific length we can't change the length of in array it is statique but we can change the element inside it
there is many way for creat array first is using arrayOf(4,7,5,"7") with those element inside the parentheses the type of the array will be the type of the element
that we fill the array with if they are mixed the array then will be mixed type that mean we can put anny value inside it . if we creat array of a specific type 
we can't assigne to it element a value with type deffirent then the array type 
*Exemple : var a = arrayOf(4,5,7,8) we can't do a[1] = 5.8 but if it mixed type array we can do that .
we can get array element using index first element is index 0 and we can change it value by assign new value to it. exemple arr[4] the fifth element 
creating array using val mean we can't assigne new value to the variable that have the array but we still able to change value of element inside it 
we can get size of array using  .size or .count() exemple arr.count()
we can make array with string by transfor it to char array using str.toCharArray()
we can loop through all array element using for loop exemple : for(el in arr){println(el)}
we can get check if value exist in array using arr.indexOf(val) if value exist we get it index else we get -1 .but the value must be same type of the array or we will get error
   or we can use arr.contains(val) it return true if array exist else return false. type of val must be same as array type 
we can reverse the array and store it if we want using arr.reversed() exemple: reversedArr = arr.reversed()
assign array variale to another one mean any change  in one of them wsill effect the other exemple car b = arr change in arr will efect b and change in be to cause they
   point to the same array for fix that we use arr.copyOf() it mean copy all arr element and put them in variable that we want we can use arr.copyOfRange(start ,end)
   for get copy of range of element not all element
*Remarque if we print array with println we see it type for see it element we use  arr.asList() exempl : println(arr.asList()) we get somthing like [4, 4, 4, 4]
we can join 2 or more array together using + but they must be the same type exemple: var a = arrayOf(4, 9, 10, 0); var b = arrayOf(4, 5, 7, 8); println((a + b).asList())
   we get as result [4, 9, 10, 0, 4, 5, 7, 8]
we can filter array or list element  using arr.filter{conditoin} coundition can be any statement or operation that return boolean exemple v=list.filter{it >5} it referre to the curent element
wa can get  a ready range of array or list index using arr.indices it return 0..lastIndex
arr.lastIndex return last index of array arr.lastIndexOf(val) return last index where we get the value
ther is other whay to make array is by define it type and assigne value to it automatically  we can use Array<type>(length){el} the element el should be same type of the array
   it will fill all the array we can't make  kotlin know type automaticlly  by don't specific it exemple Array(length){el}
we can  also use ByteArray(length){ fill with} IntArray(length) ShortArray(length) LongArray(length) DoubleArray(length) CharArray(length) StringArray(length) 
   BooleanArray(length) FloatArray(length)
we can change the default valeu by using equation inside the block {} exemple: var a = Array(6){x -> x + 1} we will get  1 2 3 4 5 6 we can make it more complex
   but here x is always referre to current element index the index 
we can nest array inside another and get multiple dimension array exmple: var a= arrayOf(arrayOf(1,2,3),arrayOf(4,5,6),arrayOf(7,8,9)) we use double index for get element

-List:
List are collection of data too but we wan add end remove element to it they are dynamique
for creat list we use var list=ArrayList<type>() the type is obligatory and  when we add element they must be same type of the list or we get error we can make the type
   Any it will give us the ability to add any element to the list
we can add element to the list using listName.add(value) for get element we use index or listName.get(index)
we can remove value with listName.remove(value) or listName.removeAt(index)
we can remove all element with listName.removeAll(listName)
we can edit element with index listName[index] = newValue or listName.set(index,value)
we can add other list array to our list with listName.addAll(arr)
if we want creat list with mixed type we can use listOf(1,4,"9") but this type we can't add or change value or remove element. we can use arrayListOf(1 ,5,"ali") 
   it can be modified like ArrayList() but it better it accept mixed type and we can use mutableListOf() it like arrayListOf()
we can loop in array or list using list.withIndex() Exemple : for((Index,Valur) in arr.widthIndex()) println("in index = $Index we have $Value")
we can use arr.forEach{ print(it)} for print all element of array or list "it" referre to currrnt element we can change it exemple arr.forEach{ el-> print(el)} 
    we can do other operatoin to the element not just print them
we can use arr.forEachIndexed{index,val-> statement} it return the index and value
we can add ArrayList() arrayListOf() mutableListOf() listOf() with + operateur even if they are not the same type 

-Map:
Map are colection that store data in key -> valeu format we can creat read only map using var a = mapOf("a" to 1, "b" to 2, "c" to 3) a ,b,c are key 1,2,3 are value
we access  map value using key exemple var b = a["c"] value of b is 3 or we can use a.get("c")
we can print key valeur using for ((k,v) in map){print("$k -> $v")} we can get list of it value using map.values and for key we use map.keys or we wan use 
  for (el in map){print("${el.key} -> ${el.value} ")}
we can get size of the map using map.size or map.count()
we can creat map that we can change it by using mutableMapOf(1 to 100, 2 to 100, 3 to 100)  or HashMap<String,String>()
we can add value using key and index exemple  map["newKey"]=value or using map.put(key,value) for that we can use map.set(key,value) too
we can remove all element with map.clear()  or remove only key value pair using a.remove(key)

-Set:
set are colection of data that the value inside them don't repeat each value is unique for creat read only set we use setOf() for creat set that 
   we can modify we use mutableSetOf()






