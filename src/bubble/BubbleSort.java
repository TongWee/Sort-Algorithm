package bubble;

import common.Common;

/**
 * 冒泡排序 描述：多次遍历，在每次遍历中，比较相邻元素，较大的值像气泡一样逐渐浮到顶部，整个过程持续，直到有序。 时间复杂度：T(n) = n^2;
 * 
 * @author Tong
 * 
 */
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
			System.out.print("第" + i + "次遍历: ");
			Common.printList(list);
			if (!needNext) {
				return;
			}
		}
	}

	public static void main(String[] args) {
		Integer[] list = { 1, 2, 3, 5, -1, 0, 10, 4 };
		bubbleSort(list);
	}
}
