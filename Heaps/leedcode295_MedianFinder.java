import java.util.*;
public class leedcode295_MedianFinder {
       // Not best TLE problem
    //  List<Integer> ans = new ArrayList<>();
    // public leedcode295_MedianFinder() {
        
    // }
    // public void addNum(int num) {
    //     ans.add(num);
    //     int i= ans.size()-1;
    //     while(i>0){
    //         if(ans.get(i)<ans.get(i-1)){
    //              swap(i,i-1);
    //              i--;
    //         }
    //         else break;
    //     }
    // }
    // public void swap(int i,int j){
    //     int temp = ans.get(i);
    //     ans.set(i,ans.get(j));
    //     ans.set(j,temp);
    // }
    
    // public double findMedian() {
    //     int n = ans.size();
    
    //     if(n%2!=0) return ans.get(n/2);
    //     else return (ans.get(n/2)+ans.get(n/2-1))/2.0;
        
    // }
                            // Using Heaps
    PriorityQueue<Integer> minpq = new PriorityQueue<>();
    PriorityQueue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder());
    public leedcode295_MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(maxpq.size()==0) maxpq.add(num);
        else {
            if(num<maxpq.peek()) maxpq.add(num);
            else minpq.add(num);
        }
        if (maxpq.size() > minpq.size() + 1) {
        minpq.add(maxpq.remove());
        }
        else if (minpq.size() > maxpq.size() + 1) {
        maxpq.add(minpq.remove());
        }
    }
    public double findMedian() {
        if(maxpq.size()==minpq.size()){
            return (maxpq.peek()+minpq.peek())/2.0;
        }
        else if(maxpq.size()>minpq.size()) return maxpq.peek();
        else return minpq.peek();
    }
}
