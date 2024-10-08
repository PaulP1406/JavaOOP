package DucDuyPhamCMPT276.Assignment3;

public class HeapSort<T extends Comparable<T>> implements Sorter<T> {

    /**
     * Sorts an array using the HeapSort algorithm.
     * @param arr the array to be sorted.
     */
    @Override
    public void sort(T[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
                       T temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    /**
     * To heapify a subtree rooted with node i which is an index in array[].
     * n is size of heap.
     */
    void heapify(T[] arr, int n, int i) {
        int largest = i; 
        int left = 2 * i + 1; 
        int right = 2 * i + 2; 

        if (left < n && arr[left].compareTo(arr[largest]) > 0)
            largest = left;

        if (right < n && arr[right].compareTo(arr[largest]) > 0)
            largest = right;

         if (largest != i) {
            T swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            
            heapify(arr, n, largest);
        }
    }
}
