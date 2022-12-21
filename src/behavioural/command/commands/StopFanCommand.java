package behavioural.command.commands;

import behavioural.command.ICommand;
import behavioural.command.recievers.Fan;

public class StopFanCommand implements ICommand {

    Fan fan;
    public StopFanCommand(Fan fan) {
        this.fan = fan;
    }

    public void execute() {
        System.out.println("stopping Fan.");
        fan.stop();
    }
}
