package com.company;

import java.util.Scanner;

public class Arrays {
    public void run() {


        int[][] arrays;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер матрицы:");
        int Count = scanner.nextInt();

        arrays = new int[Count][Count];

        for (int i = 0; i < Count; i++) {
            for (int j = 0; j < Count; j++) {
                System.out.println("Введите элемент матрицы [" + (i + 1) + ", " + (j + 1) + "]:");
                arrays[i][j] = scanner.nextInt();

            }

        }
        for (int i = 0; i < Count; i++) {
            for (int j = 0; j < Count; j++) {

                System.out.print(arrays[i][j] + " ");
            }
            System.out.println(" ");
        }
        boolean canGo = true;
        int i = Count - 1;
        int startI = i;
        int startJ = 0;
        int j = 0;
        int k = 0;
        int[] result = new int[Count * 2 - 1];
        while (canGo) {
            if (result[k] == 0)
                result[k] = arrays[i][j];
            else result[k] += arrays[i][j];
            if (i + 1 < Count && j + 1 < Count) {
                i++;
                j++;
            } else if (startI > 0) {
                j = 0;
                i = startI - 1;
                --startI;
                k++;
            } else if (startI == 0) {
                i = startI;
                if (startJ < Count - 1) {
                    j = startJ + 1;
                    ++startJ;
                    k++;
                } else canGo = false;
            }

        }
        for (int g = 0; g < result.length; g++) {
            System.out.println(result[g]);
        }

    }

}
