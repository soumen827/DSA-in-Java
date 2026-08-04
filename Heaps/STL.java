import java.util.Collections;
import java.util.PriorityQueue;
public class STL {
    public static void main(String[] args) {
      PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
      pq.add(2);
      pq.add(11);
      pq.add(6);
      pq.add(8);
      pq.add(13);
      pq.add(5);
      pq.remove(12);
      System.out.println(pq);
      System.out.println(pq.remove());
      System.out.println(pq.size());
      System.out.println(pq);
    } 
}
