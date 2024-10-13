package wisniowa.tc.SecondGroup.Pelnomocnik;

public class Serwer {
    protected void zrobCos(int id)  {
        try {
            Thread.sleep(5000);
            System.out.println(id + " zostalo przetworzone");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        duzo czasu przetwarzanie
    }
}
