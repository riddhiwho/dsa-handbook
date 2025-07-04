package kelements;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KClosestPoints {

    public static int[][] kClosestPointsHeap(int[][] points, int k){
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1]));
        
        for(int[] point : points){
            pq.add(point);
            if(pq.size()>k) pq.poll();
        }

        int[][] result = new int[k][2];
        while (k-->0) {
            result[k] = pq.poll();
        }
        return result;
    }

    public static int distance(int[] point){
        return point[0]*point[0] + point[1]*point[1];
    }

    public static int[][] kClosestPointsSorting(int[][] points, int k){
        Arrays.sort(points, (a, b) -> distance(a) - distance(b));
        
        return Arrays.copyOfRange(points, 0, k);
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 4}, {2, 2}, {5, 1}};
        // int[][] result = kClosestPointsSorting(arr, 2);

        int[][] result = kClosestPointsHeap(arr, 2);
        for(int[] res : result){
            System.out.println(Arrays.toString(res));
            // System.out.println(res[0] + " " + res[1]);
        }
    }
}
