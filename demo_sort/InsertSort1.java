package demo_sort;

import java.util.Random;

public class InsertSort1 {
	public static void main(String[] args) {
//		int array[]=new int[]{9,5,8,1,4};
		int array[]=new int[10000];
		Random r=new Random();
		for(int i=0;i<10000;i++){
			array[i]=r.nextInt(10000);
		}
		long begin=System.currentTimeMillis();
		for(int i=1;i<array.length;i++){
			int temp=array[i];
			int j=i-1;
			while(j>=0&&array[j]>temp){
				array[j+1]=array[j];
				j--;
			}
			if(j!=i-1){
				array[j+1]=temp;
			}
		}
		long end=System.currentTimeMillis();
		System.out.println(end-begin+"ms");
//		for(int a:array){
//			System.out.println(a);
//		}
	}

}
