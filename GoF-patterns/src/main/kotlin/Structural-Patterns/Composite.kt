open class Equipment(private var price: Int, private var name: String) {
    open fun getPrice(): Int = price
}

open class Composite(name: String) : Equipment(0, name) {

    val equipments = ArrayList<Equipment>()

    fun add(equipment: Equipment) {
        this.equipments.add(equipment)
    }

    override fun getPrice(): Int {
        return equipments.sumOf { it -> it.getPrice() }
    }
}

class Cabbinet : Composite("cabbinet")

class FloppyDisk : Equipment(70, "Floppy Disk")
class HardDrive : Equipment(250, "Hard Drive")
class Memory : Equipment(280, "Memory")

fun main() {
    val cabbinet = Cabbinet()

    cabbinet.add(FloppyDisk())
    cabbinet.add(HardDrive())
    cabbinet.add(Memory())

    println(cabbinet.getPrice())
}
