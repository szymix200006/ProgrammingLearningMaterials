package wisniowa.tc.SecondGroup.Command;

public abstract class Component {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
    }
}
