package merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;


class Node{
    int value;
    int listIndex;
    int elementIndex;

    public Node(int value, int listIndex, int elementIndex){
        this.value=value;
        this.listIndex=listIndex;
        this.elementIndex=elementIndex;
    }
}

public class SmallestRangeFinder {

    public static int[] findSmallestRange(List<List<Integer>> nums){
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(n -> n.value));

        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<nums.size(); i++){
            int curr = nums.get(i).get(0);
            pq.offer(new Node(curr, i, 0));
            max=Math.max(max, curr);
        }

        int rangeStart=0;
        int rangeEnd=Integer.MAX_VALUE;

        while (pq.size()==nums.size()) {
            Node minNode = pq.poll();
            int currMin = minNode.value;
            
            if(max-currMin<rangeEnd-rangeStart){
                rangeStart=currMin;
                rangeEnd=max;
            }

            if(minNode.elementIndex+1<nums.get(minNode.listIndex).size()){
                int nextVal = nums.get(minNode.listIndex).get(minNode.elementIndex+1);
                pq.offer(new Node(nextVal, minNode.listIndex, minNode.elementIndex+1));
                max=Math.max(max, nextVal);
            }else{
                break;
            }
        }
        return new int[]{rangeStart, rangeEnd};
    }

    public static void main(String[] args) {
        List<List<Integer>> nums = new ArrayList<>();
        nums.add(Arrays.asList(4, 10, 15, 24, 26));
        nums.add(Arrays.asList(0, 9, 12, 20));
        nums.add(Arrays.asList(5, 18, 22, 30));
        System.out.println(Arrays.toString(findSmallestRange(nums)));
    }
}
