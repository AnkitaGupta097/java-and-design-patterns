package behavioural.command.commands;

import behavioural.command.ICommand;
import behavioural.command.recievers.Light;

public class TurnOnLightCommand implements ICommand {
    Light light;

    public TurnOnLightCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        System.out.println("Turning on light.");
        light.turnOn();
    }
}
