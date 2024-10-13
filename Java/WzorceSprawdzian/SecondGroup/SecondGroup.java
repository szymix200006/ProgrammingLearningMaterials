package wisniowa.tc.SecondGroup;

import wisniowa.tc.SecondGroup.AdapterKompozycja.CardReader;
import wisniowa.tc.SecondGroup.AdapterKompozycja.MemoryCard;
import wisniowa.tc.SecondGroup.AdapterKompozycja.USB;
//import wisniowa.tc.SecondGroup.Bridge.Kaldi;
import wisniowa.tc.SecondGroup.Command.CurtainsCommand;
import wisniowa.tc.SecondGroup.Command.LightsCommand;
import wisniowa.tc.SecondGroup.Command.Room;
import wisniowa.tc.SecondGroup.Decorator.AsdDEcorator;
import wisniowa.tc.SecondGroup.Decorator.DataSourceDecorator;
import wisniowa.tc.SecondGroup.Decorator.EncryptionDecorator;
import wisniowa.tc.SecondGroup.Decorator.FileDataSource;
import wisniowa.tc.SecondGroup.FabrykaAbstrakcyjna.Kasynko;
import wisniowa.tc.SecondGroup.FabrykaAbstrakcyjna.PrzegrywajaceKasynko;
import wisniowa.tc.SecondGroup.FabrykaAbstrakcyjna.WygrywajaceKasynko;
import wisniowa.tc.SecondGroup.Fasada.DeliveryBoxFacade;
import wisniowa.tc.SecondGroup.Kompozyt.Menadzer;
import wisniowa.tc.SecondGroup.Kompozyt.Pastuch;
import wisniowa.tc.SecondGroup.Mediator.*;
import wisniowa.tc.SecondGroup.MetodaSzablonowa.Pizza;
import wisniowa.tc.SecondGroup.MetodaSzablonowa.Tosty;
import wisniowa.tc.SecondGroup.MetodaWytwórcza.Fabryka;
import wisniowa.tc.SecondGroup.MetodaWytwórcza.FabrykaCzolguw;
import wisniowa.tc.SecondGroup.MetodaWytwórcza.FabrykaZabkobusuw;
import wisniowa.tc.SecondGroup.Observer.PublishingEntity;
import wisniowa.tc.SecondGroup.Observer.SubscribingEntity;
import wisniowa.tc.SecondGroup.Pelnomocnik.Parobek;
import wisniowa.tc.SecondGroup.Pelnomocnik.Serwer;
import wisniowa.tc.SecondGroup.Prototype.ImageResource;
import wisniowa.tc.SecondGroup.Prototype.ResourcePrototype;
import wisniowa.tc.SecondGroup.Prototype.SoundResource;
import wisniowa.tc.SecondGroup.Singleton.ResourceManager;
import wisniowa.tc.SecondGroup.Stan.Kawomat;
import wisniowa.tc.SecondGroup.Strategia.Dodawanie;
import wisniowa.tc.SecondGroup.Strategia.KalkulatorKantor;
import wisniowa.tc.SecondGroup.Strategia.Mnożenie;
import wisniowa.tc.SecondGroup.Strategia.Odejmowanie;
import wisniowa.tc.SecondGroup.TripDecorator.*;
import wisniowa.tc.SecondGroup.Visitor.CompressionVisitor;
import wisniowa.tc.SecondGroup.Visitor.LocalizationVisitor;
import wisniowa.tc.SecondGroup.bridge2.Remote;
import wisniowa.tc.SecondGroup.bridge2.SpecialRemote;
import wisniowa.tc.SecondGroup.bridge2.StandardRemote;
import wisniowa.tc.SecondGroup.bridge2.Tv;

public class SecondGroup {
    public static void runAllPatterns() {
//        singleton();
//        prototype();
//        visitor();
//        metodaSzablonowa();
//        metodaWytworcza();
        pelnomocnik();
//        most();
//        mediator();
//        strategia();
//        fasada();
//        fabrykaAbstrakcyjna();
//        observer();
//        AdapterKompozycja();
//        AdapterDziedziczenie();
//        stan();
//        most2();
            //Decorator();
//        decorator2();
//        kompozyt();
        //command();
        //bridge();
    }



    /**
     undefined programmer
     */
    public static void singleton() {
        ResourceManager resourceManager = ResourceManager.getInstance();
    }

