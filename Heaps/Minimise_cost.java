import java.util.PriorityQueue;

public class Minimise_cost {
    public static int minCost(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele:arr){
            pq.add(ele);
        }
        int TotalCost =0;
        while(pq.size()>1){
            int y = pq.remove();
            int x = pq.remove();
            int sum = x+y;
            TotalCost +=sum;
        }
        return TotalCost;
    }
    public static void main(String[] args) {
        int []arr = {4,8,0,2,56,7,1,5,8};
        System.out.println( minCost(arr));;
    }
}
