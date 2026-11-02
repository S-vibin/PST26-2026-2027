public class linklist {
    public static void main(String[] args) {
        linklist l=new linklist();
        linkedlist ll=l.new linkedlist();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.display();
    }
    class linkedlist{
        node head=null;
        node tail=null;
        void insert(int d){
            if(head==null){
                head=new node(d);
                tail=head;
                return;
            }
            tail.next=new node(d);
            tail=tail.next;
        }
       void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
        }
       }

    }
    class node{
        int data;
        node next;
        node (int d){
            data=d;
            next=null;
        }
    }
}
