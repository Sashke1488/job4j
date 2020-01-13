package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMaxLeft() {
        int resultLeft = Max.maxLeft(2, 1);
        assertThat(resultLeft, is(2));
    }

    @Test
    public void whenMaxRight() {
        int resultRight = Max.maxRight(1, 1);
        assertThat(resultRight, is(1));
    }



}
