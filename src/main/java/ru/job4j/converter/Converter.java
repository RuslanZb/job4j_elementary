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
        String euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        String dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollars.");
    }
}
