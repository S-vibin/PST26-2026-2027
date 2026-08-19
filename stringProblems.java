public class stringProblems {
    public static void main(String[] args) {
        String str="hello";
        String ch=" ";
        for(int i=str.length()-1;i>=0;i--){
           ch+=str.charAt(i);
        }System.out.println(ch);
    }
    
}
