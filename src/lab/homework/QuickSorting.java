package lab.homework;

public class QuickSorting {

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

	public static void quickSort(int[] data, int low, int high) {
		 if (low < high)
		    {
		        int pi = partition(data, low, high);
		        quickSort(data, low, pi - 1);
		        quickSort(data, pi + 1, high);
		    }
	}

	private static int partition(int[] data, int low, int high) {
	    int pivot = data[high];
	     
	    int i = (low - 1);
	 
	    for(int j = low; j <= high - 1; j++)
	    {
	        if (data[j] < pivot)
	        {
	            i++;
	            swap(data, i, j);
	        }
	    }
	    swap(data, i + 1, high);
	    return (i + 1);

	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}

	public static void main(String[] args) {
		int[] data = { 77, 44, 99, 66, 33, 55, 88, 22 };
		System.out.println("Quick Sort");
		print(data);
		quickSort(data, 0, data.length - 1);
		print(data);
	}
}
