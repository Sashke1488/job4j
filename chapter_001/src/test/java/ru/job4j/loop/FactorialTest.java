package ru.job4j.loop;

import org.junit.Test;
import ru.job4j.condition.SqMax;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int resultFactorialForFiveThenOneHundreedTwenty = Factorial.calc(5);
        assertThat(resultFactorialForFiveThenOneHundreedTwenty, is(120));
    }
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int resultFactorialForZeroThenOne = Factorial.calc(0);
        assertThat(resultFactorialForZeroThenOne, is(1));
    }
}
