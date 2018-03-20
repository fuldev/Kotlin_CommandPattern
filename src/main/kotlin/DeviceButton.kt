class DeviceButton {

    var thecommand:Command
    constructor(newCommand: Command){
        thecommand=newCommand
    }

    fun press(){

        thecommand.execute()
    }
}