package practice1003;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created with IDEA
 *
 * 求最大子段和问题
 *
 * @author DuzhenTong
 * @Date 2018/3/11
 * @Time 14:03
 */
public class Test {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        int[] array = new int[]{6, -1, 5, 4, -7};
        System.out.println(new Test().MaxSum(array));
        System.out.println(new Test().MaxSum1(array));
        System.out.println(new Test().MaxSum2(array));
        System.out.println(new Test().MaxSum3(array));
    }

    /**
     * 枚举法
     * @param array
     * @return
     */
    public int MaxSum(int[] array) {
        int currentSum = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                currentSum = 0;
                for (int k = i; k <= j; k++) {
                    currentSum = currentSum + array[k];
                }
                if (currentSum > sum) {
                    sum = currentSum;
                }
            }
        }
        return sum;
    }

    /**
     * 枚举法
     * @param array
     * @return
     */
    public int MaxSum1(int[] array) {
        int currentSum = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            currentSum = 0;
            for (int j = i; j < array.length; j++) {
                currentSum += array[j];
                if (currentSum > sum) {
                    sum = currentSum;
                }
            }
        }
        return sum;
    }

    /**
     * 动态规划
     * @param array
     * @return
     */
    public int MaxSum2(int[] array) {
        int currentSum = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            currentSum += array[i];
            if (currentSum > sum) {
                sum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return sum;
    }

    /**
     * 动态规划
     * @param array
     * @return
     */
    public int MaxSum3(int[] array) {
        int sum = 0;
        int y = 0;
        for (int i = 0; i < array.length; i++) {
            if (y > 0) {
                y += array[i];
            } else {
                y = array[i];
            }
            if (y > sum) {
                sum = y;
            }
        }
        return sum;
    }
}
