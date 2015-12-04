package merge;

/**
 * �鲢���� �������������Ϊ���룬��ÿ���ֽ��й鲢�����������ֶ��ź���󣬶����ǽ��й鲢�� ʱ�临�Ӷȣ�T(n) = nLogn
 * 
 * @author Tong
 * 
 */
public class MergeSort {
	public static int[] merge(int[] fir, int[] sec) {
		int i = 0;
		int j = 0;
		int k = 0;
		int[] temp = new int[fir.length + sec.length];
		while (i < fir.length && j < sec.length) {
			if (fir[i] < sec[j]) {
				temp[k++] = fir[i++];
			} else {
				temp[k++] = sec[j++];
			}
		}
		while (i < fir.length) {
			temp[k++] = fir[i++];
		}
		while (j < sec.length) {
			temp[k++] = sec[j++];
		}

		return temp;
	};

	public static void mergeSort(int[] a) {
		if (a.length > 1) {
			int mid = a.length / 2;
			int[] firstHalf = new int[mid];
			System.arraycopy(a, 0, firstHalf, 0, firstHalf.length);
			mergeSort(firstHalf);

			int[] secondHalf = new int[a.length - mid];
			System.arraycopy(a, mid, secondHalf, 0, secondHalf.length);
			mergeSort(secondHalf);

			int[] temp = merge(firstHalf, secondHalf);
			System.arraycopy(temp, 0, a, 0, temp.length);
		}
	};

	public static void main(String[] args) {
		int[] list = { 3, 1, 4, 5, 10, -1, 0, 9 };
		mergeSort(list);
		for (int e : list) {
			System.out.print(e + " ");
		}
	}

}
