package bubble;

import common.Common;

public class TwoBubbleSort {
	public static void twoBubbleSort(int[] list) {
		int i, j, k;
		int left = 0, right = list.length - 1;
		boolean needNext = false;
		for (i = 1; i < list.length; i++) {
			needNext = false;
			for (j = left; j < list.length - i; j++) {
				if (list[j] > list[j + 1]) {
					int temp = list[j + 1];
					list[j + 1] = list[j];
					list[j] = temp;
					needNext = true;
				}
				right--;
			}
			if (!needNext)
				return;
			for (k = right; k >= i; k--) {
				if (list[k] < list[k - 1]) {
					int temp = list[k];
					list[k] = list[k - 1];
					list[k - 1] = temp;
					needNext = true;
				}
				left++;
			}
			if (!needNext)
				return;
		}
	}

	public static void main(String[] args) {
		int[] data = Common.getData();
		Common.printList(data);
		twoBubbleSort(data);
		Common.printList(data);
	}
}
