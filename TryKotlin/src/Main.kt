fun main(args: Array<String>): Unit {
    var UserJava = UserJava("It's a var from Java!");
    println("Example java: ${UserJava.name}")

    var userKotlin = UserKotlin("It's a var from Kotlin!")
    println("Example Kotlin: ${userKotlin.name}")
}