import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargest {
    public static void main(String[] args) {
        int[] arr = {3,9,4,0,55,78,98};
        int k =2;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        } 
        System.out.println(pq);
        for(int i=1;i<=k-1;i++){
            pq.remove(pq.peek());
        } 
        System.out.print("Your Kth Largest Element is= ");
        System.out.println(pq.peek());
    }
}
