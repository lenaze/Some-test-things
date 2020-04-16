import car.Car

fun main(args: Array<String>) {
    /*val UserJava = UserJava("It's a var from Java!");
    println("Example java: ${UserJava.name}")*/

    val userKotlin = UserKotlin("It's a var from Kotlin!")
    println("Example Kotlin: ${userKotlin.name}")

    /*val a0: Int = 123
    val a1: Long = 123
    println(myFirstFunction(a0, a1))*/

    /*var a2: Boolean = true
    val a3: Char = 'h'
    println(mySecondFunction(a3))*/

    /*val str: String?
    str = myThirdFunction()
    var size = str?.length *///kotlin.KotlinNullPointerException
    //if we use @? we will not have an exception

    val car = Car(20.2, 2, true)
    println("Our car is new?") //${car.isTheCarNew}

    //printIsTheCarNew(car)
    //printIsTheCarBig(car)
    car.ride(printIsTheCarNew(car),printIsTheCarBig(car))
}

fun myFirstFunction(a: Int, b: Long): Long{
    return a * b
}

fun mySecondFunction(char: Char) = char == 'h'

fun myThirdFunction(): String? {
    return null
}

fun printIsTheCarNew(car: Car): String = when(car.isTheCarNew) {
    true -> "new"
    false -> "old"
}

fun printIsTheCarBig(car: Car): String = when{
    (car.carsWeight >= 20) -> "big"
    else -> "small"
}