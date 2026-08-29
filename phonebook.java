import java.util.*;

public class phonebook {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the range:");
        int n=sc.nextInt();
        sc.nextLine();
        HashMap<String,String> map=new HashMap<>();
        for(int i=0;i<n;i++){
            System.out.print("enter the name:");
            String name=sc.nextLine();
            System.out.print("enter the number:");
            String number=sc.nextLine();
            map.put(name, number);   
        }
        while(sc.hasNextLine()){
            String query=sc.nextLine();
            if(map.containsKey(query)){
                System.out.print(map.get(query));
            }else{
                System.out.print("not found");
            }
        }
        sc.close();
    }
} 
    

