package bubble;

import common.Common;

public class BubbleSort {

	public static void bubbleSort(Integer[] list) {
		boolean needNext = false;
		for (int i = 1; i < list.length; i++) {
			needNext = false;
			for (int j = 0; j < list.length - i; j++) {
				if (list[j] > list[j + 1]) {
					int temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
					needNext = true;
				}
			}
			if (!needNext) {
				return;
			}
		}
	}

	public static void main(String[] args) {
		Integer[] list = { 1, 2, 3, 5, -1, 0, 10, 4 };
		bubbleSort(list);
		Common.printList(list);
	}
}
