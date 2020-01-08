package ru.job4j.converter;

import converter.Converter;
import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {
    @Test
    public void sqArea() {
        int p = 7;
        int k = 8;
        int expected = 128;
        int out = Converter.sqArea(p,k);
        Assert.assertEquals(expected,out);
    }
}
