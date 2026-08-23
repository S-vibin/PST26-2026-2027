 
import java.util.*;

public class anagram {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        
        int count=0;
        int num1=0;
        int num2=0;
        if(str1.length()!=str2.length()){
            System.out.print("the length of string is not a anagram");
        }else{
            for(int i=0;i<str1.length();i++){
                for(int j=0;j<str2.length();j++){
                    if(i==str1.length()){
                        num1=i-1;
                    }if(j==str2.length()){
                        num2=j-1;
                    }
                    if(str1.charAt(num1)==str2.charAt(num2)){
                        count++;
                    }
                }
            }
            System.out.print(count);
        }
        
    }
}

