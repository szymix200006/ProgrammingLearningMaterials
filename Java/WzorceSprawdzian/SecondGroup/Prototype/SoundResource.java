package wisniowa.tc.SecondGroup.Prototype;


import wisniowa.tc.SecondGroup.Visitor.ResourceVisitor;

public class SoundResource implements ResourcePrototype {
    private String soundPath;

    public SoundResource(String soundPath) {
        this.soundPath = soundPath;
    }

    @Override
    public ResourcePrototype cloneResource() {
        return new SoundResource(this.soundPath);
    }

    @Override
    public void accept(ResourceVisitor visitor) {
        visitor.visit(this);
    }

    public void play() {
        System.out.println("Playing sound from path: " + soundPath);
    }
}