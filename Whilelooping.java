
import java.util.Scanner;

public class Whilelooping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        System.out.println("enter the divider value:");
        int n=sc.nextInt();
        int count=0;
while(num>=n){
    num=num/n;
    count++;
    
}System.out.println(count);
    }
}
