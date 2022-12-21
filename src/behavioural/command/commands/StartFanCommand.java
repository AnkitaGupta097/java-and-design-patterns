package behavioural.command.commands;

import behavioural.command.ICommand;
import behavioural.command.recievers.Fan;

public class StartFanCommand implements ICommand {
    Fan fan;

    public StartFanCommand(Fan fan) {
        this.fan = fan;
    }

    public void execute() {
        System.out.println("starting Fan.");
        fan.start();
    }
}
