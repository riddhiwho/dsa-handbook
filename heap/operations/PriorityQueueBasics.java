import java.util.PriorityQueue;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}


public class PriorityQueueBasics {
    public static void main(String[] args) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(10);
        minHeap.add(5);
        minHeap.add(3);
        minHeap.add(2);

        // System.out.println("Min Heap: " + minHeap);
        // System.out.println("Minimum Element: " + minHeap.peek());
        // System.out.println("Removing Minimum Element: " + minHeap.poll());
        // System.out.println("Min Heap after removal: " + minHeap);
        // System.out.println("Size of Min Heap: " + minHeap.size());
        // System.out.println("Is Min Heap Empty? " + minHeap.isEmpty());

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        maxHeap.add(10);
        maxHeap.add(5);
        maxHeap.add(3);
        maxHeap.add(2);

        // System.out.println("Max Heap: " + maxHeap);
        // System.out.println("Maximum Element: " + maxHeap.peek());
        // System.out.println("Removing Maximum Element: " + maxHeap.poll());
        // System.out.println("Max Heap after removal: " + maxHeap);
        // System.out.println("Size of Max Heap: " + maxHeap.size());
        // System.out.println("Is Max Heap Empty? " + maxHeap.isEmpty());

        // Example of using a custom object in a priority queue
        PriorityQueue<Person> personQueue = new PriorityQueue<>((a, b) -> a.age - b.age);
        personQueue.add(new Person("Alice", 30));
        personQueue.add(new Person("Bob", 25));
        personQueue.add(new Person("Charlie", 35));
        System.out.println("Person Queue: " + personQueue);
        while (!personQueue.isEmpty()) {
            Person p = personQueue.poll();
            System.out.println("Removing Person: " + p.name + ", Age: " + p.age);
        }

    }
}
