import java.util.HashMap;
public class hashMap {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        hm.put("name","rengoku");
        hm.put("Age", "25");
        hm.put("title","flame hashira");
        hm.put("name","shinobu");
        System.out.println(hm.get("name"));
        System.out.println(hm);
    }
}
