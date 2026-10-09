import java.util.HashMap;
import java.util.Scanner;
public class Strobo {
     public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        String s=sc.next();        
        System.out.print(isstropogrammatic(s));
    }

    public static boolean isstropogrammatic(String s){
        HashMap <Character,Character> map=new HashMap<>();
       
        map.put('0', '0');
        map.put('1', '1');
        map.put('8', '8');
        map.put('6', '9');
        map.put('9', '6');
        int l=0, r=s.length()-1;
        while(l<=r){
            if(!map.containsKey(s.charAt(l)) || !map.containsKey(s.charAt(r))){
                return false;
            }
            if(s.charAt(l)!= map.get(s.charAt(r))){
               return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
