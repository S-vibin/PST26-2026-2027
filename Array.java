
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the range:");
        int size=sc.nextInt();
       int []mark=new int[size];
        for(int i=0;i<size;i++){
          System.out.print("enter the marks:");
          
          mark[i]=sc.nextInt();}
          for(int j=0;j<size;j++){
            System.out.print(mark[j] + " ");
          }
          
          
         
        
       
        

    }
}
