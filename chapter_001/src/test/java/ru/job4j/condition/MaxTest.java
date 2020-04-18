package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMaxLeft() {
        int resultLeft = Max.maxLeft(4, 1);
        assertThat(resultLeft, is(4));
    }

    @Test
    public void whenMaxRight() {
        int resultRight = Max.maxLeft(1, 2);
        assertThat(resultRight, is(2));
    }

    @Test
    public void whenMaxEqual() {
        int resultEqual = Max.maxLeft(3, 3);
        assertThat(resultEqual, is(3));
    }

    @Test
    public void whenFirstGreatSecondAndThird() {
        Max maxi = new Max();
        int result = Max.maxLeft(3, 1, 2);
        assertThat(result, is(3));
    }

    @Test
    public void whenSecondGreatFirstAndThird() {
        Max maxi = new Max();
        int result = Max.maxLeft(1, 2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenThirdGreatFirstAndSecond() {
        Max maxi = new Max();
        int result = Max.maxLeft(2, 3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenFourthGreatFirstAndSecondAndThird() {
        Max maxi = new Max();
        int result = Max.maxLeft(5, 2, 3, 6);
        assertThat(result, is(6));
    }
}
