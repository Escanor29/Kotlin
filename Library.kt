import kotlin.math.log

//Array
//It works on vararg
/*
[vararg]:It tells that you can n numbers of argument inside any function
 */
val numbers = arrayOf(1,2,3,4,5)
val name = arrayOf("1","2","3","4",5) //We haven't given any type to array
val nameString = arrayOf<String>("2","5","1")

//Array Constructor initialization (Null Safety)
val num = Array(5,{ i->i*1 })       // 0 1 2 3 4
val nums = Array<Int>(5,{ i->i+1 })     // 1 2 3 4 5

//Primitive Array
val numArray = intArrayOf(1,2,3,4)
val strArray = charArrayOf('a','b','c')

//Null Array
val nullArray = arrayOfNulls<String>(10)

//Lists or Collections
var listOfNames = listOf<String>("A","B","C")                //immutable
var mutableListOfNames = mutableListOf<String>("A","B","C")      //mutable
var mutableArrayListOfNames= arrayListOf<String>("A","B","C")      //mutable
val mapOfNames = mapOf<Int,String>(0 to "A",1 to "B")        //immutable
val hashMapOfNames = hashMapOf<String,String>("name" to "Keshav","age" to "21")     //mutable

fun main() {
//     println(num[3])
//     nameString.set(2,"3")
//     println(nameString.get(2))
//     mutableListOfNames.add("D")
//     println(mapOfNames[0])
//     hashMapOfNames["don"]="code"
//     hashMapOfNames.forEach { (any, any2) ->
//          println( any + " " + any2)
//     }
//
//     mutableArrayListOfNames.forEach {
//          println("Traditional loop")
//          println(it)
//     }
//
//     nameString.forEach {
//          println(it)
//     }

     //for loop
//     for(name in numArray){
//          println(name)
//     }
//     for(x in 0..10){    //upper and lower part both are inclusive
//          println(x)
//     }
//     for (x in 0 until 10){   //upper part is exclusive
//          println(x)
//     }
//     for(x in 10 downTo 0 step 2){
//          println(x)
//     }
//
     val any:Any="Keshav"
//     val bAny:String=any as String
//     if(any is String){
//          any.length
//     }

//   when condition
//     when (any){
//          "Rohan" -> {
//               println("n1")
//          }
//          "Keshav" -> {
//               println("n2")
//          }
//          "Anurag" -> {
//               println("n3")
//          }
//          else -> {
//               println("n4")
//          }
//     }
//     when also return a value
//     val x = when (any){
//          "Rohan" -> "Rohan Nanda"
//          "Keshav" -> "$any Chandra Ray"
//          else ->"Nat a valid name"
//     }
//     println(x)


}