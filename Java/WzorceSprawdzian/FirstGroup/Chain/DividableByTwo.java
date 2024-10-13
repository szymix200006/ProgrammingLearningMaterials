package wisniowa.tc.FirstGroup.Chain;

public class DividableByTwo extends Handler {

    public DividableByTwo(Handler handler) {
        super(handler);
    }

    @Override
    public boolean handle(int number) {
        if(number%2==0){
            return true;
        }
        System.out.println("number is not dividable by 2");
        return false;
    }
}
