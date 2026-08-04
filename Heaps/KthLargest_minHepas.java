import java.util.PriorityQueue;

public class KthLargest_minHepas {
    public static void main(String[] args) {
        int[] arr = {10,2,3,8,-4,-2,6};
        int k =3;
        //MaxHeap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
         for(int ele:arr){
             pq.add(ele);
            if(pq.size()>k){
                pq.remove();
            }
         }
        System.out.print("Your Kth Largest Element is: ");
        System.out.println(pq.peek());
    } 
}
