import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Leetcode347 {
     public class Pair implements Comparable<Pair>{
    int ele;
    int freq;
    Pair(int ele,int freq){
        this.ele = ele;
        this.freq = freq;
    }
    public int compareTo(Pair s){
          return this.freq - s.freq;
    }
}
    public int[] topKFrequent(int[] arr, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int ele:arr){
           if(map.containsKey(ele)){
            map.put(ele,map.get(ele)+1); // Fill the map
           } else map.put(ele,1);
        }
        for(int ele:map.keySet()){
            int freq = map.get(ele);
            pq.add(new Pair(ele,freq));   // Fill the Heaps
            if(pq.size()>k) pq.remove();
        }
         int[] ans = new int[k];
        for(int i=0;i<k;i++){
            Pair p = pq.remove();   // Transfer pq to ans only ele
            ans[i] = p.ele;
        }
         return ans;
    }
}
