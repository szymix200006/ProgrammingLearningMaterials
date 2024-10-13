package wisniowa.tc.FirstGroup.Factory;

public class WPFCreator implements Creator {
    public WPFButton createButton() {
        return new WPFButton();
    }

    @Override
    public CreatedObject createCombo() {
        return new WPFCombo();
    }
}
