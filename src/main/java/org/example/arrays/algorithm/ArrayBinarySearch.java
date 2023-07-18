package org.example.arrays.algorithm;

/**
 * 二分查找法
 * 定义数组: int[] arr2 = new int[]{2,4,5,8,12,15,19,26,37,49,51,66,89,100}
 * 查找元素5是否在上述数组中出现过? 如果出现，输出对应的索引值。
 *
 * @author mac
 */
public class ArrayBinarySearch {

    public static void main(String[] args) {
        int[] arr2 = new int[]{2, 4, 5, 8, 12, 15, 19, 26, 37, 49, 51, 66, 89, 100};

        //目标数
        int target = 5;

        //默认的首索引
        int head = 0;
        //默认尾索引
        int end = arr2.length - 1;

        while (head <= end) {
            //中间索引
            int middle = (head + end) / 2;
            //刚好命中
            if (target == arr2[middle]) {
                System.out.println(middle);
                break;
            } else if (target > arr2[middle]) {
                //比中间数大
                head = middle + 1;
            } else {
                //比中间数小
                end = middle - 1;
            }
        }
    }
}
