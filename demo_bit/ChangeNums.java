package test;

/**
 * Created with IDEA
 *
 * 不用额外的变量交换两个整数的值
 *
 * 假设a异或b的结果是c，c就是a整数位信息和b整数位信息的所有不同信息
 * 比如a=4=100,b=3=011,a^b=c=000
 *
 * a异或c的结果是b
 * b异或c的结果是a
 *
 * @author duzhentong
 * @Date 2018/7/7
 * @Time 7:45
 */
public class ChangeNums {
    public static void main(String[] args) {
        int a = 1;
        int b = 9;
        System.out.println(a + "," + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + "," + b);
    }

}
