fun main(){
    var mine=Current("1036900100","Mseee",5000.0)
    mine.deposit(2000.0)
    mine.withdraw(500.5)
    mine.details()
    var masaving=Savings("1036900100","Ule",50005,350)
    masaving.deposit(3000.5)
    masaving.withdraw(1000.5)
    println( masaving.withdrawal)
    masaving.details()
    var a=Product("pads",12.0,20.0,"hygiene")
    Products(a)
    var b=Product("apple",3.0,25.5,"groceries")
    Products(b)
    var c=Product("book",10.5,100.5,"other")
    Products(c)
    var d=Product("ipad",5.0,1250.5,"other")
    Products(d)
    eIndices("Banana")
    eIndices("Safe")


}
open class Current(var accountNumber:String,var accountName:String,var balance:Double){
    fun deposit(amount:Double){
        balance+=amount
        println(balance)
    }
    open fun withdraw(amount: Double){
        balance-=amount
        println(balance)
    }
    fun details(){
        println("Account number $accountNumber with balance $balance is operated by $accountName")
    }

}
class Savings(accountNumber: String,accountName: String,balance: Double, var withdrawal:Int):Current(accountNumber,accountName,balance){
    override fun withdraw(amount: Double) {
        if (withdrawal<4){
            balance-=amount
        }
        println(balance)
        withdrawal++
    }
}
data class Product(var name:String, var weight:Double,var price:Double,var category:String)
fun Products(producttt:Product){

    var groceriesLists= mutableListOf<Product>()
    var hygieneLists= mutableListOf<Product>()
    var otherLists= mutableListOf<Product>()
    when(producttt.category){
        "groceries"-> groceriesLists.add(producttt)
        "hygiene"->hygieneLists.add(producttt)
        "other"->otherLists.add(producttt)
    }
    println( listOf(producttt))

}
fun eIndices(word:String):String{
    var fruit=""
    word.forEachIndexed { index, c ->
        if (index%2==0){
            fruit+=c
        }
    }
    println(fruit)
    return fruit

}