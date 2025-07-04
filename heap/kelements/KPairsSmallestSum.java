package kelements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.List;

public class KPairsSmallestSum {

    public static List<List<Integer>> findKPairs(int[] nums1, int[] nums2, int k){
        List<List<Integer>> res = new ArrayList<>();
        if(nums1.length==0 || nums2.length==0 || k==0) return res;
        PriorityQueue<int[]>  minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        for(int i=0; i<Math.min(k, nums1.length); i++){
            minHeap.offer(new int[]{nums1[i]+nums2[0], i, 0});
        }

        while (k-->0 && !minHeap.isEmpty()) {
            int[] top = minHeap.poll();
            int sum = top[0];
            int i = top[1];
            int j = top[2];

            res.add(Arrays.asList(nums1[i], nums2[j]));

            if(j+1<nums2.length) minHeap.offer(new int[]{nums1[i]+nums2[j+1], i, j+1});
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,11}, nums2 = {3,4,6};
        int k = 3;
        List<List<Integer>> ans = findKPairs(nums1, nums2, k);
        for (List<Integer> pair : ans) {
            System.out.println(pair);
        }
    }
}
