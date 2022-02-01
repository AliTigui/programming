/*
-Array :
_we can make array  using arrayOf(4,5,6,7) it see the element inside the function then creat arrey objetc based en element inside it we can make array of mixed type
_the array object can't be changed if it array of integer it will not be abbel to change to string or float ...
_we can get element inside the array using index first index is 0
_we can change element of the array by index
_by creating array using val we cant assign it to new array but we can change value of variable inside it
_we can get size of array using  arrayName.size
_We can pre-determine the type of array like normal variable by using Array<type>(length){el} after array name type are : Byte Int Short Long Double Char String Boolean Float 
_we can use make array using ByteArray(length){ fill with} IntArray(length) ShortArray(length) LongArray(length) DoubleArray(length) CharArray(length) 
_StringArray(length) BooleanArray(length) FloatArray(length)
_we can transform string to array of string using str.toCharArray()
_we can max to or three or n dimenstion array exmple var a= arrayOf(arrayOf(1,2,3),arrayOf(4,5,6),arrayOf(7,8,9)) we use double index for get element
_we can loop element of array using  for loop with the keyword in
_we can get  length of array using .count() or .size
-list
_List arr like array collection of data but we wan add end remove element
_for creat list we use var list=ArrayList<type>()
_for add element we use listName.add(value) for get element we use index or listName.get(index)
_for remove value we use listName.remove(value) or listName.removeAt(index)
_for remove all element we use listName.removeAll(listName)
_for edit element we can use index listName[index] = nexValue or listName.set(index,value)
_for add other list or element to or list we use listName.addAll(arr)
_we can make list with var l = listOf(1,4,"9") but this type we can't add or change value or remove element 
_we can use var l = arrayListOf(1 ,5,"ali") here like ArrayList() we can edit add and modify
_there is mutableListOf()  it can be change to
_we can loop in array or list using .withIndex() Exemple : for((Index,Valur) in arr.widthIndex()) println("in index = $Index we have $Value")
_we can use arr.forEach{ print(it)} for print all element of array or list it referre to element we can change it
_exemple arr.forEach{ el-> print(el)} we can do other operatoin to the element not just print them
_we can use arr.forEachIndexed{index,val-> statement} it return the index and value
-Map
var a= HashMap<String,String>()
    a.put("user","name")
    a.values // get only values
    a.keys // get keys
    a.set("user","ali")// change value in key we can do a["name"]="ali"
    a.get("user")// for get that value we can use a["user"]
    /*
    for in with map print key and value we can use .key or .value print what we want
    .size get element number
    remove all element we use .clear() a.remove(key) remove element with it key
    break stop loop continue saut skip

    map
 forEach
 mutableListOf

we can add  and mix list anr array together using + operateur 
for array they must be the same type 
array list of can be added if they are not same type 
we can't add element to the result of some of array 
we can filter array or list using .filter{conditoin}
 exemple v=list.filter{it >5} it referr to current element when the filter is looping throught the array 









*/
