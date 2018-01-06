package demo_sort;

import java.util.Random;

public class QuickSort {
	public static void main(String[] args) {
		Random r=new Random();
		int a[]=new int[10000];
		for(int i=0;i<10000;i++){
			a[i]=r.nextInt(10000);
		}
		long begin=System.currentTimeMillis();
		sort(a,0,a.length-1);
		long end=System.currentTimeMillis();
		System.out.println(end-begin);
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
	}

	public static void sort(int[] a, int low, int hight) {
		int i, j, index;
		if (low > hight) {
			return;
		}
		i = low;
		j = hight;
		index = a[i];
		while (i < j) {
			while (i < j && a[j] >= index) {
				j--;
			}
			if (i < j) {
				a[i++] = a[j];
			}

			while (i < j && a[i] < index) {
				i++;
			}
			if (i < j) {
				a[j--] = a[i];
			}

		}
		a[i] = index;
		sort(a, low, i - 1);
		sort(a, i + 1, hight);
	}

}
