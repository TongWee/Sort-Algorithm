package bucket;

import common.Common;

public class BucketSort {
	public static void bucketSort(int[] a) {
		int len = a.length;
		int[] count = new int[10];
		int[][] bucket = new int[10][a.length];
		for (int i = 0; i < len; i++) {
			int temp = a[i];
			int flag = a[i] / 10;
			bucket[flag][count[flag]] = temp;
			int j = count[flag]++;
			for (; j > 0 && temp < bucket[flag][j - 1]; --j) {
				bucket[flag][j] = bucket[flag][j - 1];
			}
			bucket[flag][j] = temp;
		}
		int k = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < count[i]; j++) {
				a[k++] = bucket[i][j];
			}
		}
	}

	public static void main(String[] args) {
		int[] data = Common.getData();
		Common.printList(data);
		bucketSort(data);
		Common.printList(data);
	}

}
