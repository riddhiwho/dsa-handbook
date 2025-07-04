public class Delete {

    public static void heapify(int []arr, int n, int i){
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left<n && arr[largest]>arr[largest]){
            largest = left;
        }

        if(right<n && arr[right] > arr[largest]){
            largest = right;
        }

        if(largest!=i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    public static void printHeap(int[] arr, int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int delete(int [] arr, int n){
        int last = arr[n-1];
        arr[0] = last;
        n-=1;

        heapify(arr, n, 0);

        return n;
    }

    public static void main(String[] args) {
        int maxLength = 100;
        int[] arr = new int[maxLength];

        arr[0] = 10;
        arr[1] = 5;
        arr[2] = 3;
        arr[3] = 2;
        arr[4] = 4;
        int n=5;

        System.out.print("Before heapify: ");
        printHeap(arr, n);
        n = delete(arr, n);
        System.out.print("After heapify: ");
        printHeap(arr, n);
    }
}
