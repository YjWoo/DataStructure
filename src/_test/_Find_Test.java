package _test;

import _algorithm._Find_Algo;
import _algorithm._Sort_Algo;

public class _Find_Test {
    public static void main(String[] args) {
	int[] aa = { 323, 42, 64, 22, 4, 65, 2 };

	_Sort_Algo.insertSort(aa);

	for (int i = 0; i < aa.length; i++) {
	    System.out.print(aa[i] + " ");
	}
	System.out.println();
	System.out.println(_Find_Algo.search(aa, 4));
	System.out.println(_Find_Algo.bSearch(aa, 4));
    }
}
