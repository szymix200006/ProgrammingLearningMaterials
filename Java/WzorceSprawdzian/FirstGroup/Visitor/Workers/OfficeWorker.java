package wisniowa.tc.FirstGroup.Visitor.Workers;

public abstract class OfficeWorker implements Worker {
    private int id;
    private String name;

    public OfficeWorker(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
