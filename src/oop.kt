fun main()
{
    val bMWCar=BMW()
    println(bMWCar.getFuelType())
    println(bMWCar.isEcoFriendly())

    val teslaCar =Tesla()
    println(teslaCar.getFuelType())
    println(teslaCar.isEcoFriendly())
}

// Interface
interface Moving
{
    fun isEcoFriendly():String
}

abstract class Car(model:String,color:String,speed:Int):Moving
{
    abstract fun getFuelType ():String
}

class BMW:Car( "BMW","Black",360)
{
    override fun getFuelType():String
    {
        return "BMW fuel: 100 gneh 92"
    }

    override fun isEcoFriendly():String
    {
        return "BMW uses Fuel : not Eco-Friendly"
    }
}

class Tesla:Car("Tesla","Red",380)
{
    override fun getFuelType():String
    {
        return "Tesla is Electric: No fuel type  "
    }
    override fun isEcoFriendly():String
    {
        return "Tesla is Eco-Friendly"
    }
}