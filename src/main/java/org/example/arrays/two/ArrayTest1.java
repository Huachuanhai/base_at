package org.example.arrays.two;

/**
 * 二维数组
 *
 * @author mac
 */
public class ArrayTest1 {

    public static void main(String[] args) {
        //初始化
        int[][] arr1;
        String[][] arr2;

        //静态初始化
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        //动态初始化
        int[][] arr3 = new int[3][];
        int[][] arr4 = new int[3][6];

        //练习1
        int[][] arr5 = new int[][]{{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};
        int sum = 0;

        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arr5[i].length; j++) {
                sum = sum + arr5[i][j];
            }
        }
        System.out.println(sum);


    }


}
