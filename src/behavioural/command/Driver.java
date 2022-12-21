package behavioural.command;

import behavioural.command.commands.StartFanCommand;
import behavioural.command.commands.StopFanCommand;
import behavioural.command.commands.TurnOnLightCommand;
import behavioural.command.recievers.Fan;
import behavioural.command.recievers.Light;

public class Driver {

    public static void main(String[] args)
    {
        Light livingRoomLight = new Light();  //receiver 1

        Fan livingRoomFan = new Fan();  //receiver 2


        HomeAutomationRemote remote = new HomeAutomationRemote(); //Invoker

        remote.setCommand(new TurnOnLightCommand( livingRoomLight ));
        remote.buttonPressed();

        remote.setCommand(new StartFanCommand( livingRoomFan ));
        remote.buttonPressed();
        remote.buttonPressed();

        remote.setCommand(new StopFanCommand( livingRoomFan ));
        remote.buttonPressed();


    }

}
