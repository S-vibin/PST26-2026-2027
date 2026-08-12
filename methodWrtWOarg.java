public class methodWrtWOarg {
    public int addValue(){
        int a=10;int b=14;
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
       methodWrtWOarg obj=new methodWrtWOarg();
       int res=obj.addValue();
       System.out.println(res);
    }
}
