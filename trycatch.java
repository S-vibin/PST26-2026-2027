
public class trycatch {
    public static void main(String[] args) {
        try{
            int a=4/0;
            System.out.println(a);
        }
        catch(ArithmeticException k){
            System.out.println("Error");
        }
}
}