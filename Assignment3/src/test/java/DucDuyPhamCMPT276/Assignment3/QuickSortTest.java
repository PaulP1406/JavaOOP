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
        Integer[] array = {-3, -1, -4, -2};
        sorter.sort(array);
        Integer[] expected = {-4, -3, -2, -1};
        assertArrayEquals(expected, array);
    }

    @Test
    void testSortWithMixedPositiveAndNegativeNumbers() {
        Integer[] array = {3, -1, 4, -2};
        sorter.sort(array);
        Integer[] expected = {-2, -1, 3, 4};
        assertArrayEquals(expected, array);
    }

    @Test
    void testSortWithDuplicates() {
        Integer[] array = {5, 3, 3, 2, 5};
        sorter.sort(array);
        Integer[] expected = {2, 3, 3, 5, 5};
        assertArrayEquals(expected, array);
    }

    @Test
    void testSortWithAllElementsSame() {
        Integer[] array = {1, 1, 1, 1};
        sorter.sort(array);
        Integer[] expected = {1, 1, 1, 1};
        assertArrayEquals(expected, array);
    }

    @Test
    void testSortWithLargeNumbers() {
        Integer[] array = {Integer.MAX_VALUE, 0, Integer.MIN_VALUE, Integer.MAX_VALUE - 1};
        sorter.sort(array);
        Integer[] expected = {Integer.MIN_VALUE, 0, Integer.MAX_VALUE - 1, Integer.MAX_VALUE};
        assertArrayEquals(expected, array);
    }

    @Test
    void testSortWithAllZeroes() {
        Integer[] array = {0, 0, 0, 0};
        sorter.sort(array);
        Integer[] expected = {0, 0, 0, 0};
        assertArrayEquals(expected, array);
    }

    @Test
    void testSortWithSortedArray() {
        Integer[] array = {1, 2, 3, 4};
        sorter.sort(array);
        Integer[] expected = {1, 2, 3, 4};
        assertArrayEquals(expected, array);
    }

    @Test
    void testSortWithReverseOrderedArray() {
        Integer[] array = {4, 3, 2, 1};
        sorter.sort(array);
        Integer[] expected = {1, 2, 3, 4};
        assertArrayEquals(expected, array);
    }

    @Test
    void testSortWithRandomOrder() {
        Integer[] array = {2, 3, 1, 4, 5};
        sorter.sort(array);
        Integer[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, array);
    }

    @Test
    void testSortWithStringArray() {
        Sorter<String> stringSorter = new QuickSort<>();
        String[] array = {"banana", "apple", "mango", "cherry"};
        stringSorter.sort(array);
        String[] expected = {"apple", "banana", "cherry", "mango"};
        assertArrayEquals(expected, array);
    }

    @Test
    void testSortWithOddNumberOfElements() {
        Integer[] array = {3, 1, 2};
        sorter.sort(array);
        Integer[] expected = {1, 2, 3};
        assertArrayEquals(expected, array);
    }

    @Test
    void testSortWithEvenNumberOfElements() {
        Integer[] array = {4, 2, 3, 1};
        sorter.sort(array);
        Integer[] expected = {1, 2, 3, 4};
        assertArrayEquals(expected, array);
    }

    @Test
    void testSortWithLongArray() {
        Integer[] array = new Integer[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = array.length - i;
        }
        sorter.sort(array);
        for (int i = 0; i < array.length; i++) {
            assertEquals(i + 1, array[i]);
        }
    }

}
