package MargeAndQuickSort;
public class QuickSort {
    public static void quickshort(int[]arr,int lo,int hi){
        if(lo>=hi) return;
        // arr[lo] ko sahe jaga rakho
        //left me chota right me bara
        int idx =partition(arr,lo,hi);
        quickshort(arr, lo,idx-1);
        quickshort(arr, idx+1, hi);
    }
    public static int  partition(int[] arr,int lo,int hi){
        int mid =lo+hi/2;
        int privit =arr[mid],privitidx=(mid);
        int smallercount = 0;
        for(int i=lo+1;i<=hi;i++){
            if(arr[i]==mid) continue;
            if(arr[i]<=privit) smallercount++;

        }
        int currectidx = lo+smallercount;
        swap(arr, privitidx, currectidx);
        int i=0,j=hi;
        while(i<currectidx && j>currectidx){
            if(arr[i]<=privit) i++;
            else if(arr[j]>privit) j--;
                    else if(arr[i]>privit && arr[j]<=privit){
                swap(arr,i,j);
            }
        }
        return currectidx;
    }
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swap(int[]arr,int i,int j){
        int temp =arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
    public static void main(String[] args) {
        System.out.print("Before swaping: ");
        int [] arr= {9,76,89,123,6,9};
        print(arr);
        int n = arr.length;
        quickshort(arr,0,n-1);
        System.out.print("After swaping: ");
        print(arr);

    }
    
}