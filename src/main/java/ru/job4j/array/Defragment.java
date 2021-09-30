package ru.job4j.array;

public class Defragment {
    @SuppressWarnings("checkstyle:NoWhitespaceAfter")
    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] != null) {
                        SwitchArray.swap(array, i, j);
                       break;
                    }
                }
            }
        }
        return array;
    }
}
