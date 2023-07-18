package org.example.arrays.algorithm;

/**
 * 线性查找
 * 定义数组: int[] arr1 = new int[]{34,54,3,2,65,7,34,5,76,34,67}
 * 查找元素5是否在上述数组中出现过? 如果出现，输出对应的索引值。
 *
 * @author mac
 */
public class ArrayLineSearch {

    public static void main(String[] args) {
        int[] arr1 = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};
        boolean exist = false;
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (5 == arr1[i]) {
                exist = true;
                index = i;
                break;
            }
        }
        System.out.println(exist);
        System.out.println(index);
    }
}
