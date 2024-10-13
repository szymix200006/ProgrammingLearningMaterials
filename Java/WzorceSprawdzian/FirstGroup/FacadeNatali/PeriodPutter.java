package wisniowa.tc.FirstGroup.FacadeNatali;

public class PeriodPutter {
    String dot;
    public String putADot(String s){
        return s.concat(dot);
    }
    protected PeriodPutter(){
        dot  = " .";
    }

}
