package demo_sort;

public class QuickSort1 {
	public static void main(String[] args) {
		int[] array = new int[] { 9, 5, 1, 3, 4 };
		// int temp=array[0];
		// for(int i=1;i<array.length;i++){
		// if(array[i]<temp){
		// int t=array[i];
		// array[i]=array[i-1];
		// array[i-1]=t;
		// }
		// }
		sort(array, 1, array.length);
		for (int a : array) {
			System.out.println(a);
		}
	}

	public static void sort(int[] a, int left, int right) {
		int temp = a[left - 1];
		while (left < right) {
			for (int i = left; i < right; i++) {
				if (a[left] < temp) {
					int t = a[left];
					a[left] = a[left - 1];
					a[left - 1] = t;
					left++;
				}
			}
			right--;
		}

		sort(a, left, right);
	}

}
