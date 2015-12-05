package radix;

import common.Common;

public class RadixSort {

	public static void radixSort(int[] a) {
		int[][] temp = new int[10][10];
		int[] order = new int[10];
		int n = 1;
		while (n <= 10) {
			for (int i = 0; i < a.length; i++) {
				int lsd = (a[i] / n) % 10;
				temp[lsd][order[lsd]++] = a[i];
			}

			int m = 0;
			for (int j = 0; j < 10; j++) {
				if (order[j] != 0) {
					for (int k = 0; k < order[j]; k++) {
						a[m++] = temp[j][k];
					}
				}
				order[j] = 0;
			}
			n *= 10;
		}
	}

	public static void main(String[] args) {
		int[] list = Common.getData();
		Common.printList(list);
		radixSort(list);
		Common.printList(list);
	}
}
