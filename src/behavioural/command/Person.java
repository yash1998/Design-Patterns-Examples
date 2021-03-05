package behavioural.command;

public class Person {
    public static void main(String[] args) {
        Television tv = new Television();
        RemoteControl rc = new RemoteControl();
        rc.setCommand(new OnCommand(tv));
        rc.pressButton();
        rc.setCommand(new OffCommand(tv));
        rc.pressButton();
    }
}
