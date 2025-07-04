public class Insert {

    public static void heapify(int[] arr, int i){
        int parent = (i-1)/2;
        if(parent>=0){
            if(arr[parent]<arr[i]){
                int temp = arr[parent];
                arr[parent] = arr[i];
                arr[i] = temp;

                heapify(arr, parent);
            }
        }
    }

    public static void printHeap(int[] arr, int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int insert(int[] arr, int n, int key){
        n+=1;
        arr[n-1] = key;
        heapify(arr, n-1);
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
        int key = 15;

        System.out.print("Before heapify: ");
        printHeap(arr, n);
        n=insert(arr, n, key);
        System.out.print("After heapify: ");
        printHeap(arr, n);
    }
}