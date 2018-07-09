package test;

import java.util.Stack;

/**
 * Created with IDEA
 *
 * 不用额外的变量交换两个整数的值
 * 三种方法
 *
 * 假设a异或b的结果是c，c就是a整数位信息和b整数位信息的所有不同信息
 * 比如a=4=100,b=3=011,a^b=c=000
 *
 * a异或c的结果是b
 * b异或c的结果是a
 *
 * 算数
 * 使用坐标比较好理解
 *
 * 使用栈
 * 栈翻转
 *
 * @author duzhentong
 * @Date 2018/7/7
 * @Time 7:45
 */
public class ChangeTwoNums {
    public static void main(String[] args) {
        /**
         * 使用位运算
         */
        int a = 1;
        int b = 9;
        System.out.println(a + "," + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + "," + b);


        /**
         * 算数运算
         */
        int c = 4;
        int d = 6;
        System.out.println(c + "," + d);
        c = c + d;
        d = c - d;
        c = c - d;
        System.out.println(c + "," + d);

        /**
         * 使用栈结构
         */
        int e = 6;
        int f = 8;
        System.out.println(e + "," + f);
        Stack<Integer> stack = new Stack<>();
        stack.push(e);
        stack.push(f);
        e = stack.pop();
        f = stack.pop();
        System.out.println(e + "," + f);
    }

}
