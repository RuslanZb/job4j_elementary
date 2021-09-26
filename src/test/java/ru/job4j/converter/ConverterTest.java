package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        String expected = "2,00";
        String out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert180RblThen3Dollars() {
        float in = 180;
        String expected = "3,00";
        String out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
}
