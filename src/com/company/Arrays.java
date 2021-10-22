package com.company;

public class Arrays {

    public int[] SumDiog(int [][]arrays ) {
        int Count = arrays.length;
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
        return result;
    }


}
