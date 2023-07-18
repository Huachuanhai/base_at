package org.example.arrays.algorithm;

/**
 * 冒泡排序法
 * 使用冒泡排序，实现整型数组元素的排序操作
 * 比如: int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};
 *
 * @author mac
 */
public class ArrayBubbleSort {

    public static void main(String[] args) {
        int[] arr = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    //交换
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[i] = tmp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
