package wisniowa.tc.SecondGroup.Pelnomocnik;

import java.util.ArrayList;

public class Parobek {
    ArrayList<Integer> processed = new ArrayList<>();
    Serwer serwer;
    public Parobek(Serwer serwer){
        this.serwer = serwer;
    }
    public void zrobCos(int id){
        boolean doneBefore = false;
        for (Integer integer : processed) {
            if (integer == id) {
                doneBefore = true;
                break;
            }
        }
        if(!doneBefore){
            processed.add(id);
            serwer.zrobCos(id);
        }else{
            System.out.println("beka z ciebie juz to przetworzylismy");
        }
    }
}