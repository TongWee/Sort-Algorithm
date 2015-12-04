package insertion;

import common.Common;

public class InsertionSortBinary {
	public static void insertionSortBinary(int[] list) {
		int key, left, right, mid;
		for (int i = 1; i < list.length; i++) {
			key = list[i];
			left = 0;
			right = i - 1;
			while (left <= right) {
				mid = (left + right) / 2;
				if (key > list[mid])
					left = mid + 1;
				else
					right = mid - 1;
			}
			for (int j = i - 1; j >= left; j--) {
				list[j + 1] = list[j];
			}
			list[left] = key;
		}
	}

	public static void main(String[] args) {
		int[] data = Common.getData();
		insertionSortBinary(data);
		Common.printList(data);
	}

}
