package Queue;
public class CircularQueue {
    public static class CqueueA{
        int front =-1;
        int rear =-1;
        int size =0;
        int [] arr = new int[5];
        int n = arr.length;
        public void add(int val) throws Exception{
            if(size==n){
                 throw new Exception("Queue is Full!");
            }
            else if(size ==0){
                front=rear=0;
                arr[0]= val;
            }
            else if(rear<n-1){ // Nornal case
                rear++;
                arr[rear]= val;

            }
            else if(rear==n-1){
                 rear=0;
                arr[0] = val;
            }
             size++;
        }
        public int remove () throws Error{
            if(size==0){
               throw new Error("Queue is Empty");
            }
            else if(front==n-1){
                int val = arr[front];
                front=0;
                 
                return val;
            }else{
                int val = arr[front];
                front++;
                 size--;
                return val;
            }
            
             
        }
        public int peek() throws Error{
            if(size==0){
                throw new Error("Queue is Empty");

            }else{
                return arr[front];
            }
        }
        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is Empty");
                return ;

            }
            else if(front<=rear){
                for(int i=front;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
            else if(front>=rear){
                for(int i=front;i<n;i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i=0;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }

    }
    public static void main(String[] args) throws Exception{
          CqueueA q = new CqueueA();
          System.out.println(q.isEmpty());
          q.add(1);
          q.add(2);
          q.add(3);
          q.add(4);
          q.add(5);
          q.display();
          q.remove();
          q.display();
          q.add(6);
          q.display();
          System.out.println(q.size);
          q.add(7);
          

           
        
    }
    
}
