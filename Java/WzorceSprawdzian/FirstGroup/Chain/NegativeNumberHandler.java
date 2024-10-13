package wisniowa.tc.FirstGroup.Chain;

public class NegativeNumberHandler extends Handler{
    public NegativeNumberHandler(Handler handler) {
        super(handler);
    }

    @Override
    public boolean handle(int number) {
        if(number<0){
            return checkNext(number);
        }
        System.out.println("number is not negative");
        return false;
    }
}
