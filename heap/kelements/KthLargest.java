package kelements;

import java.util.PriorityQueue;

public class KthLargest {

    public static void findKthLargest(int[] arr, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0; i<arr.length; i++){
            minHeap.add(arr[i]);
            if(minHeap.size()>k) minHeap.poll();
        }
        System.out.println(minHeap.peek());
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int k = 3;
        findKthLargest(arr, k);
    }
}
