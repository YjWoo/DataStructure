package _algorithm;

/**
 * 排序算法
 * 
 * @author YjWoo
 *
 */
public class _Sort {
    /**
     * 直接插入排序
     * 时间复杂度O(n2)
     * @param R
     */
    public static void insertSort(int R[]) {
	int temp=0;
	int j;
	for (int i = 1; i < R.length; i++) {
	    temp = R[i];
	    j=i-1;
	    while (j>=0&&temp<R[j]) {
		R[j+1]=R[j];
		--j;
	    }
	    R[j+1]=temp;
	}
    }
}
