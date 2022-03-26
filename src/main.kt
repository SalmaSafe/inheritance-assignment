fun main(){
     var car=Car("Subsidiary","mercedes-Benz GLE 350","Black", 5)
      car.carry(7)
    car.identity()
    car.calculateParkingFee(3)

    var bus=Bus("Toyo,a","toyota mazda","Grey",30)
    bus.maxTripFare(80.50)
    bus.calculateParkingFee(2)


}
//-carry(people: Int) : Prints out “Carrying $peoplepassengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
//(3 points)
//-identity() : Prints out the color, make and modelin the following
//format e.g:  “I am a white subaru legacy”(1 point)
//-calculateParkingFees(hours: Int) : Calculates andreturns the
//parking fees by multiplying the hours by 20(1 point)
open class Car(var make:String, var model:String,var color:String,var capacity:Int){
    fun carry(people:Int){
        var excess=people - capacity
        if (people<=5){
            println("carrying $people passengers")
        }
        else
            (println("Overcapacity by $excess people"))

    }
    fun identity(){
        println("I have a $color $make $model")
    }
     open fun calculateParkingFee(hours:Int):Int{
          var time= hours * 20
        println(time)
         return time
    }
}
//Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip.(2 points)
//The bus’calculateParkingFees method returns the productof hours and
//the capacity of the bus
class Bus(make:String, model:String,color:String,capacity:Int):Car(make,model,color,capacity){
    fun maxTripFare(fare:Double): Double{
        var tripFare= capacity * fare
        println(tripFare)
        return tripFare
    }

    override fun calculateParkingFee(hours: Int):Int{
        var product= hours* capacity
        println(product)

        return product

    }



}
