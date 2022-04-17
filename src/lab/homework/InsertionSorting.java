package lab.homework;

public class InsertionSorting {
	// print() method
	private static void print(int[] a) {
		System.out.print("[");
		for (int i : a) {
			System.out.print(i);
			if (i == a[a.length - 1])
				break;
			System.out.print(", ");
		}
		System.out.println("]");
	}

	// swap() method
	private static void swap(int[] data, int i, int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}

	// bubbleSort() method
	public static void insertionSort(int[] data) {
		int n = data.length;
		
		for (int i = 1; i < n; ++i) {
			int before_idx = i-1;
			int key = data[i];
			
			while (before_idx >= 0 && key < data[before_idx]) {
				swap(data, before_idx, before_idx+1);
				before_idx--;
			}
			data[before_idx+1] = key;
		}
	}

	public static void main(String[] args) {
		int[] a = { 77, 44, 99, 66, 33, 55, 88, 22 };
		System.out.println("Insertion Sort");
		print(a);
		insertionSort(a);
		print(a);
	}

}
