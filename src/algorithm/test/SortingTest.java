package algorithm.test;
import java.util.Random;

import org.junit.jupiter.api.Test;

import algorithm.Sort;

class SortingTest {
	
	long startTime;
	long endTime;
	
	
	final int MAX = 100000;
	int[] data;
	{
		Random rand = new Random();
		data = new int[MAX];
		for (int j = 0; j < MAX; j++) {
			data[j] = rand.nextInt(MAX) + 1;
		}
	}

	@Test
	void testQuickSort() {
		Sort.quickSort(data, 0, data.length-1);
	}
	
	@Test
	void testBubbleSort() {
		Sort.bubbleSort(data);
	}
	
	@Test
	void testInsertionSort() {
		Sort.insertionSort(data);
	}
	
	@Test
	void testSelectionSort() {
		Sort.selectionSort(data);
	}
	
	@Test 
	void testMergeSort(){
		Sort.mergeSort(data, 0, data.length-1);
	}

}
