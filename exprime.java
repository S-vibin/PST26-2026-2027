
import java.util.Scanner;

public class exprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int num=sc.nextInt();
        boolean flag;
        for(int i=1;i<num;i++){
                 flag=false;
            for(int j=2;j<i;j++){
                if (i%j==0){
                  flag=true;
                }
            }
            if (flag==false){
                System.out.println(i);
            }
        }
        
        
    }
}
