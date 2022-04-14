fun main(){
    var sa= current(1036900,"mama",3000)
 deposit(200.50)
    fruits("Banana")
    var p=prod()

}

//1.Create a classCurrentAccount with the following attributes:account
//number, account name, balance. It has the following functions:
//a.deposit(amount: Double) - Increments the balance bythe
//amount deposited
//b.withdraw(amount: Double) - Decrements the balanceby the
//amount withdrawn
//c.details() - Prints out the account number and balanceand
//name in this format: “Account number x with balance y is
//operated by z
open class current(var accNo : Int, var name:String,var balan:Int)

fun deposit(amount:Double){
    talan+=amount
    println(talan)



    }

fun withdraw(amount:Double){
    balance-=amount
    println(amount)
}
fun details(x: Int,y: Int,z: String){
    println("Account number $x with balance $y is operated by $z")

}
//Create another classSavingsAccount. It has the samefunctions and
//attributes as the current account except for one attribute,
//withdrawals: Int. Withdrawals is a counter variablethat is used to
//keep track of how many withdrawals have been made from the account
//in a year. The only other difference is that the savings account
//withdraw() method first checks if the number of withdrawalsis less
//than 4 for it to allow one to withdraw money from the account. It also
//increments the withdrawals attribute after a successful withdrawal
//(5poi

class savingAccount(var accNo.  : Int, var namr:String,var balanc:Int, var withdrawals:Int ):current(accNo,name,balan){
    fun with(withdraw:Int){
        if(withdraw < 4 ){
            println(withdraw)
}
//A product is represented by a data class with these attributes: name,
//weight, price, category. Category can either be groceries, hygiene or
//other. Write a function that takes in a product and uses a when
//statement to assign each product to a list based on its category
//(3 points)
data class prod(var name: String,var weight:Int,var price:Double,var category:String){

}
//4.Write a function that given a string returns a string composed of only
//the characters in even indices. For example given “banana” it will return
//“bnn
fun fruits (word:String):String{
    var name=""
    for (letter in word){
        if (word.indexOf(letter)%2==0){
            name+=letter
            println(name)
        }
    }
    return name
}