package org.example.arrays.algorithm;

/**
 * 快速排序法
 * 使用快速排序法，实现整型数组元素的排序操作
 * 比如: int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};
 *
 * @author mac
 */
public class ArrayQuickSort {

    public static void main(String[] args) {
        int[] array = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};
        quickSort(array, 0, array.length - 1);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);
            quickSort(array, low, pivot - 1);
            quickSort(array, pivot + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
