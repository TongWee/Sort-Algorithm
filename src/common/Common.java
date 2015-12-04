package common;

public class Common {

	public Common() {

	}

	private static int[] data = { 72, 38, 65, 97, 76, 13, 27, 49 };

	public static int[] getData() {
		return data;
	}

	public static <E extends Comparable<E>> void swap(E o1, E o2) {
		if (o1.compareTo(o2) > 0) {
			E temp = o1;
			o1 = o2;
			o2 = temp;
		}
	}

	public static <E extends Comparable<E>> void printList(E[] list) {
		for (E element : list)
			System.out.print(element + " ");
		System.out.println();
	}

	public static void printList(int[] list) {
		for (int i : list)
			System.out.print(i + " ");
		System.out.println();
	}
}
