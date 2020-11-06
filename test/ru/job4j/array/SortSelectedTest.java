package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort0() {
        int[] input = new int[] {34, 74, 31, 12, 15};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {12, 15, 31, 34, 74};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort1() {
        int[] input = new int[] {2, 48, 17, 21, 25};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {2, 17, 21, 25, 48};
        assertThat(result, is(expect));
    }
}