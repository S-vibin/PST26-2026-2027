import java.util.*;
public class stringreversefromUser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the word:");
        String str=sc.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }System.err.println(rev);
    }
}
