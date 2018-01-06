package demo_sort;

public class InsertSort {
	public static void main(String[] args) {
		int array[]=new int[]{9,6,2,4,3,2};
		int lenth=array.length;
		for(int i=1;i<lenth;i++){
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
		for(int a:array){
			System.out.println(a);
		}
	}

}
