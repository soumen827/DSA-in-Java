import java.util.Collections;
import java.util.PriorityQueue;
public class KthSmallest {
     public static void main(String[] args) {
        int[] arr = {10,2,3,8,-4,-2,6};
        int k =3;
        //MaxHeap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
         for(int ele:arr){
             pq.add(ele);
            if(pq.size()>k){
                pq.remove();
            }
         }
        System.out.print("Your Kth Smallest Element is: ");
        System.out.println(pq.peek());
    } 
}
