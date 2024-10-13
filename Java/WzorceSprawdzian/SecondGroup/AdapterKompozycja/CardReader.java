package wisniowa.tc.SecondGroup.AdapterKompozycja;

public class CardReader implements USB{

    private MemoryCard memoryCard;

    public CardReader(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void connect() {
        this.memoryCard.insert();
        this.memoryCard.copyData();
    }
}
