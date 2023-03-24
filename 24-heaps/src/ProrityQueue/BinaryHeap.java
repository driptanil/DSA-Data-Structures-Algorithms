package ProrityQueue;

import java.util.*;

import static com.sun.tools.javac.jvm.ByteCodes.swap;

// allows only variables which have a Comparable interface
public class BinaryHeap<T extends Comparable<T>> {

    // number of element in heap
    private int heapSize = 0;

    // the internal capacity of heap (size of list)
    private int heapCapacity = 0;

    // dynamic list to keep track of all the elements in the heap
    private List<T> heap = null;

    // Hashmap which allows O(log(n)) removals and O(1) element containment check
    private Map<T, TreeSet<Integer>> map = new HashMap<>();
    // Set stores unique data in unsorted way
    // whereas, TreeSet stores unique data in sorted way


    public BinaryHeap(int size) {
        this.heap = new ArrayList<>(size);
    }

    public BinaryHeap() {
        this(1);
    }

    public BinaryHeap(T[] arr) {
        heapSize = heapCapacity = arr.length;
        heap = new ArrayList<T>(heapCapacity);

        // place all element in heap
        for (int i = 0; i < heapSize; i++) {
            heap.add(arr[i]);
        }

        // Heapify process, O(n)
        for (int i = Math.max(0, (heapSize/ 2) - 1); i >= 0; i--) {
            sink(1);
        }
    }

    public BinaryHeap(Collection<T> elems) throws IllegalAccessException {
        this(elems.size());
        for (T elem : elems) {
            add(elem);
        }
    }

    public boolean isEmpty() {
        return heapSize == 0;
    }

    public void clear() {
        for (int i = 0; i < heapCapacity; i++) {
            heap.set(i, null);
            heapSize = 0;
        }
    }

    public int size() {
        return heapCapacity;
    }

    public T peeks() {
        if (isEmpty()) {
            return null;
        }
        return heap.get(0);
    }

    public T poll() {
        return removeAt(0);
    }

    public boolean contains(T elem) {
        for (int i = 0; i < heapSize; i++) {
            if (heap.get(i).equals(elem)) {
                return true;
            }
        }
        return false;
    }

    public void add(T elem) throws IllegalAccessException {
        if (elem == null) throw new IllegalAccessException();

        // breaking condition of recursion
        if (heapSize < heapCapacity) {
            heap.set(heapSize, elem);
        } else {
            heap.add(elem); // recursion call
            heapCapacity++;
        }

        swim(heapSize);
        heapSize++;
    }

    public boolean less(int i, int j) {
        T node1 = heap.get(i);
        T node2 = heap.get(i);
        return node1.compareTo(node2) <= 0;
    }

    private void swim (int k) {
        // index of the parent node of k
        int parent = (k - 1) / 2;

        // while root is less than parent
        while (k > 0 && less(k, parent)) {
            swap(parent, k);
            k = parent;

            parent = (k - 1) / 2;
        }
    }

    private void sink(int k) {
        while (true) {
            int left = 2 * k + 1;
            int right = 2 * k + 2;

            // assuming the left node is the smallest
            int smallest = left;

            // finds the smaller left or right
            // if right is small then smallest is set to right
            if (right < heapSize && less(right, left)) {
                smallest = right;
            }

            if (left >= heapSize || less(k, smallest)) {
                break;
            }

            swap(smallest, k);
            k = smallest;

        }
    }

    private void swap (int i, int j) {
        T iElement = heap.get(i);
        T jElement = heap.get(j);

        heap.set(i, iElement);
        heap.set(j, jElement);
    }

    public boolean remove (T element) {
        if (element == null) {
            return false;
        }
        for (int i = 0; i < heapSize; i++) {
            if (element.equals(heap.get(i))) {
                removeAt(i);
                return true;
            }
        }
        return false;
    }

    private T removeAt(int i) {
        if (isEmpty()) {
            return null;
        }

        heapSize--;
        T removedData = heap.get(i);
        swap(i, heapSize);

        heap.set(heapSize, null);

        if (i == heapSize) return removedData;
        T elem = heap.get(i);

        sink(i);

        if (heap.get(i).equals(elem)) swim(i);
        return removedData; 
    }

    public static void main(String[] args) {
    }
}
