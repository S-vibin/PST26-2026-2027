import java.util.*;
public class hassetTemp {
    



    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         String []str1 =new String[n];
         String []str2 =new String[n];
        for(int i=0;i<n;i++){
           str1[i]=sc.next();
           str2[i]=sc.next();
        }
        for (int i = 0; i < n; i++) {
         
           set.add(str1[i] + " " + str2[i]);

        System.out.println(set.size());
}
    }
}


