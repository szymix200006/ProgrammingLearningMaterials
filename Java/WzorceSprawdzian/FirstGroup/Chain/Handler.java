package wisniowa.tc.FirstGroup.Chain;

public abstract class Handler {
    protected Handler nextHandler;

    public abstract boolean handle(int number);

    public Handler(Handler handler){
        this.nextHandler=handler;
    }

    protected boolean checkNext(int number){
        return nextHandler==null || nextHandler.handle(number);
    }
}
