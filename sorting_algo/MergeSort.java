package sorting_algo;

public class MergeSort {

    public static void merge(int[] arr, int l, int m, int r){
        int[] temp = new int[];
        int low=l;
        int high=m+1;
        int k=0;
        while (l<=m && high<=r) {
            if(arr[low]<=arr[high]){
                temp[k++] = arr[low];
            }
        }
    }

    public static void mergeSort(int[] nums, int l, int r){
        if(l>=r) return;
        int mid = l+(r-l)/2;
        mergeSort(nums, l, mid);
        mergeSort(nums, mid+1, r);
        merge(nums, l, mid, r);
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4,1,3};
    }
}
