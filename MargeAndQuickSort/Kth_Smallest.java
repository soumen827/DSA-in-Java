package MargeAndQuickSort;
public class Kth_Smallest {
    static int ans;

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickselect(int[] arr, int lo, int hi, int k) {
        if (lo > hi) return;
        int idx = partition(arr, lo, hi);

        if (idx == k - 1) {
            ans = arr[idx];
            return;
        }

        if (k - 1 < idx) quickselect(arr, lo, idx - 1, k);
        else quickselect(arr, idx + 1, hi, k);
    }

    public static int partition(int[] arr, int lo, int hi) {
        int mid = lo + (hi - lo) / 2;
        int pivot = arr[mid];
        swap(arr, mid, hi); // Move pivot to end temporarily
        int i = lo;
        for (int j = lo; j < hi; j++) {
            if (arr[j] < pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, hi); // Move pivot to its correct place
        return i;
    }
    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 9, 4, 76, 4, 6};
        int n = arr.length;
        int k = 2; // 2nd smallest
        ans = -1;

        quickselect(arr, 0, n - 1, n-k+1);
        System.out.println("The " + k + "th Smallest element is: " + ans);
    }
}
