package ru.job4j.array;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }
        return array;
    }

    public static void main(String[] args) {
        try (FileOutputStream out = new FileOutputStream("matrix.txt")) {
            for (int[] array : Matrix.multiple(9)) {
                out.write(Arrays.toString(array).getBytes());
                out.write(System.lineSeparator().getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
