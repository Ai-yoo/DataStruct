package test.array;

/**
 * Created with IDEA
 *
 * @author duzhentong
 * @Date 2018/7/1
 * @Time 10:24
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 7, 1, 10, 4, 4, 4};
        sort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + ",");
        }
    }

    public static void sort(int[] arr, int l, int r) {
        if (l < r) {
            int p = par(arr, l, r);
            sort(arr, l, p - 1);
            sort(arr, p + 1, r);}
    }

    public static int par(int[] arr, int l, int r) {
        int less = l - 1;
        int p = arr[r];
        /**
         * 如果每遍历的一个数，大于划分值，直接跳到下一个数，小于等于划分值，
         * 就把小于等于区的下一个数和当前数交换后再遍历下一个数
         */
        for (int i = l; i <= r; i++) {
            if (arr[i] <= p) {
                swap(arr, ++less, i);
            }
        }
        return less;

    }

    public static void swap(int[] arr, int m, int n) {
        int temp = arr[m];
        arr[m] = arr[n];
        arr[n] = temp;
    }
}
