package wisniowa.tc.SecondGroup.MetodaSzablonowa;

public class Tosty extends MealPrep{
    @Override
    void skladniki() {
        System.out.println("Przygotuj chleb tostowy, ser mozzarella, tunczyk");
    }

    @Override
    void ugotowanie() {
        System.out.println("Upiecz tosty w tosterze");
    }

    @Override
    void serwowanie() {
        System.out.println("Zjedz tosty");
    }
}
