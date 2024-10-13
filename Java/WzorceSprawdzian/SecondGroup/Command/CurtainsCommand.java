package wisniowa.tc.SecondGroup.Command;

public class CurtainsCommand implements Command{
    Curtains curtains;

    public CurtainsCommand(Curtains curtains) {
        this.curtains = curtains;
    }

    @Override
    public void execute() {
        this.curtains.openClose();
    }
}
