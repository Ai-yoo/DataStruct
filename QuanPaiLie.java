package test.array;

/**
 * Created with IDEA
 *
 * 全排列
 *
 * @author duzhentong
 * @Date 2018/7/16
 * @Time 8:27
 */
public class QuanPaiLie {
    public static void perm(int[] array, int p, int q) {
        if (p == q) {
            print(array);
        }
        for (int i = p; i <= q; i++) {
            swap(array, p, i);
            perm(array, p + 1, q);
            swap(array, p, i);
        }
    }

    public static void print(int[] array) {
        for (int a : array) {
            System.out.print(a + ",");
        }
        System.out.println();
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4};
        perm(array, 0, array.length - 1);
    }
}
