package kelements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {

    public static void findTopK(int[] arr, int k){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer> > queue
            = new PriorityQueue<>(
                (a, b)
                    -> a.getValue().equals(b.getValue())
                           ? Integer.compare(a.getKey(),
                                             b.getKey())
                           : Integer.compare(a.getValue(),
                                             b.getValue()));
        
        PriorityQueue<Map.Entry<Integer, Integer>> mp = new PriorityQueue<>(
            (a, b) -> a.getValue().equals(b.getValue())
                    ? Integer.compare(a.getKey(), b.getKey())
                    : Integer.compare(a.getValue(), b.getValue())

        );                                     

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            mp.offer(entry);
            if(mp.size()>k) mp.poll();
        }
        while (!mp.isEmpty()) {
            System.out.print(mp.poll().getKey() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 4, 4, 5, 2, 6, 1, 3, 3 };
        int K = 3;
        findTopK(arr, K);
    }
}
