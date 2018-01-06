package demo_sort;

import java.util.Random;

public class InsertSort2 {
	public static void main(String[] args) {
//		int array[]=new int[]{9,1,4,3,6};
		int array[]=new int[10000];
		Random r=new Random();
		for(int i=0;i<10000;i++){
			array[i]=r.nextInt(10000);
		}
		long begin=System.currentTimeMillis();
		for(int i=1;i<array.length;i++){
			for(int j=i;j>0;j--){
				if(array[j-1]>array[j]){
					int temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
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
