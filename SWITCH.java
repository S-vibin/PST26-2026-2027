import java.util.Scanner;
public class SWITCH {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        float a=sc.nextFloat();
        System.out.println("enter the value of b");
        float b=sc.nextFloat();
        System.out.println("enter the operator");
        char op=sc.next().charAt(0);

        switch(op){
            case '+':
                System.out.println("addition:"+(a+b));
                break;
                case '-':
                    System.out.println("sub:"+(a-b));
                    case '*':
                        System.out.println("mul:"+(a*b));
                        break;
                        case '/':
                            System.out.println("div:"+(a/b));
                            break;
                            default:
                                System.out.println("invalid operator");
        }
    }
}
