package wisniowa.tc.FirstGroup.FacadeNatali;

import java.util.HashMap;
import java.util.Map;

public class Translator {
    Map<String, String> data;
    public String translate(String s){
        if (data.get(s)==null)
            return "ni mo";
        return data.get(s);
    }
    protected Translator(){
        data = new HashMap<>();
        data.put("glupiutki :3", "silli");
    }
}
