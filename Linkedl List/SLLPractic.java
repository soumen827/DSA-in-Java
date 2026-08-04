package LinkdList;
class SLL{
    Node head;
    Node tail;
    int  size;

    public void insertAtEnd(int valu){
    Node temp = new Node(valu);
    if(head==null) head=tail=temp;
    else{
        tail.next =temp;
        tail=temp;
    }
    size++;

    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.valu);

        }
        temp =temp.next;
    }
} 
public class SLLPractic {
    public static void main(String[] args) {
        SLL a = new SLL();
        a.insertAtEnd(2);
        a.insertAtEnd(4);
        a.insertAtEnd(6);
        a.insertAtEnd(8);
        a.insertAtEnd(10);
        a.display();

    }
    
}
