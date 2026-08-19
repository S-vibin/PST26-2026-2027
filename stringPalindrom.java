import java.util.*;
public class stringPalindrom {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    System.out.print("enter the word:");
    String s="";
    for(int i=str.length()-1;i>=0;i--){
        s+=str.charAt(i);
        
    }if(s.equals(str)){
           System.out.print("it is palindrom");
          }
          else{
            System.out.print("it is not palindrom");
        }  
    
    }
}


