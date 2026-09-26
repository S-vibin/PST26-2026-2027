import java.util.Scanner;

public class passwordCheck {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
      Pass p1=new Pass();
      System.out.println("enter the username:");
      String name=sc.nextLine();
      System.out.println("enter the email:");
      String email=sc.nextLine();
      System.out.println("enter the pasword:");
      String password=sc.nextLine();

      p1.setUsername(name);
      p1.setEmail(email);
      p1.setPassword(password);
      System.out.println("super you clear ");
      System.out.println("please enter the name");
      String Name=sc.nextLine();
      System.out.println("please enter the email");
      String Useremail=sc.nextLine();
      System.out.println("please enter the password");
      String Userpassword=sc.nextLine();

      if(Useremail.equals(p1.email) && )
   } 
}
class Pass{
    private String name;
    private String password;
    private String email;
    private int loginAttempts;
     
    public String getUsername(){
        return this.name;
}
    public void setUsername(String name){
        this.name=name;
    }
    public String getEmail(){
        return this.email;
}
    public void setEmail(String email){
        this.email=email;
    }

     public String getPassword(){
        return this.password;
     }
     public void setPassword(String password){
        this.password=password;
     }
}
