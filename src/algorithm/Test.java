package algorithm;

import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		int[] data = { 77, 44, 99, 66, 33, 55, 88, 22 };
		int[] temp;
		
		temp = Arrays.copyOf(data, data.length);
		Sort.quickSort(temp, 0, temp.length-1);
		Sort.print(temp);
		
		temp = Arrays.copyOf(data, data.length);
		Sort.insertionSort(temp);
		Sort.print(temp);
		
		temp = Arrays.copyOf(data, data.length);
		Sort.selectionSort(temp);
		Sort.print(temp);
		
		temp = Arrays.copyOf(data, data.length);
		Sort.bubbleSort(temp);
		Sort.print(temp);
		
		temp = Arrays.copyOf(data, data.length);
		Sort.mergeSort(temp, 0, temp.length-1);
		Sort.print(temp);
	}

}
