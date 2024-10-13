package wisniowa.tc.FirstGroup.Chain;

public class PositiveNumberHandler extends Handler{
    public PositiveNumberHandler(Handler handler) {
        super(handler);
    }

    @Override
    public boolean handle(int number) {
        if(number>0){
            return checkNext(number);
        }
        System.out.println("number is not positive");
        return false;
    }
}
