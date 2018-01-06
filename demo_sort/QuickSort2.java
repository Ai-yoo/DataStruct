package demo_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class QuickSort2 {
	public static void main(String[] args) {
//		int[] array = new int[10000];
//		Random r = new Random();
//		for (int i = 0; i < 10000; i++) {
//			array[i] = r.nextInt(10000);
//		}
		int[] array=new int[]{9,6,4,2,6,7};
		// for(int g:array){
		// System.out.println(g);
		// }
		long begin = System.currentTimeMillis();
		sort(array);
		// int lenth=array.length;
		// int p=array[2];
		// System.out.println(p);
		// array[2]=array[lenth-1];
		// array[lenth-1]=p;
		// List x=new ArrayList();
		// int index=0;
		// for(int i=0;i<lenth-1;i++){
		// if(array[i]<=array[lenth-1]){
		// int temp=array[i];
		// array[i]=array[index];
		// array[index]=temp;
		// x.add(array[index]);
		// index++;
		// }
		// }
		// int temp1=array[lenth-1];
		// array[lenth-1]=array[index];
		// array[index]=temp1;
		long end = System.currentTimeMillis();
		// for(int i=index;i<lenth;i++){
		// x.add(array[i]);
		// }
		// System.out.println(x.toString());
		for(int a:array){
			System.out.println(a);
		}
		System.out.println(end - begin + "ms");
	}

	public static void sort(int array[]) {
		// long begin=System.currentTimeMillis();
		if (array.length==0||array.length==1) {
			System.out.println("-----------------");
			return;
		} else {
			int lenth = array.length;
			int p = array[1];
//			System.out.println(p);
			array[1] = array[lenth - 1];
			array[lenth - 1] = p;
			List x = new ArrayList();
			int index = 0;
			for (int i = 0; i < lenth - 1; i++) {
				if (array[i] <= array[lenth - 1]) {
					int temp = array[i];
					array[i] = array[index];
					array[index] = temp;
					x.add(array[index]);
					index++;
				}
			}
			int temp1 = array[lenth - 1];
			array[lenth - 1] = array[index];
			array[index] = temp1;
			int[] a = new int[x.size()];
			Iterator it = x.iterator();
			int j = 0;
			while (it.hasNext()) {
				a[j] = (int) it.next();
				j++;
			}
			if(a.length==1|a.length==0){
				return;
			}else{
			sort(a);}
			// long end=System.currentTimeMillis();
			int[] v = new int[lenth - index];
			int g = 0;
			for (int i = index; i < lenth; i++) {
				v[g] = array[i];
				g++;
			}
			if(v.length==1||v.length==0){
				return;
			}else{
			sort(v);}
		}
	}
	// System.out.println(x.toString());

}
