class PlayWithRemote {




}
fun main(args:Array<String>){

    var newDevice :ElectronicDevice
    newDevice=TvRemote.getDevice()

    var onCommand : TurnTvOn = TurnTvOn(newDevice)
    var onPressed:DeviceButton = DeviceButton(onCommand)

    onPressed.press()



}