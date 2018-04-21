package sort;

/**
 * Created with IDEA
 *
 * 归并排序
 *
 * @author duzhentong
 * @Date 2018/4/21
 * @Time 18:28
 */
public class MergeSort {
    public static void sortProcess(int[] array, int L, int R) {
        if (L == R) {
            return;
        }
        int mid = L + ((R - L) / 2);
        sortProcess(array, 0, mid);
        sortProcess(array, mid + 1, R);
        merge(array, 0, mid, array.length - 1);
    }

    public static void merge(int[] array, int L, int mid, int R) {
        int[] help = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = mid + 1;
        while (p1 <= mid && p2 <= R) {
            help[i++] = array[p1] > array[p2] ? array[p2++] : array[p1++];
        }
        while (p1 <= mid) {
            help[i++] = array[p1++];
        }
        while (p2 <= R) {
            help[i++] = array[p2++];
        }
        for (int j = 0; j < help.length; j++) {
            array[j] = help[j];
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 4, 6, 7, 2, 9, 3};
        sortProcess(array, 0, array.length - 1);
        for (int a : array) {
            System.out.println(a);
        }
    }
}
