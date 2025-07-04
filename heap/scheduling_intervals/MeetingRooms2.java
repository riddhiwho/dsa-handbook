package scheduling_intervals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class Interval{
    int start;
    int end;

    public Interval(int start, int end){
        this.start=start;
        this.end=end;
    }
}

public class MeetingRooms2 {

    public static int findMinMeetingRooms(List<Interval> intervals){
        if(intervals.size()==0) return 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        intervals.sort(Comparator.comparingInt(i -> i.start));

        for(Interval meeting : intervals){
            if(!minHeap.isEmpty() && meeting.start>=minHeap.peek()){
                minHeap.poll();
            }
            minHeap.offer(meeting.end);
        }
        return minHeap.size();
    }

    public static void main(String[] args) {
        List<Interval> intervals = Arrays.asList(
            new Interval(0, 40),
            new Interval(5, 10),
            new Interval(15, 20)
        );

        System.out.println(findMinMeetingRooms(intervals));
    }
}



/**
 * Given an array of meeting time interval objects consisting of start and end times
 * [[start_1,end_1],[start_2,end_2],...] (start_i < end_i), 
 * find the minimum number of days required to schedule all meetings without any conflicts.
 * 
 * Example:
 * Input: intervals = [(0,40),(5,10),(15,20)]
 * 
 * Output: 2
 */

 /**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */
