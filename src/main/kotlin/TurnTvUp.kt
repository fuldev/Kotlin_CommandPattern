class TurnTvUp : Command {

    var theDevice:ElectronicDevice
    constructor(device: ElectronicDevice){

        this.theDevice=device
    }

    override fun execute() {
        theDevice.volumeUp()
    }
}