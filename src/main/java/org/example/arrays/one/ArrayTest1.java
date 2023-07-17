package org.example.arrays.one;

/**
 * 一维数组
 *
 * @author mac
 */
public class ArrayTest1 {

    public static void main(String[] args) {
        //静态初始化1
        int[] arr1 = new int[]{1, 2, 3};


        int[] arr2;
        arr2 = new int[]{4, 5, 6};

        //静态初始化2
        int[] arr3 = {7, 8, 9};

        //动态数组
        int[] arr4 = new int[4];

        //遍历
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
