package ru.job4j.converter;

public class Converter {

    public static String rubleToEuro(float value) {
        String rsl = String.format("%.2f", value / 70);
        return rsl;
    }

    public static String rubleToDollar(float value) {
        String rsl = String.format("%.2f", value / 60);
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        String expected = "2,00";
        String out = Converter.rubleToEuro(in);
        boolean passed = expected.equals(out);
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        expected = "2,33";
        out = Converter.rubleToDollar(in);
        passed = expected.equals(out);
        System.out.println("140 rubles are 2,33 dollars. Test result : " + passed);
    }
}
