package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1Left() {
        int resultLeft = Max.maxLeft(3, 2);
        assertThat(resultLeft, is(3));
    }
    @Test
    public void whenMax2Right() {
        int resultRight = Max.maxRight(1, 2);
        assertThat(resultRight, is(2));
    }

    @Test
    public void whenLeftEqualRight() {
        int resultLeftEqualRight = Max.LeftEqualRight(3, 3);
        assertThat(resultLeftEqualRight, is(3));
    }

}
