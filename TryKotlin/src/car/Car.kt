package car

class Car(private var weight: Double, private var size: Int, private var isNew: Boolean){

    var isTheCarNew: Boolean
        get() {
            return isNew
        }
        set(value) {
            isNew = value
        }

    val carsWeight: Double
        get() = weight

    fun ride(isNew: String, weight: String) {
        println("We can ride one the $isNew $weight car!")
    }
}