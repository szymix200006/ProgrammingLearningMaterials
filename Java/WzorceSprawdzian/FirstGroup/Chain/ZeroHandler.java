package wisniowa.tc.FirstGroup.Chain;

public class ZeroHandler extends Handler{
    public ZeroHandler(Handler handler) {
        super(handler);
    }

    @Override
    public boolean handle(int number) {
        if(number==0){
            return true;
        }
        System.out.println("number is not 0");
        return checkNext(number);
    }
}
