package wisniowa.tc.SecondGroup.Visitor;

import wisniowa.tc.SecondGroup.Prototype.ImageResource;
import wisniowa.tc.SecondGroup.Prototype.SoundResource;

public interface ResourceVisitor {
    void visit(ImageResource image);
    void visit(SoundResource sound);
}
