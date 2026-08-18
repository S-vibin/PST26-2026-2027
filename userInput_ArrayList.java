import java.util.ArrayList;
import java.util.Scanner;
public class userInput_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name in the list:");
        list.add(sc.nextLine());
        System.out.println(list);
    }



}
