
import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the range:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        } 
        int l=0;
        int r=arr[arr.length-1];
        while (l<r) { 
          int  temp=arr[l];
          arr[l]=r;
          r=temp;
          l++;r--;
        }
        for(int j=0;j<arr.length;j++){
        System.out.print(arr[j]);
    }
    sc.close();
}
}
