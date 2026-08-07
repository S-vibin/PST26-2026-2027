import java.util.*;
public class condtion2 {
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter ur age:");
        int age=sc.nextInt();
        if (age<=5){
            System.out.println("child");
        }
        else if (age>=18 && age<=50){
            System.out.println("he is adult");
           
        }else if (age>=13 && age <=18){
                System.out.println("teenager");
            }
        else if (age>=70 && age<=90){
            System.out.println("ultra old");
            }else{
                System.out.println("no human exist in this age");
            }
    }
}
    

