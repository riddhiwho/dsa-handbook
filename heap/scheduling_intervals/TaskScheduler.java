package scheduling_intervals;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TaskScheduler {

    public static int findMinIntervals(char[] tasks, int n){
        Map<Character, Integer> freqMap = new HashMap<>();
        for(char c : tasks){
            freqMap.put(c, freqMap.getOrDefault(c, 0)+1);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b-a);
        maxHeap.addAll(freqMap.values());

        Queue<int[]> coolDownQueue = new LinkedList<>();
        int time=0;

        while (!maxHeap.isEmpty() || !coolDownQueue.isEmpty()) {
            time++;
            if(!maxHeap.isEmpty()){
                int count = maxHeap.poll()-1;
                if(count>0){
                    coolDownQueue.offer(new int[]{count, time+n});
                }
            }

            if(!coolDownQueue.isEmpty() && coolDownQueue.peek()[1]==time){
                maxHeap.offer(coolDownQueue.poll()[0]);
            }
        }
        return time;
    }

    public static void main(String[] args) {
        char[] tasks = {'A','A','A','B','B','C'};
        int n = 2;
        System.out.println(findMinIntervals(tasks, n));
    }
}
