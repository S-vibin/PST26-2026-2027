import java.util.Scanner;
class student_data{
    public static void main(String[] argu){
Scanner sc=new Scanner(System.in);
System.out.print("enter your name:");
String name=sc.nextLine();
System.out.print("Enter your age:");
int age=sc.nextInt();
System.err.print("Enter your roll number:");
long roll=sc.nextLong();
System.out.print("cgpa:");
float cgpa=sc.nextFloat();

sc.close();
    }
}