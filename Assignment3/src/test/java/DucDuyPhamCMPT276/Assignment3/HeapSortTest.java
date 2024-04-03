package DucDuyPhamCMPT276.Assignment3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HeapSortTest {

    private Sorter<Integer> sorter;

    @BeforeEach
    void setUp() {
        sorter = new HeapSort<>();
    }

    // Functional test cases
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
        Integer[] arr = { 5, 3, 3, 10, 10 };
        sorter.sort(arr);
        Integer[] expected = { 3, 3, 5, 10, 10 };
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

    // Structural test cases for HeapSort
    
}
