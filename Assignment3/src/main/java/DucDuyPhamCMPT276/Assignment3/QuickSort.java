package DucDuyPhamCMPT276.Assignment3;

public class QuickSort<T extends Comparable<T>> implements Sorter<T> {

    /**
     * Sorts the array using the Quick Sort algorithm.
     * @param arr the array to be sorted.
     */
    @Override
    public void sort(T[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    /**
     * The recursive function that implement Quick sort algorithm
     * @param arr the array to be sorted.
     * @param low starting index.
     * @param high ending index.
     */
    private void quickSort(T[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);

            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    /**
     * This method takes the last element as pivot, places the pivot element at its correct
     * position in sorted array, and places all smaller (smaller than pivot) to left of pivot
     * and all larger elements to right of pivot.
     * @param arr the array to be sorted.
     * @param low starting index.
     * @param high ending index.
     * @return the partitioning index.
     */
    private int partition(T[] arr, int low, int high) {
        T pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) <= 0) {
                i++;

                // Swap arr[i] and arr[j]
                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (or pivot)
        T temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
