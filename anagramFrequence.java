
    import java.util.*;

public class anagramFrequence {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        
        boolean anagram= isAnagram(s1,s2);
        System.out.print(anagram);
    }
    public static boolean isAnagram(String s1,String s2){
     if(s1.length()!=s2.length()){
        return false;
     }   
     int [] fre=new int[26];
     for(int i=0;i<s1.length();i++){
        fre[s1.charAt(i)-'a']++;
        fre[s2.charAt(i)-'a']--;
     }
     for(int count:fre){
        if(count!=0){
            return false;
        }
     }
     return true;
    }
}

