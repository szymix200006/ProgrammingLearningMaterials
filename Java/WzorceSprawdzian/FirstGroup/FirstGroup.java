package wisniowa.tc.FirstGroup;
import wisniowa.tc.FirstGroup.AbstractFactory.Factories.*;
import wisniowa.tc.FirstGroup.AbstractFactory.Creatures.*;
import wisniowa.tc.FirstGroup.Adapter.AdapterEUtoBritish;
import wisniowa.tc.FirstGroup.Adapter.BritishSocket;
import wisniowa.tc.FirstGroup.Adapter.EUPlug;
import wisniowa.tc.FirstGroup.Bridge.BasicRemote;
import wisniowa.tc.FirstGroup.Bridge.TV;
import wisniowa.tc.FirstGroup.Chain.*;
import wisniowa.tc.FirstGroup.Command.*;
import wisniowa.tc.FirstGroup.Dekorator.CzlowiekPakietL;
import wisniowa.tc.FirstGroup.Dekorator.CzlowiekPakietM;
import wisniowa.tc.FirstGroup.Dekorator.CzlowiekPakietS;
import wisniowa.tc.FirstGroup.Dekorator.ICzlowiek;
import wisniowa.tc.FirstGroup.FacadeNatali.Facade;
import wisniowa.tc.FirstGroup.Factory.CreatedObject;
import wisniowa.tc.FirstGroup.Factory.Creator;
import wisniowa.tc.FirstGroup.Factory.WPFCreator;
import wisniowa.tc.FirstGroup.Mediator.FlyingVehicle;
import wisniowa.tc.FirstGroup.Mediator.Helicopter;
import wisniowa.tc.FirstGroup.Mediator.Mediator;
import wisniowa.tc.FirstGroup.Mediator.Tower;
import wisniowa.tc.FirstGroup.Observer.Customer;
import wisniowa.tc.FirstGroup.Observer.Store;
import wisniowa.tc.FirstGroup.Prototype.Airplane;
import wisniowa.tc.FirstGroup.Proxy.Cash;
import wisniowa.tc.FirstGroup.Proxy.CreditCard;
import wisniowa.tc.FirstGroup.State.Package;
import wisniowa.tc.FirstGroup.Strategy.BikeStrategy;
import wisniowa.tc.FirstGroup.Strategy.CarStrategy;
import wisniowa.tc.FirstGroup.Strategy.LegsStrategy;
import wisniowa.tc.FirstGroup.Strategy.Strategy;
import wisniowa.tc.FirstGroup.Visitor.Interfaces.WorkersWages;
import wisniowa.tc.FirstGroup.Visitor.Workers.Manager;
import wisniowa.tc.FirstGroup.Visitor.Workers.OfficeWorker;
import wisniowa.tc.FirstGroup.Visitor.Workers.Programmer;
import wisniowa.tc.FirstGroup.Visitor.Workers.Tester;
import wisniowa.tc.SecondGroup.Singleton.ResourceManager;

import java.util.Scanner;

public class FirstGroup {
    public static void runAllPatterns() {
//        singleton();
//        prototype();
//        state();
//        abstractFactory();
//        strategy();
//        chain();
//        bridge();
//        facade();
//        proxy();
//        observer();
       // adapter();
//        command();
//        visitor();
        //factory();
        mediator();
    }

    /**
     * Paweł Brzuszkiewicz
     */
    public static void abstractFactory()
    {
        HumanFactory goodPeopleFactory = new GoodPeopleFactory();
        HumanFactory badPeopleFactory = new BadPeopleFactory();

        Czlowiek goodMan = goodPeopleFactory.CreateHuman();
        Czlowiek badMan = badPeopleFactory.CreateHuman();

        Dziecko goodChild = goodPeopleFactory.CreateChild();
        Dziecko badChild = badPeopleFactory.CreateChild();

        System.out.println("\n ALKOHOLIK");
        goodMan.SayHello();
        goodMan.SayGoodbye();

        System.out.println("\n PALACZ");
        badMan.SayHello();
        badMan.SayGoodbye();

        System.out.println("\n NIEMOWLAK");
        goodChild.SayHello();
        goodChild.SayGoodbye();

        System.out.println("\n NASTOLATEK");
        badChild.SayHello();
        badChild.SayGoodbye();
    }

    /**
     undefined programmer
     */
    public static void singleton() {
        ResourceManager resourceManager = ResourceManager.getInstance();
    }

