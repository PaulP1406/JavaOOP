package DucDuyPhamCMPT276.Assignment3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuickSorterTest {

    private Sorter<Integer> sorter;

    @BeforeEach
    void setUp() {
        sorter = new QuickSort<>();
    }

    // Functional test cases, 13 in total
    @Test
    void NegativeNumbers() {
        Integer[] arr = { -3, -1, -4, -2 };
        sorter.sort(arr);
        Integer[] expected = { -4, -3, -2, -1 };
        assertArrayEquals(expected, arr);
    }

    @Test
    void MixedPositiveAndNegativeNumbers() {
        Integer[] arr = { 3, -1, 4, -2 };
        sorter.sort(arr);
        Integer[] expected = { -2, -1, 3, 4 };
        assertArrayEquals(expected, arr);
    }

    @Test
    void Duplicates() {
        Integer[] arr = { 5, 3, 3, 9, 9 };
        sorter.sort(arr);
        Integer[] expected = { 3, 3, 5, 9, 9 };
        assertArrayEquals(expected, arr);
    }

    @Test
    void ElementsSame() {
        Integer[] arr = { 2, 2, 2, 2 };
        sorter.sort(arr);
        Integer[] expected = { 2, 2, 2, 2 };
        assertArrayEquals(expected, arr);
    }

    @Test
    void LargeNumbers() {
        Integer[] arr = { Integer.MAX_VALUE, 0, Integer.MIN_VALUE, Integer.MAX_VALUE - 1 };
        sorter.sort(arr);
        Integer[] expected = { Integer.MIN_VALUE, 0, Integer.MAX_VALUE - 1, Integer.MAX_VALUE };
        assertArrayEquals(expected, arr);
    }

    @Test
    void AllZeroes() {
        Integer[] arr = { 0, 0, 0, 0 };
        sorter.sort(arr);
        Integer[] expected = { 0, 0, 0, 0 };
        assertArrayEquals(expected, arr);
    }

    @Test
    void SortedArray() {
        Integer[] arr = { 1, 2, 3, 4 };
        sorter.sort(arr);
        Integer[] expected = { 1, 2, 3, 4 };
        assertArrayEquals(expected, arr);
    }

    @Test
    void ReverseOrderedArray() {
        Integer[] arr = { 4, 3, 2, 1 };
        sorter.sort(arr);
        Integer[] expected = { 1, 2, 3, 4 };
        assertArrayEquals(expected, arr);
    }

    @Test
    void RandomOrder() {
        Integer[] arr = { 2, 3, 1, 4, 5 };
        sorter.sort(arr);
        Integer[] expected = { 1, 2, 3, 4, 5 };
        assertArrayEquals(expected, arr);
    }

    @Test
    void StringArray() {
        Sorter<String> sorter2 = new QuickSort<>();
        String[] arr = { "cmpt276", "cmpt378", "cmpt291", "cmpt300" };
        sorter2.sort(arr);
        String[] expected = { "cmpt276", "cmpt291", "cmpt300", "cmpt378" };
        assertArrayEquals(expected, arr);
    }

    @Test
    void OddNumberOfElements() {
        Integer[] arr = { 3, 1, 2 };
        sorter.sort(arr);
        Integer[] expected = { 1, 2, 3 };
        assertArrayEquals(expected, arr);
    }

    @Test
    void EvenNumberOfElements() {
        Integer[] arr = { 4, 2, 3, 1 };
        sorter.sort(arr);
        Integer[] expected = { 1, 2, 3, 4 };
        assertArrayEquals(expected, arr);
    }

    @Test
    void LongArray() {
        Integer[] arr = new Integer[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i;
        }
        sorter.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            assertEquals(i + 1, arr[i]);
        }
    }

    // Structural test cases:
    // Pivot related tests: (The last element is the pivot in this algorithm)
    @Test
    void PivotAsSmallestElement() {
        Integer[] arr = { 4, 3, 2, 5, 1 };
        sorter.sort(arr);
        Integer[] expected = { 1, 2, 3, 4, 5 };
        assertArrayEquals(expected, arr);
    }

    @Test
    void PivotAsLargestElement() {
        Integer[] arr = { 4, 2, 3, 1, 5 };
        sorter.sort(arr);
        Integer[] expected = { 1, 2, 3, 4, 5 };
        assertArrayEquals(expected, arr);
    }

}
