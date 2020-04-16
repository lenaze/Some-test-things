class Car(private var weight: Double, private var size: Int, private var isNew: Boolean) {

    var isTheCarNew: Boolean
        get() {
            return isNew
        }
        set(value) {
            isNew = value
        }
}