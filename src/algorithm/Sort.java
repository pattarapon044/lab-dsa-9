package algorithm;

public class Sort {
	
	public static void print(int[] data) {
		String format = "[";
		for (int i : data) {
			if (i == data[data.length-1])
				format += i + "]";
			else
				format += i + ", ";
		}
		System.out.println(format);
	}
	
	private static void swap(int[] data, int i, int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
	
	public static void bubbleSort(int[] data) {
		int n = data.length;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n-i); j++) {
				if (data[j-1] > data[j]) {
					// Swap
					swap(data, j, j-1);
				}
			}
		}
	}
	
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
	
	public static void quickSort(int[] data, int low, int high) {
		if (low < high)
	    {
	        int pi = qSortPartition(data, low, high);
	        quickSort(data, low, pi - 1);
	        quickSort(data, pi + 1, high);
	    }
	}
	
	private static int qSortPartition(int[] data, int low, int high) {
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
	
	public static void selectionSort(int[] data) {
		int n = data.length;

		for (int i = 0; i < n - 1; i++) {
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (data[j] < data[min_idx])
					min_idx = j;
			swap(data, i, min_idx);
		}
	}
	
	private static void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
  
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
  
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
  
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
  
    public static void mergeSort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;
  
            // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
  
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
}
