public class methodWrtWargs {
    public int addValue(int a,int b){
        int sum=a+b;
    return sum;
    }
    public static void main(String[] args){
        methodWrtWargs obj=new methodWrtWargs();
        int res=obj.addValue(5,6);
        System.out.println(res);
    }
    
}
