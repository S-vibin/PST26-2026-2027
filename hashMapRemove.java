import java.util.*;

public class hashMapRemove {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        hm.put("name","rengoku");
        hm.put("Age", "25");
        hm.put("title","flame hashira");
        hm.put("name","shinobu");
        for(Map.Entry<String,String> i: hm.entrySet()){
            String key=i.getKey();
            String value=i.getValue();
            System.out.println(key + " : " + value);
        }
    }
}
