package _test;

import _algorithm._Sort;

public class _Sort_Test {
    public static void main(String[] args) {
	int[] aa = { 2, 34, 4, 323, 7, 232, 42 };

	_Sort.insertSort(aa);
	
	for (int i = 0; i < aa.length; i++) {
	    System.out.print(aa[i]+" ");
	}
    }
}
