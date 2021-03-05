package behavioural.command;

public class OffCommand implements RemoteCommand {
    Television tv;

    public OffCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }
}
