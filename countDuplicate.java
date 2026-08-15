
import java.util.Scanner;

public class countDuplicate {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the range:");
    int size=sc.nextInt();
    int arr[]=new int[size];
    boolean isvisited[]=new boolean[size];
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
        for(int j=i+1;j<size;j++){
            if(isvisited[i]==false){
        int count=1;
        isvisited[i]=true;
            if(arr[i]==arr[j]){
           count+=j;
            isvisited[j]=true;
            }System.out.println(arr[i]+" "+count);
        }
        }
        
    }
    
    

}     
}
