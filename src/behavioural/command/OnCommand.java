package behavioural.command;

public class OnCommand implements RemoteCommand {
    Television tv;

    public OnCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }
}
