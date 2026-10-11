import java.util.HashSet;
import java.util.Scanner;

public class unique {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
         int siz=sc.nextInt();
          int arr[]=new int[siz];
          for(int i=0;i<siz;i++){
                arr[i]=sc.nextInt();
          }
          uni(arr);
    }
    public static int uni(int arr[]){
        HashSet<Integer>uniq=new HashSet<>();
        HashSet<Integer>dup=new HashSet<>();
        for(int num:arr){
            if(dup.add(num)){
                uniq.add(num);
            }
            else{
                uniq.remove(num);
            }
        }
        System.out.println("Unique elements are: " + uniq);
        return uniq.size();
    }
}