    /**
     * Sławek Dąbrowski
     */
    public static void prototype() {
        Airplane airplane1 = new Airplane(100, "Boeing", "White");
        Airplane airplaneCopy = (Airplane) airplane1.clone();


        System.out.println(airplane1);
        System.out.println(airplaneCopy);

        airplane1.setColor("black");
        System.out.println(airplane1);
        System.out.println(airplaneCopy);
    }

    // Władysława Wolska
    public static void state(){
        Package pkg = new Package();
        pkg.previousState();
        pkg.showDetails();
        pkg.nextState();
        pkg.showDetails();
        pkg.nextState();
        pkg.nextState();
        pkg.showDetails();
        pkg.previousState();
    }

    /**
     * Żochowski Bartłomiej
     */
    public static void strategy() {
        Strategy strategy;
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj trasę (km):");
        float a = Float.parseFloat(scanner.nextLine());

        System.out.println("podaj model transportu (legs, bike, car):");
        String strategyType = scanner.nextLine();


        if(strategyType == "legs"){
            strategy = new LegsStrategy();
        } else if (strategyType == "bike") {
            strategy = new BikeStrategy();
        } else {
            strategy = new CarStrategy();
        }

        float time = strategy.road(a);
        System.out.println("czas drogi wynosi: " + time + " godziny");
    }


    /**
     * Filip Nowak
     * */
    public static void chain(){
        int number=-3;
        Handler handler = new PositiveNumberHandler(new DividableByTwo(null));
        if(handler.handle(number)){
            System.out.println("number is positive and by two");
        }
    }

    /**
     Wojciech Burek
     */
    public static void bridge(){
        TV t1 = new TV();
        BasicRemote br = new BasicRemote(t1);
        t1.setChannel(10);
        System.out.println(t1.getChannel());
    }

    /**
     Przemyłska Natalia
     */
    public static void facade(){
        Facade facade = new Facade();
        System.out.println(facade.translateAndPutDot("glupiutki :3"));
    }

    /**
     Szymon Niedziółka
     */
    public static void proxy(){
        Cash creditCard = new CreditCard();
        creditCard.pay(1_000_000);
    }

    /**
     Kacper Tomasiak
     */

    public static void observer() {
        Store store = new Store();

        Customer customer1 = new Customer("John");
        Customer customer2 = new Customer("Alice");

        store.addCustomer(customer1);
        store.addCustomer(customer2);

        store.notifyCustomers();
    }

    /**
     * Wojciech Bury
     * */
    public static void adapter(){
        BritishSocket gniazdko = new BritishSocket();
        EUPlug wtyczka = new EUPlug();

        AdapterEUtoBritish adapter = new AdapterEUtoBritish(wtyczka);

        gniazdko.plugIn(adapter);
    }

    /**
     * Mateusz Opala
     */
    public static void command(){
        Telewizor tv = new Telewizor();


        Polecenie wlaczTV = new Wlacz(tv);
        Polecenie wylaczTV = new Wylacz(tv);
        Polecenie zmienKanal = new ZmienKanal(tv);

        Pilot pilot = new Pilot();

        pilot.setPolecenie(wlaczTV);
        pilot.wcisnijPrzycisk();
        pilot.setPolecenie(wylaczTV);
        pilot.wcisnijPrzycisk();
        pilot.setPolecenie(zmienKanal);
        pilot.wcisnijPrzycisk();
    }

    public static void visitor() {
        Programmer pr1 = new Programmer(1, "Bartosz Moszczyński");
        Tester t1 = new Tester(2, "Jan Kowalski");
        Manager m1 = new Manager(3, "Karol Nowak");

        WorkersWages ww = new WorkersWages();

        ww.export(pr1, t1, m1);
    }

    public static void factory() {
        Creator c1 = new WPFCreator();

        CreatedObject button = c1.createButton();
        button.print();

    }




    public static void dekorator() {
        ICzlowiek slaboUbranyCzlowiek = new CzlowiekPakietS();
        ICzlowiek srednioUbranyCzlowiek = new CzlowiekPakietM(new CzlowiekPakietS());
        ICzlowiek mocnoUbranyCzlowiek =
                new CzlowiekPakietL(new CzlowiekPakietM(new CzlowiekPakietS()));
        slaboUbranyCzlowiek.showInfo();
        System.out.println("------------");
        srednioUbranyCzlowiek.showInfo();
        System.out.println("------------");
        mocnoUbranyCzlowiek.showInfo();
        System.out.println("------------");
    }

    public static void mediator() {
        Mediator mediator1 = new Tower();


        FlyingVehicle hel1 = new Helicopter();
        hel1.setMediator(mediator1);
        mediator1.addVehicle(hel1);
        hel1.sentMessage("landing request");
        System.out.println("-----------------");

    }




}
