import java.util.*;
public class KsortedArray {
    public static void main(String[] args) {
        int[] arr = {6,5,3,2,8,10,9};
        List<Integer> ans = new ArrayList<>();
        int k =3;
        //MinHeap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
          for(int ele:arr){
            pq.add(ele);
            if(pq.size()>k) ans.add( pq.remove());
          }
          while(pq.size()>0) ans.add(pq.remove());
           
        //System.out.print("Your Kth Largest Element is: ");
        System.out.println(ans);
    } 
}