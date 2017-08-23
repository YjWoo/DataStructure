package _test;

import _algorithm._Sort_Algo;

public class _Sort_Test {
    public static void main(String[] args) {
	int[] aa = { 2, 34, 4, 323, 7, 232, 42 };

	// _Sort.insertSort(aa);
	// _Sort.bubbleSort(aa);
	// _Sort.quickSort(aa, 0, aa.length-1);
	//_Sort.selectSort(aa);
	_Sort_Algo.heapSort(aa);

	for (int i = 0; i < aa.length; i++) {
	    System.out.print(aa[i] + " ");
	}
    }
}
