package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code her
//диоганал с лева  самого нижего угла
        int[][]arrays = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[]array;
        for (int i = 0; i < arrays.length; i++){
            for (int j = 0; j<arrays.length; j++){
                System.out.print(arrays[i][j]+" ");
            }
            System.out.println(" ");
        }
        Arrays run = new Arrays();
       array=run.SumDiog(arrays);
       for (int i = 0; i< array.length; i++){
           System.out.println(array[i]);
       }
    }
}