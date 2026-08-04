package LinkdList;
class SLL {
    Node head;
    Node tail;
    int size;
     public  void insertAtMid(int idx,int valu){
        if(idx==0){
            insertAtFirst(valu);
            return;
        }
        if(idx==size){
            insertAtEnd(valu);
            return;
        }
        if(idx>size){ System.out.println("Invalid idx");
        return;
    }
        Node temp =new Node(valu);

        Node x= head; 
        for(int i=0;i<idx-1;i++){
            x=x.next;
        }
        temp.next = x.next;
        x.next =temp;
        size++;
     }
    public void insertAtEnd(int valu){
        Node temp = new Node(valu);
        if(head==null)  head=tail=temp;

        else{
             tail.next =temp;
             tail= temp;
        }
        size++;
 }
    public int get(int idx) {
        if(idx==size-1) return tail.valu;
        if(idx>=size || idx<0){ 
            System.out.println("Wrong Idx");
            return-1;
        }
       Node temp = head;
       for(int i=1;i<=idx;i++){
        temp =temp.next ;
       }
       return temp.valu;
    }
    public void set(int idx,int val){
        if(idx==size-1){
            tail.valu=val;
            return ;
        }
        if(idx>=size || idx<0){ 
            System.out.println("Wrong Idx");
        }
        Node temp = head;
        for(int i=1;i<=idx;i++){
            temp =temp.next;
        }
        temp.valu= val;
    }
    void deleteAthead(){
        if(head==null) System.out.println("List is empty");
        head=head.next;
        size--;
    }
    public void delete(int idx){
        if(idx==0){
            deleteAthead();
            return;
        }
        if(idx<0 || idx>=size) System.out.println("Invalid idx");
        Node temp = head;
        for(int i=1;i<idx;i++){
            temp= temp.next;
        }
        temp.next =temp.next.next;
        size--;

    }
    public void insertAtFirst(int valu){
        Node temp = new Node(valu);
        if(head==null)  head=tail=temp;
        else{
             temp.next =head;
             head= temp;
        }
        size++;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.valu+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class Implementation {
    public static void main(String[] args) {
        SLL a = new SLL();
        a.insertAtEnd(4);
        a.insertAtEnd(6);
        a.insertAtEnd(8);
        a.insertAtEnd(12);
        System.out.println("Size :"+a.size);
        a.display();
        a.insertAtFirst(50);
        a.display();
        a.insertAtMid(56,20);
        a.display();
        System.out.println(a.get(2)); 
        a.set(2, 8);
        a.display();
        a.delete(2);
        System.out.println(a.tail.valu);
        System.out.println(a.size);
        a.display();
        
         
    }
}
