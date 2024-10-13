package wisniowa.tc.SecondGroup.Visitor;

import wisniowa.tc.SecondGroup.Prototype.ImageResource;
import wisniowa.tc.SecondGroup.Prototype.SoundResource;

public class LocalizationVisitor implements ResourceVisitor {
    private String locale;

    public LocalizationVisitor(String locale) {
        this.locale = locale;
    }

    @Override
    public void visit(ImageResource image) {
        System.out.println("Localizing image for locale: " + locale);
    }

    @Override
    public void visit(SoundResource sound) {
        System.out.println("Localizing sound for locale: " + locale);
    }
}