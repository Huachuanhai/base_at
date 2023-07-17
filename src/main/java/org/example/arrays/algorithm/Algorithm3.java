package org.example.arrays.algorithm;

/**
 * 练习3
 * 案例:使用二维数组打印一个 10 行杨辉三角
 * 提示:
 * 1.第一行有 1 个元素，第 n 行有 n 个元素
 * 2.每一行的第一个元素和最后一个元素都是 1
 * 3.从第三行开始，对于非第一个元素和最后一个元素的元素。
 * yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
 *
 * @author mac
 */
public class Algorithm3 {

    public static void main(String[] args) {
        //1.创建二维数组
        int[][] arr = new int[10][];

        //2.使用循环结构，初始化外层数组元素
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
            //3.给数组的元素赋值
            //3.1 给数组每行的首末元素赋值1
            arr[i][0] = 1;
            arr[i][i] = 1;

            //3.2 给数组每行的非首末元素赋值
            if (i < 2) {
                continue;
            }

            for (int j = 1; j < arr[i].length - 1; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
            }

        }

        //遍历二维数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