    /**
     Drobik Kacper
     */
    public static void prototype() {
        ImageResource image = new ImageResource("path/to/image.jpg");
        SoundResource sound = new SoundResource("path/to/sound.mp3");
        ResourcePrototype clonedImage = image.cloneResource();
        ResourcePrototype clonedSound = sound.cloneResource();
    }

    /**
     Nowak Dawid
     */
    public static void visitor() {
        ImageResource image = new ImageResource("path/to/image.jpg");
        SoundResource sound = new SoundResource("path/to/sound.mp3");
        CompressionVisitor compressionVisitor = new CompressionVisitor();
        LocalizationVisitor localizationVisitor = new LocalizationVisitor("en-US");
        image.display();
        sound.play();
        image.accept(compressionVisitor);
        sound.accept(localizationVisitor);
    }

    /**
     Wysowski Wojciech
     */
    public static void metodaSzablonowa() {
        Pizza pizza = new Pizza();
        pizza.przygotuj();
        Tosty tost = new Tosty();
        tost.przygotuj();
    }

    /**
     Bobowski Łukasz
     */
    public static void metodaWytworcza() {
        Fabryka fabrykaZabkobus = new FabrykaZabkobusuw();
        fabrykaZabkobus.zrobCos();
        Fabryka fabrykaCzolg = new FabrykaCzolguw();
        fabrykaCzolg.zrobCos();
    }

    /**
     Powęski Adam
     */
    public static void pelnomocnik() {
        Serwer serwer = new Serwer();
        Parobek parobek = new Parobek(serwer);
        parobek.zrobCos(213);
        parobek.zrobCos(45);
        parobek.zrobCos(213);
        parobek.zrobCos(213);
        parobek.zrobCos(67);
    }

    /**
     Czajka Stanisław
     */
    public static void most() {
        /*Kaldi kaldiRs7 = new Kaldi();
        kaldiRs7.setNaped(2);
        kaldiRs7.setAbs(true);
        System.out.println(kaldiRs7.getNaped());
        System.out.println(kaldiRs7.getAbs());*/
    }

    /**
     Sydorczyk Bartosz
     */
    public static void mediator() {
        KonkretnyMediator mediator = new KonkretnyMediator();

        Komponent komponentA = new KomponentA();
        komponentA.setMediator(mediator);
        Komponent komponentB = new KomponentB();
        komponentB.setMediator(mediator);
        Komponent komponentC = new KomponentC();
        komponentC.setMediator(mediator);

        mediator.zarejestrujKomponenty(komponentA, komponentB, komponentC);

        komponentA.wyslijKomunikat("Siama ");
        komponentB.wyslijKomunikat("elo");
        komponentC.wyslijKomunikat("KomponentC");
    }

    /**
     Wydra Piotr
     */
    public static void strategia(){
        KalkulatorKantor context = new KalkulatorKantor();
        int a = 10;
        int b = 5;
        String dzialanie = "Dodawanie";

        switch (dzialanie){
            case "Dodawanie":
                context.setDzialanie(new Dodawanie());
                break;
            case "Odejmowanie":
                context.setDzialanie(new Odejmowanie());
                break;
            case "Mnożenie":
                context.setDzialanie(new Mnożenie());
                break;

        }
        int result = context.executeDzialanie(a,b);
        System.out.println(result);
    }

    /**
     Strzałkowski Bartosz
     */
    public static void fasada() {
        DeliveryBoxFacade deliveryBoxFacade = new DeliveryBoxFacade();
        deliveryBoxFacade.pickUpPacage();
    }

    /**
     Bogusz Ignacy
     */
    public static void fabrykaAbstrakcyjna(){
        Kasynko kasynko = null;
        String cel = "przegrana";
        if (cel.equals("wygrana")){
            kasynko = new WygrywajaceKasynko();
        }else if(cel.equals("przegrana")){
            kasynko = new PrzegrywajaceKasynko();
        }else{
            System.out.println("nie ma takiego kasuynka");
        }

        if (kasynko!=null){
            kasynko.obstawHarty();
            kasynko.obstawSloty();
        }


    }

