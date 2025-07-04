package kelements;

import java.util.PriorityQueue;

public class KthLargestSubarraySum {

    public static int findKthLargestSubSum(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0; i<arr.length; i++){
            int sum=0;
            for(int j=i; j<arr.length; j++){
                sum+=arr[j];
                if(pq.size()<k) pq.offer(sum);
                else{
                    if(sum>pq.peek()){
                        pq.poll();
                        pq.offer(sum);
                    }
                }
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] arr = {20, -5, -1};
        int k = 3;
        System.out.println(findKthLargestSubSum(arr, k));
    }
}
