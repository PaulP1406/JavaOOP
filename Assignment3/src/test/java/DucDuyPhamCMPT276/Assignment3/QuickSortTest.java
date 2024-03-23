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

    @Test
    void testSortWithNegativeNumbers() {
        Integer[] arr = { -3, -1, -4, -2 };
        sorter.sort(arr);
        Integer[] expected = { -4, -3, -2, -1 };
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSortWithMixedPositiveAndNegativeNumbers() {
        Integer[] arr = { 3, -1, 4, -2 };
        sorter.sort(arr);
        Integer[] expected = { -2, -1, 3, 4 };
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSortWithDuplicates() {
        Integer[] arr = { 5, 3, 3, 2, 5 };
        sorter.sort(arr);
        Integer[] expected = { 2, 3, 3, 5, 5 };
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSortWithAllElementsSame() {
        Integer[] arr = { 1, 1, 1, 1 };
        sorter.sort(arr);
        Integer[] expected = { 1, 1, 1, 1 };
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSortWithLargeNumbers() {
        Integer[] arr = { Integer.MAX_VALUE, 0, Integer.MIN_VALUE, Integer.MAX_VALUE - 1 };
        sorter.sort(arr);
        Integer[] expected = { Integer.MIN_VALUE, 0, Integer.MAX_VALUE - 1, Integer.MAX_VALUE };
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSortWithAllZeroes() {
        Integer[] arr = { 0, 0, 0, 0 };
        sorter.sort(arr);
        Integer[] expected = { 0, 0, 0, 0 };
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSortWithSortedArray() {
        Integer[] arr = { 1, 2, 3, 4 };
        sorter.sort(arr);
        Integer[] expected = { 1, 2, 3, 4 };
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSortWithReverseOrderedArray() {
        Integer[] arr = { 4, 3, 2, 1 };
        sorter.sort(arr);
        Integer[] expected = { 1, 2, 3, 4 };
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSortWithRandomOrder() {
        Integer[] arr = { 2, 3, 1, 4, 5 };
        sorter.sort(arr);
        Integer[] expected = { 1, 2, 3, 4, 5 };
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSortWithStringArray() {
        Sorter<String> stringSorter = new QuickSort<>();
        String[] arr = { "cmpt276", "cmpt378", "cmpt291", "cmpt300" };
        stringSorter.sort(arr);
        String[] expected = { "cmpt276", "cmpt278", "cmpt291", "cmpt300"};
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSortWithOddNumberOfElements() {
        Integer[] arr = { 3, 1, 2 };
        sorter.sort(arr);
        Integer[] expected = { 1, 2, 3 };
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSortWithEvenNumberOfElements() {
        Integer[] arr = { 4, 2, 3, 1 };
        sorter.sort(arr);
        Integer[] expected = { 1, 2, 3, 4 };
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSortWithLongArray() {
        Integer[] arr = new Integer[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i;
        }
        sorter.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            assertEquals(i + 1, arr[i]);
        }
    }

}
