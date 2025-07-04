package merge;

import java.util.PriorityQueue;

public class ConnectRopes {

    public static int findMinCost(int[] nums){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int minCost = 0;
        
        for(int num : nums){
            pq.offer(num);
        }

        while (pq.size()>1) {
            int n1 = pq.poll();
            int n2 = pq.poll();

            int sum=n1+n2;
            minCost+=sum;
            pq.offer(sum);
        }
        return minCost;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 6};
        System.out.println(findMinCost(arr));
    }
}
