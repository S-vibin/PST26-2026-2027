
import java.util.Scanner;

public class MaxMinArray {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int nums=sc.nextInt();
        System.out.print("enter the value:");
        int num[]=new int[nums];
       for(int j=0;j<nums;j++){
        System.out.println("enter the value:");
        num[j]=sc.nextInt();

       Max obj=new Max();
 }
 }

        
       
class Max{
    public static int maxi(int num[],int nums){
        int max=num[0];
        for(int i=1;i<nums;i++){
         if(num[i]>max){ 
            max=num[i];
         }
        } System.out.print(max);
        return max;
    }
}









   
       
    }
}
