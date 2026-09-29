class student{
    String name;
    int age;
    student(String name, int age){
        this.name=name;
        this.age=age;
        System.out.println("constructor is ready to launch");
    }

    student(student obj) {
        this.name = obj.name;
        this.age = obj.age;

    }
    
public class overload {
    public static void main(String[] args) {
       student na=new student("vibin", 15); 
    System.out.println(na.name);
    System.out.println(na.age);
    }
}
}