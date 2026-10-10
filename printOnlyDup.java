
import java.util.*;

public class printOnlyDup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int siz=sc.nextInt();
        int arr[]=new int[siz];
        for(int i=0;i<siz;i++){
            arr[i]=sc.nextInt();
        }
        Dup(arr);
    }
    public static int Dup(int arr[]){
        HashSet<Integer> unique=new HashSet<>();
        HashSet<Integer> duplicate=new HashSet<>();
        for(int num:arr){
            if(!unique.add(num)){
                duplicate.add(num);
            }
        }
        
        System.out.println("Duplicate elements are: " + duplicate);
        return 0;
    }
}
