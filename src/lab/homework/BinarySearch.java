package lab.homework;

public class BinarySearch {

	public static void main(String[] args) {

		int[] data = { 2, 4, 5, 7, 8, 9, 12, 14, 17, 19, 22, 25, 27, 28, 33, 37 };
		// searching value
		int value = 22;

		// searching
		int position = search(data, value);

		if (position == -1)
			System.out.println("Cannot found " + value);
		else
			System.out.println("found " + value + " at " + position);

	}

	public static int search(int[] data, int value) {

		int first = 0, last = data.length;

		while (true) {

			if (first > last)
				return -1;

			int mid = first + (last - first) / 2;

			if (value < data[mid])
				last = mid - 1;
			if (value > data[mid])
				first = mid + 1;
			if (value == data[mid])
				return mid;
		}

	}
}
