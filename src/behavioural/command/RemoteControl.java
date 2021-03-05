package behavioural.command;

public class RemoteControl {
    private RemoteCommand command;

    public void pressButton() {
        command.execute();
    }


    public RemoteCommand getCommand() {
        return command;
    }

    public void setCommand(RemoteCommand command) {
        this.command = command;
    }
}
