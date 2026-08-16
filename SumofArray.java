
import java.util.Scanner;

public class SumofArray {
 public static void  findarrayInt(int [] num){
    int sum=0;
    for( int i=0;i<num.length;i++ ){
        sum+=num[i];
    }System.out.println("your total is"+ sum);
 }
    
    
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the range");
    int n=sc.nextInt();
    int []num=new int[n];
    System.out.println("enter the numbers:");
    for(int i=0;i<n;i++){
     num[i]=sc.nextInt();   
    }
     
   findarrayInt(num);
   sc.close();
}
}
