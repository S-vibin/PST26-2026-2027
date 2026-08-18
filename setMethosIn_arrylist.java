
import java.util.ArrayList;

public class setMethosIn_arrylist {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
       list.add("rengoku");
       list.add("koigiro");
       list.add("umai");
       list.addFirst("umai");
       list.set(3,"umaii");
       System.out.print(list);
    }
}
