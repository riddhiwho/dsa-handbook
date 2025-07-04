public class Heapify {

    public static void heapify(int[] arr, int n, int i){
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left<n && arr[largest]<arr[left]){
            largest = left;
        }

        if(right<n && arr[largest]<arr[right]){
            largest=right;
        }
        
        if(largest!=i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    public static void buildHeap(int[] arr, int n){
        int startIdx = (n/2)-1;
        for(int i=startIdx; i>=0; i--){
            heapify(arr, n, i);
        }
    }

    public static void printHeap(int[] arr, int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};
        int N = arr.length;

        buildHeap(arr, N);
        printHeap(arr, N);
    }
}
