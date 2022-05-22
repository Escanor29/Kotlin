fun main() {

//    val user: User = User()
//    user.email


    val account = Account(12345,"Keshav",1000f)
//    val account2 = Account(12345,"Keshav" )
//    val account3 = Account(12345)
    account.deposit(100f)
    account.withDraw(150f)
    account.withDraw(50f)
    println("Account no = ${account.accNo} , name = ${account.name} , amount = ${account.amount}")

}

class User {
    val name:String = ""
    val mobile:Int = 0
    val gender:String = ""
    val email:String = ""
    val bio:String = ""

    fun checkEmail():Boolean{
        return email.isNotEmpty()
    }
}

class Account(var accNo:Int,var name:String,var amount:Float){  //1st way to write a primary constructors

////    2nd way to write primary constructors
//    var accNo:Int
//    var name:String
//    var amount:Float
//    init {
//        this.accNo=accNo
//        this.name=name.capitalize()
//       this.amount=amount + 10000
//    }



//    //Class Properties
//    var accNo:Int = 0
//    var name:String?=null
//    var amount:Float=0f

    //Constructor
    /*
        It is a function with same name as class name
        It is used to construct or initialize the class
        2 types :-
        1.Primary Constructor - Only 1
        2.Secondary Constructor - Multiple Secondary Constructors
     */

//    //Secondary Constructors
//    constructor(accNo: Int){
//        this.accNo=accNo
//        name="Default"
//        amount=0f
//    }
//    constructor(accNo: Int,name: String){
//        this.accNo=accNo
//        this.name=name
//        amount=0f
//    }
//    constructor(accNo: Int,name: String,amount: Float){
//        this.accNo=accNo
//        this.name=name
//        this.amount=amount
//    }

//    fun Account(){
//        //this point to the current receiver
//        this.accNo=accNo
//        this.name=name
//        this.amount=amount
//    }


    //Member functions
    fun deposit(money:Float){
        amount += money;
        println(amount)
    }

    fun withDraw(money: Float){
        if(amount<money){
            println("Insufficient balance")
        }else{
            amount-=money;
            println(amount)
        }
    }
}