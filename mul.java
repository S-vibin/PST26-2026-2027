
import java.util.Scanner;

public class mul {
    public static void main(String[] args) {
        Scanner sa=new Scanner(System.in);
        System.out.print("enter the n value:");
        int n=sa.nextInt();
        System.out.print("enter the m value:");
        int m=sa.nextInt();
        for (int i =1;i<=m;i++){
            int mu=n*i;
            System.out.println(m+"*"+n+"="+mu);
        }
    }
}
