package insertion;

import common.Common;

public class InsertionSort {	
	public static void insertionSort(int[] list){
		int i, j;
		int temp;
		for(i = 1; i < list.length; i++){
			temp = list[i];
			j = i - 1;
			while(j >= 0 && list[j] > temp){
				list[j + 1] = list[j];
				j--;
			}
			list[j + 1] = temp;
		}
	}
	public static void main(String[] args) {
		int[] data = new Common().getData();
		insertionSort(data);
		Common.printList(data);
	}
}
