package org.example.arrays.algorithm;

/**
 * 练习1
 * 定义一个int型的一维数组，包含10个元素，分别赋予一些随机数
 * 然后
 * 求出所有元素的最大值、最小值、总和、平均值
 * <p>
 * 要求；
 * 所有随机数都是两位数；[10-99]
 * 提示：求[a,b]范围内的随机数:(int)(Math.random() + (b - a + 1)) + a
 *
 * @author mac
 */
public class Algorithm1 {

    public static void main(String[] args) {
        //动态初始化方式创建数组
        int[] arr = new int[10];
        //通过循环给数组元素赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (99 - 10 + 1)) + 10;
        }

        //求最大值
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("最大值：" + max);

        //最小值
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("最小值：" + min);

        //总和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("总和：" + sum);


        //平均值
        int avg = sum / arr.length;
        System.out.println("平均值：" + avg);
    }
}
