package car

class Car(private var weight: Double, private var size: Int, private var isNew: Boolean) : Ride{

    var isTheCarNew: Boolean
        get() {
            return isNew
        }
        set(value) {
            isNew = value
        }

    val carsWeight: Double
        get() = weight

    override fun ride(isNew: String, weight: String) {
        println("We can ride one the $isNew $weight car!")
    }
}