package wisniowa.tc.FirstGroup.Fasada;


public class ZamowienieMain {
    MyCleaner pawel = new MyCleaner();
    public Drink giveMeDrink(String name){
        pawel.makeCleaning();
        SugarDeliver sugarDeliver = SugarDeliver.getInstance();
        if(sugarDeliver.getSugarInMagazine()>=10){
            sugarDeliver.setSugarInMagazine(sugarDeliver.getSugarInMagazine()-10);
            Transporter transporter = Transporter.getInstance();
            if(transporter.getPetrol()>=15){
                transporter.setPetrol(transporter.getPetrol()-15);
                return new Drink(name, true, 10);
            }
        }
        System.out.println("Nie udalo sie drinka zamowic");
        return null;
    }
}
