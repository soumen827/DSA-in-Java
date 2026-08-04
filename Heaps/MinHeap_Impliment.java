class MinHeap{
    private int size;
    private int[] arr;
    MinHeap(int capcity) {
        arr = new int[capcity];
        size =0;
    }
    public void add(int num) throws Exception{
        if(size==arr.length) throw new Exception("Heap is Full");
        arr[size++] = num;
        upheapify(size-1);
    }
    public int remove() throws Exception{
        if(size==0){
            throw new Exception("Heap is Epty");
        }
        int peek = arr[0];
        swap(0,size()-1);
        size--;
        downheapify(0);
        return peek;
    }
    public void upheapify(int idx){
        if(idx==0) return;
        int parent = (idx-1)/2;
        if(arr[idx]<arr[parent]){
             swap(idx,parent);
             upheapify(parent);
        } 
    }
    public void downheapify(int p){
        if(p>=size) return;
        int lc = 2*p +1,rc = 2*p+2;
        int minIdx =p;
        if(lc<size && arr[lc]<arr[minIdx]) minIdx = lc;
        if(rc<size && arr[rc]<arr[minIdx]) minIdx = rc;
        if(p==minIdx) return;
        swap(p, minIdx);
        downheapify(minIdx);
       
    }
    public void swap(int a, int b){
            int temp = arr[a];
             arr[a] = arr[b];
             arr[b] = temp;  
    }
    public int peek() throws Exception{
        if(size==0){
            throw new Exception("Heap is Epty");
        }
        return arr[0];
    }
    public int size(){
        return size;
    }
}
public class MinHeap_Impliment {
    public static void main(String[] args) throws Exception {
       MinHeap pq = new MinHeap(8);
       System.out.println(pq.size());
      // System.out.println(pq.peek());
       pq.add(1);
       pq.add(5);
       pq.add(9);
       System.out.println(pq.size());
       System.out.println(pq.peek());
       pq.add(-10);
       System.out.println(pq.peek());
        //  pq.remove();
       System.out.println(pq.remove());
    }
}
