import java.util.Scanner;

public class ArrayString {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the range:");
        int size=sc.nextInt();
       String []name=new String[size];
       
        for(int i=0;i<size;i++){
            System.out.print("enter the names:");
          name[i]=sc.next();
          
        }
          for(int j=0;j<size;j++){
            System.out.print(name[j] + " | ");
          }
          sc.close();
    }
}
