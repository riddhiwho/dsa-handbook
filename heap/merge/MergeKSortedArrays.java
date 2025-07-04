package merge;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedArrays {

    public static List<Integer> mergeKLists(int[][] arr){
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)-> Integer.compare(a[0], b[0]));
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if (arr[i].length > 0) pq.offer(new int[]{arr[i][0], i, 0});
        }

        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            int arrIndex = top[1];
            int elementIndex = top[2];
            res.add(top[0]);
            if(elementIndex<arr[arrIndex].length-1) pq.offer(new int[]{arr[arrIndex][elementIndex+1], arrIndex, elementIndex+1});
        }
        return res;
    }   
    
    public static void main(String[] args) {
        int[][] arr = {{1,4,5}, {1,3,5}, {2,6}};
        List<Integer> res = mergeKLists(arr);
        System.out.println(res);
    }
}
