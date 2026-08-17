import java.util.HashSet;
public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> hu=new HashSet<>();
        hu.add(8);
        hu.add(45);
        hu.add(56);
        hu.add(78);
        hu.add(89);
        System.out.println(hu.remove(78));
        System.out.println(hu);
    }
}
