package wisniowa.tc.SecondGroup.MetodaSzablonowa;

public class Pizza extends MealPrep{

    @Override
    void skladniki() {
        System.out.println("Przygotuj salami, set, ciasto, sos");
    }

    @Override
    void ugotowanie() {
        System.out.println("Wypiecz pizze");

    }

    @Override
    void serwowanie() {
        System.out.println("Zaserwuj pizze");
    }
}
