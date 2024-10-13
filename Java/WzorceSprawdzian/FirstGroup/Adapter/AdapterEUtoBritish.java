package wisniowa.tc.FirstGroup.Adapter;

public class AdapterEUtoBritish implements BritishStandardPlug
{
    private EUPlug plug;

    public AdapterEUtoBritish(EUPlug plug) {
        this.plug = plug;
    }

    @Override
    public void provideElectricity() {
        plug.StormGeben();
    }
}
