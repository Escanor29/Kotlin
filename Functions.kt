fun main() {
//
//    getName()
//    println(square2(10))
//    showMeUser("Keshav",21,true)    //Positional Argument
//    showMeUser("Keshav",21)    //Default Argument
//    showMeUser(age = 15, isActive = false, name = K)    //Named Arguments
    countAndPrintArgs(2,3,4)
}

val userName: String = "Ray"

//Function name should be in lowerCamelCase
fun getName(): String{
    return "Keshav"
}

fun square1(number: Int): Int {
    return number * number
}

fun square2(n: Int): Int = n*n

fun square3(n: Int) = n*n

/*
    Type of Arguments
    1.Positional Arguments
    2.Default Arguments
    3.Named Arguments
 */
fun showMeUser(name: String,age: Int=18,isActive: Boolean=false){
    println("$name $age $isActive")
}

fun countAndPrintArgs(vararg no: Int){      //vararg - as many value as u want as argument in main function
    println(no.size)
    for (i in no) println(i)
}
