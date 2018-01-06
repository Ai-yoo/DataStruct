package demo_sort;

public class QS {

	public static void main(String[] args) {
		int[] array = new int[] { 2, 4, 1, 9, 6 };
		sort(array,0,array.length-1);
		for(int i:array){
			System.out.println(i);
		}

	}
	public static void sort(int[] a,int low,int hight) {
		if(low>=hight){
			return;
		}
		int mid=part(a,low,hight);
		sort(a,low,mid-1);
		sort(a,mid+1,hight);
	}

	public static int part(int[] a, int low, int hight) {
		int key = a[low];
		while (low < hight) {
			while (a[hight] >= key && low < hight) {
				hight--;
			}
			a[low] = a[hight];
			while (a[low] <= key && low < hight) {
				low++;
			}
			a[hight] = a[low];	
		}
		a[hight]=key;
		return hight;
	}
}
