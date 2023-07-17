package org.example.arrays.algorithm;

/**
 * 练习2
 * 分析以下需求，并用代码实现
 * (1) 在编程竞赛中，有10位评委为参赛的选手打分，分数分别为:5,4,6,8,9,0,1,2,7,3
 *
 * (2) 求选手的最后得分(去掉一个最高分和一个最低分后其余8位评委打分的平均值)
 *
 * @author mac
 */
public class Algorithm2 {

    public static void main(String[] args) {
        //初始化
        int[] arr = {5,4,6,8,9,0,1,2,7,3};
        int[] arr1 = new int[8];

        //求最大值
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        //最小值
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        //总和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        sum = sum - (max + min);
        System.out.println("总和：" + sum);


        //平均值
        int avg = sum / (arr.length - 2);
        System.out.println("平均值：" + avg);
    }
}
