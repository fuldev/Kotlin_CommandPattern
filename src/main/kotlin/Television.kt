class Television:ElectronicDevice {

    var volume = 0

    override fun on() {
        println("Tv is ON")
    }

    override fun off() {
        println("Tv is OFF")
    }

    override fun volumeUp() {
        volume++
        println("Tv volume at : ${volume} ")
    }

    override fun volumeDown() {
        volume--
        println("Tv volume at : ${volume}")
        }


}