    // Maciej Szymaniak observer
    public static void observer() {
        PublishingEntity KrzysztofKantor = new PublishingEntity(1);
        PublishingEntity EwaRulan = new PublishingEntity(2);

        SubscribingEntity PiotrWydra = new SubscribingEntity(1);
        SubscribingEntity Stzralkowski = new SubscribingEntity(2);
        SubscribingEntity AdamPoweski = new SubscribingEntity(3);

        KrzysztofKantor.addSubscriber(PiotrWydra);
        KrzysztofKantor.addSubscriber(Stzralkowski);

        EwaRulan.addSubscriber(PiotrWydra);
        EwaRulan.addSubscriber(AdamPoweski);

        KrzysztofKantor.setState(5);
        EwaRulan.setState(23892349);

        KrzysztofKantor.removeSubscriber(PiotrWydra);
        EwaRulan.removeSubscriber(AdamPoweski);
        EwaRulan.removeSubscriber(PiotrWydra);

        KrzysztofKantor.setState(57);
        EwaRulan.setState(2);

    }

    // Michal Dominiak - Adapter
    public static void AdapterKompozycja(){
        USB cardReader = new CardReader(new MemoryCard());
        cardReader.connect();
    }

    // Igor Wojcik - Stan
    public static void stan(){
        Kawomat kawomat = new Kawomat();
        kawomat.doAction();
        kawomat.doAction();
        kawomat.doAction();
        kawomat.doAction();
        kawomat.doAction();
        kawomat.doAction();
        kawomat.doAction();
        kawomat.doAction();
        kawomat.doAction();
        kawomat.doAction();
        kawomat.doAction();
    }

    //Sydorczyk most2

    private static void most2() {
        Tv tv = new Tv();
        StandardRemote standardRemote = new StandardRemote(tv);
        SpecialRemote specialRemote = new SpecialRemote(tv);
        tv.print();
        specialRemote.power();
        standardRemote.changeChannel(113);
        specialRemote.mute();
        tv.print();

    }

    private static void Decorator()
    {
        String asd = "kolega";

        DataSourceDecorator dataSourceDecorator = new AsdDEcorator(new EncryptionDecorator(new FileDataSource("out/Output.txt")));

        dataSourceDecorator.writeData(asd);

        System.out.println("input");
        System.out.println(asd);

        System.out.println("decoded");
        System.out.println(dataSourceDecorator.readData());


    }
    private static void decorator2()
    {
        ITrip myBestTrip = new UltraDecorator(new AllInclusiveDecorator(new CheapDecorator(new Trip())));
        myBestTrip.showInfo();
        System.out.println("\n");
        ITrip myWorstTrip = new AllInclusiveDecorator(new CheapDecorator(new Trip()));
        myWorstTrip.showInfo();


    }
    public static void kompozyt(){
        Menadzer m1 = new Menadzer("Krzysztof Kantor");
        Menadzer m2 = new Menadzer("Ewa Rulan");
        Pastuch p1 = new Pastuch(1);
        Pastuch p2 = new Pastuch(2);
        Pastuch p3 = new Pastuch(3);
        m1.add(p1);
        m2.add(p2);
        m2.add(p3);
        m1.add(m2);
        m1.showDetails();
    }
    public static void command(){
        Room room = new Room();
        if(room.curtainsOpen()){
            System.out.println("Kurtyny odsloniete");
        } else {
            System.out.println("Kurtyny zasloniete");
        }
        if(room.LightOn()){
            System.out.println("Swiatlo wlaczone");
        } else {
            System.out.println("Swiatlo wylaczone");
        }

        room.setCommand(new CurtainsCommand(room.getCurtains()));
        room.executeCommand();

        if(room.curtainsOpen()){
            System.out.println("Kurtyny odsloniete");
        } else {
            System.out.println("Kurtyny zasloniete");
        }
        if(room.LightOn()){
            System.out.println("Swiatlo wlaczone");
        } else {
            System.out.println("Swiatlo wylaczone");
        }

        room.setCommand(new LightsCommand(room.getLight()));
        room.executeCommand();

        if(room.curtainsOpen()){
            System.out.println("Kurtyny odsloniete");
        } else {
            System.out.println("Kurtyny zasloniete");
        }
        if(room.LightOn()){
            System.out.println("Swiatlo wlaczone");
        } else {
            System.out.println("Swiatlo wylaczone");
        }
    }


    public static void bridge(){
        Tv lg = new Tv();
        Remote pilotLg = new StandardRemote(lg);
        System.out.println(lg.getChannel());
        pilotLg.changeChannel(10);
        System.out.println(lg.getChannel());
    }

}
