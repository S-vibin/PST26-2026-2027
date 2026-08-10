
import java.util.Scanner;

public class checkprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        boolean isprime=true;
        for(int i=2;i<num;i++){
          if(num%1 ==0){
            isprime=false;
          }
        }
        if(isprime==true){
            System.out.println("is prime");
        }
        else{
            System.out.println("is not a prime"); 
        }
    }
    
}
