package ru.job4j.array;

public class SplitArray {
    public static Object[][] split(Object[] array, int k) {
        int n = array.length;
        int min = n / k;
        int mod = n % k;
        Object[][] rsl = new Object[k][];
        int index = 0;
        for (int i = 0; i < k; i++) {
            int length = min;
            if (mod > 0) {
                length++;
                mod--;
            }
            rsl[i] = new Object[length];
            for (int j = 0; j < length; j++) {
                rsl[i][j] = array[index++];
            }
        }
        return rsl;
    }
}
