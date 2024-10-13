package wisniowa.tc.SecondGroup.Prototype;


import wisniowa.tc.SecondGroup.Visitor.ResourceVisitor;

public class ImageResource implements ResourcePrototype {
    private String imagePath;

    public ImageResource(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public ResourcePrototype cloneResource() {
        return new ImageResource(this.imagePath);
    }

    @Override
    public void accept(ResourceVisitor visitor) {
        visitor.visit(this);
    }

    public void display() {
        System.out.println("Displaying image from path: " + imagePath);
    }
}