package selection;

import common.Common;

public class SelectionSort {

	public static void selectionSort(int[] list) {
		int min, min_index = 0;
		int i, j;
		for (i = 1; i < list.length; i++) {
			min = list[i - 1];
			for (j = i; j < list.length; j++) {
				if (min > list[j]) {
					min = list[j];
					min_index = j;
				}
			}
			if (min != list[i - 1]) {
				int temp = list[i - 1];
				list[i - 1] = min;
				list[min_index] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int[] data = Common.getData();
		selectionSort(data);
		Common.printList(data);
	}
}
