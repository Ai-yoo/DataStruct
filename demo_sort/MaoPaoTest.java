package demo_sort;
/**
 * 优化的冒泡排序：如果给定的数组中已经有按照顺序排列的数字，不必要进行多次循环比较
 * 不加优化：110多ms
 * 加优化：1ms
 */
import java.util.Random;

public class MaoPaoTest {
	public static void main(String[] args) {
		Random r=new Random();
		int array[]=new int[10000];
		for(int i=0;i<10000;i++){
			array[i]=i;
		}
		int lenth=array.length;
		int flag=1;
		long begin=System.currentTimeMillis();
		for(int i=0;i<lenth&&flag==1;i++){
			flag=0;
			for(int j=lenth-1;j>i;j--){
				if(array[j-1]>array[j]){
					int temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
					flag=1;
				}
			}
		}
		long end=System.currentTimeMillis();
		System.out.println(end-begin);
	}

}
