package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SqureTest {
    @Test
    public void whenBound3Than014() {
        int bound = 3;
        int[] rst = Squre.calculate(bound);
        int[] expect = new int[]{0, 1, 4};
        assertThat(rst, is(expect));
    }

    public void whenBound5Than014916() {
        int bound = 5;
        int[] rst = Squre.calculate(bound);
        int[] expect = new int[]{0, 1, 4, 9, 16};
        assertThat(rst, is(expect));

    }
}