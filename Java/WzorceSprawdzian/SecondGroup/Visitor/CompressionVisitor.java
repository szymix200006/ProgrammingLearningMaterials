package wisniowa.tc.SecondGroup.Visitor;


import wisniowa.tc.SecondGroup.Prototype.ImageResource;
import wisniowa.tc.SecondGroup.Prototype.SoundResource;

public class CompressionVisitor implements ResourceVisitor {
    @Override
    public void visit(ImageResource image) {
        System.out.println("Compressing image: " + image);
    }

    @Override
    public void visit(SoundResource sound) {
        System.out.println("Compressing sound: " + sound);
    }
}