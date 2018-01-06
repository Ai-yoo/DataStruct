package demo_sort;
/**
 * 普通的冒泡排序：就像一个个泡向上漂，小的数字与前面的数字挨个进行比较，如果小于前面的就换位置
 */

import java.util.Random;

public class MaoPao {
	public static void main(String[] args) {
		Random r=new Random();
//		int array[]=new int[10000];
		int array[]=new int[]{2,1,3,5,4};
		int num=0;
//		for(int i=0;i<10000;i++){
//			array[i]=r.nextInt(10000);
//		}
		int lenth=array.length;
		long begin=System.currentTimeMillis();
		for(int i=0;i<lenth;i++){
			for(int j=lenth-1;j>i;j--){
				if(array[j-1]>array[j]){
					int temp;
					temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
					num++;
				}
			}
		}
		System.out.println(num);
		long end=System.currentTimeMillis();
		System.out.println(end-begin+"ms");
//		for(int as:array){
//			System.out.println(as+" ");
//		}
	}
}
