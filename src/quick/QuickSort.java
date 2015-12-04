package quick;

import common.Common;

public class QuickSort {
	public static int quickPos(int[] list, int left, int right) {
		int pivot = list[left];
		int low = left;
		int high = right;
		while (low < high) {
			while (low < high && list[high] >= pivot)
				high--;
			if (pivot > list[high]) {
				list[low] = list[high];
				low++;
			}
			while (low < high && list[low] < pivot)
				low++;
			if (low < high) {
				list[high] = list[low];
				high--;
			}
		}
		list[low] = pivot;
		Common.printList(list);
		return low;
	}

	public static void quickSort(int[] list) {
		quickSort(list, 0, list.length - 1);
	}

	public static void quickSort(int[] list, int low, int high) {
		if (low < high) {
			int pos = quickPos(list, low, high);
			quickSort(list, low, pos - 1);
			quickSort(list, pos + 1, high);
		}
	}

	public static void main(String[] args) {
		int[] data = Common.getData();
		quickSort(data);
		Common.printList(data);
	}
}
