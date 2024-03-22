package DucDuyPhamCMPT276.Assignment3;

public class MergeSort<T extends Comparable<T>> implements Sorter<T> {

    /**
     * Sorts the array using the Merge Sort algorithm.
     * @param arr the array to be sorted.
     */
    @SuppressWarnings("unchecked")
	@Override
    public void sort(T[] arr) {
        if (arr.length < 2) {
            return;
        }
        int mid = arr.length / 2;
        T[] left = (T[]) new Comparable[mid];
        T[] right = (T[]) new Comparable[arr.length - mid];

        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        sort(left);
        sort(right);

        merge(arr, left, right);
    }

    /**
     * Merges two subarrays of arr[].     
     * @param arr the original array.
     * @param left the left subarray.
     * @param right the right subarray.
     */
    private void merge(T[] arr, T[] left, T[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) <= 0) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
}
