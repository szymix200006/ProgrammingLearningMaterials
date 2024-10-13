package wisniowa.tc.SecondGroup.Prototype;

import wisniowa.tc.SecondGroup.Visitor.ResourceVisitor;

public interface ResourcePrototype {
    ResourcePrototype cloneResource();
    void accept(ResourceVisitor visitor);
}
