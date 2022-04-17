package algorithm;

public class Search {

	public static int linearSearch(int[] data, int value) {
		for (int i = 0; i < data.length; i++)
			if (data[i] == value)
				return i;
		return -1;
	}

	public static int binarySearch(int[] data, int value) {

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
