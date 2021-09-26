object PrintDriver {
    init {
        println("Initializing with object : $this")
    }

    fun print() = println("Printing with object : $this")
}

fun main() {
    println("Start")
    PrintDriver.print()
    PrintDriver.print()
}