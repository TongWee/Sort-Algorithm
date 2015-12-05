package counting;

import common.Common;

public class CountingSort {

	public static void countingSort(int[] a) {
		int min = a[0], max = a[0];
		for (int e : a) {
			if (min > e)
				min = e;
			if (max < e)
				max = e;
		}
		int len = max - min;
		int[] countArr = new int[len + 1];
		for (int i = 0; i < a.length; i++) {
			countArr[a[i] - min]++;
		}
		int k = 0;
		for (int i = 0; i < countArr.length && k < a.length; i++) {
			if (countArr[i] != 0) {
				for (int j = 0; j < countArr[i]; j++) {
					a[k++] = i + min;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] data = Common.getData();
		Common.printList(data);
		countingSort(data);
		Common.printList(data);
	}

}
