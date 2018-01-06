package demo_sort;
/**
 * Ñ¡ÔñÅÅĞòËã·¨
 */

import java.util.Random;

public class SelectSort {
	public static void main(String[] args) {
//		int array[]=new int[]{9,6,3,2,8,7};
		Random r=new Random();
		int array[]=new int[10000];
		for(int i=0;i<10000;i++){
			array[i]=r.nextInt(10000);
		}
		int lenth=array.length;
		long begin=System.currentTimeMillis();
		for(int i=0;i<lenth;i++){
			for(int j=i+1;j<lenth;j++){
				if(array[i]>array[j]){
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		long end=System.currentTimeMillis();
		System.out.println(end-begin+"ms");
//		for(int a:array){
//			System.out.println(a);
//		}
	}

}
