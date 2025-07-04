package two_heaps;

import java.util.PriorityQueue;

public class MedianStream {

    private static PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
    private static PriorityQueue<Integer> maxHeap = new PriorityQueue<>();


    public static double getMedian(){
        if(minHeap.size()==maxHeap.size()){
            return (maxHeap.peek() + minHeap.peek())/2.0;
        }else{
            return minHeap.peek();
        }
    }

    public static void addElement(int x){
        minHeap.offer(x);
        if(minHeap.size()-maxHeap.size()>1){
            maxHeap.offer(minHeap.poll());
        }
    }

    public static void main(String[] args) {
        
       
        addElement(3);
        addElement(2);
        addElement(1);
        System.out.println(getMedian());
        addElement(4);
        System.out.println(getMedian());
    }
}
