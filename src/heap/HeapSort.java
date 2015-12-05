package heap;

import common.Common;

public class HeapSort {
	public static void heapSort(int a[]) {
		Heap heap = new Heap(a);
		for (int i = a.length - 1; i >= 0; i--) {
			a[i] = heap.remove();
		}
	}

	public static void main(String[] args) {
		int[] data = Common.getData();
		Common.printList(data);
		heapSort(data);
		Common.printList(data);
	}
}
