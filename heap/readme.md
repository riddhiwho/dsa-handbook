HEAP

1. Complete Binary Tree - all levels are filled except possibly the last level, which is filled from left to right.
2. Follows Heap Property (Min-Heap/MaX-Heap)

For any node at index i in array arr:

- Parent - arr[(i-1)/2]
- Left child - arr[2*i]+1
- Right child - arr[2*i]+2

Max-heap:
Parent >=children

Min-heap:
Parent<=children


Operations:

1. Insert
2. Delete
3. Heap Sort
4. Heapify


Insert:

1. Increase size of arrtay by 1 and insert the element in the end.
2. Keep comparing with parent till it's >=0 and swap if parent < child

Time Complexity:

1. Insert - O(logN)
2. Delete - O(logN)
3. Heapify (on 1 node)  - O(logN)
4. HeapSort - O(NlogN)