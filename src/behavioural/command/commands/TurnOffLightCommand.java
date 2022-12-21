package behavioural.command.commands;

import behavioural.command.ICommand;
import behavioural.command.recievers.Light;

public class TurnOffLightCommand implements ICommand {
    Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        System.out.println("Turning off light.");
        light.turnOff();
    }
}
