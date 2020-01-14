package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SqMAxTest {
    @Test
    public void whenMaxFirst() {
        int resultLeft = SqMax.max(6,2,3,4);
        assertThat(resultLeft, is(6));
    }
    @Test
    public void whenMaxSecond() {
        int resultLeft = SqMax.max(2,5,3,4);
        assertThat(resultLeft, is(5));
    }
    @Test
    public void whenMaxThird() {
        int resultLeft = SqMax.max(1,3,6,4);
        assertThat(resultLeft, is(6));
    }
    @Test
    public void whenMaxForth() {
        int resultLeft = SqMax.max(2,3,4,7);
        assertThat(resultLeft, is(7));
    }
}
