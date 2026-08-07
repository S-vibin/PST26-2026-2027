import java.util.*;

public class condition {
    //if statement else nested if
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter ur age:");
        int age=sc.nextInt();
        if (age>=18){
            System.out.println("he is adult");
            if (age>=60){
                System.out.println("he is senior citizen");
            }
        }
        else{
            System.out.println("he is not adult");
            if (age<=10){
                System.out.println("he is child");
            }
        }
    }
}
