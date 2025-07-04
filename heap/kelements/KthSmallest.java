package kelements;

import java.util.PriorityQueue;

public class KthSmallest {

    public static void findKthSmallest(int[] arr, int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b-a);
        for(int i=0; i<arr.length; i++){
            maxHeap.add(arr[i]);
            if(maxHeap.size()>k) maxHeap.poll();
        }
        System.out.println(maxHeap.peek());
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int k = 2;
        findKthSmallest(arr, k);
    }
}
