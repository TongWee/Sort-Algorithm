package heap;

import common.Common;

//i-->Parent		[(i - 1) / 2] 
//i-->LeftChild		[2i + 1] 
//i-->RightChild	[2i + 2]

public class Heap {
	private int[] list;
	private int len;

	public Heap(int a[]) {
		this.list = new int[a.length];
		this.len = a.length;
		for (int i = 0; i < a.length; i++) {
			this.add(a[i], i);
		}
	}

	public void add(int obj, int index) {
		int curIndex = index;
		list[curIndex] = obj;
		while (curIndex > 0) {
			int parentIndex = (curIndex - 1) / 2;
			if (list[curIndex] > list[parentIndex]) {
				int temp = list[curIndex];
				list[curIndex] = list[parentIndex];
				list[parentIndex] = temp;
			} else
				break;
			curIndex = parentIndex;
		}
	}

	public int remove() {
		if (list.length == 0)
			return -1;
		int removeNum = list[0];
		// Move the last element to top.
		list[0] = list[--len];
		list[len] = 0;
		int curIndex = 0;
		int leftIndex, rightIndex;
		while (curIndex < len) {
			leftIndex = 2 * curIndex + 1;
			rightIndex = 2 * curIndex + 2;
			// Only have two element, is a heap.
			if (leftIndex >= list.length)
				break;
			// Find maximum between two child.
			int maxIndex = leftIndex;
			if (rightIndex < list.length) {
				if (list[rightIndex] > list[leftIndex])
					maxIndex = rightIndex;
			}
			// If cur is smaller than maxIndex element, swap them.
			if (list[curIndex] < list[maxIndex]) {
				int temp = list[curIndex];
				list[curIndex] = list[maxIndex];
				list[maxIndex] = temp;
				curIndex = maxIndex;
			}
			// Else, is a heap.
			else
				break;
		}
		return removeNum;
	}

	public int getSize() {
		return list.length;
	}
}
