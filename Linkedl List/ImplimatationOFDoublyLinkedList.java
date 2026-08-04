package LinkdList;
class DLL{
    dNode head;
    dNode tail;
    int size;
    void display(){
        dNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void insertAtTail(int val){
        dNode temp = new dNode(val);
        if(size==0) head=tail=temp;
        else{
            tail.next = temp;
            temp.prev = tail; // extra
            tail = temp;
            tail.next = null;
        }
        size++;
    }
    void insertAthead(int val){
         dNode temp = new dNode(val);
        if(size==0) head=tail=temp;
        else{
             temp.next =head;
             head.prev = temp;
             head = temp;
        }
        size++;
    }
    public void insertAtidx(int idx,int val){
        if(idx==size-1){
            tail.val=val;
            return ;
        }
        if(idx>=size || idx<0){ 
            System.out.println("Wrong Idx");
        }
        dNode temp = new dNode(val);
        dNode x = head;
        for(int i=1;i<=idx-1;i++){
            x = x.next;
        }
        dNode y = x.next;
        x.next = temp; temp.prev =x;
        temp.next = y; y.prev = temp;
        size++;
    }
     void deleteAthead(){
        if(head==null) System.out.println("List is empty");
        head=head.next;
        head.prev =null;
        size--;
    }
    void deleteAtTail(){
        if(head==null) System.out.println("List is empty");
        tail = tail.prev;
        tail.next =null;
        size--;
    }
     void deleteAtidx(int idx){
        if(idx==0){
            deleteAthead();
            return;
        }
        if(idx==size-1){
            deleteAtTail();
            return;
        }
        if(idx<0 || idx>=size) System.out.println("Invalid idx");
        dNode temp = head;
        for(int i=1;i<=idx-1;i++){
            temp= temp.next;
        }
        temp.next =temp.next.next;
        temp = temp.next;
        temp.prev = temp.prev.prev;
        size--;

    }
    
}
public class ImplimatationOFDoublyLinkedList {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.display();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.display();
        list.insertAtTail(50);
        list.display();
        list.insertAthead(5);
        list.display();
        list.insertAtidx(5,80);
        list.display();
        list.deleteAthead();
        list.display();
        list.deleteAtTail();
        list.display();
        list.deleteAtidx(2);
        list.display();
        
    }
    
}
 