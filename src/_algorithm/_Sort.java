package _algorithm;

/**
 * 排序算法
 * 
 * @author YjWoo
 *
 */
public class _Sort {
    /**
     * 直接插入排序 时间复杂度O(n2)
     * 
     * @param R目标数组
     */
    public static void insertSort(int R[]) {
	int temp = 0;
	int j;
	for (int i = 1; i < R.length; i++) {
	    temp = R[i];
	    j = i - 1;
	    while (j >= 0 && temp < R[j]) {
		R[j + 1] = R[j];
		--j;
	    }
	    R[j + 1] = temp;
	}
    }

    /**
     * 冒泡法排序 时间复杂度O(n2)
     * 
     * @param R目标数组
     */
    public static void bubbleSort(int R[]) {
	int temp;
	if (R.length <= 1) {
	    return;
	}
	for (int i = R.length - 1; i >= 0; i--) {
	    for (int j = 0; j < i; j++) {
		if (R[j] > R[i]) {
		    temp = R[j];
		    R[j] = R[i];
		    R[i] = temp;
		}
	    }
	}
    }

    /**
     * 快速排序 时间复杂度O(n*log2n)
     * 
     * @param R目标数组
     * @param l左枢轴
     * @param r右枢轴
     */
    public static void quickSort(int[] R, int l, int r) {
	int temp;
	int i = l, j = r;
	if (l < r) {
	    temp = R[l];
	    while (i != j) {
		while (j > i && R[j] > temp)
		    j--;
		if (i < j) {
		    R[i] = R[j];
		    i++;
		}
		while (j > i && R[i] < temp)
		    i++;
		if (i < j) {
		    R[j] = R[i];
		    j--;
		}
		R[i] = temp;
		quickSort(R, l, i - 1);
		quickSort(R, i + 1, r);
	    }
	}
    }
    /**
     * 简单选择排序 时间复杂度O(n2)
     * @param R目标数组
     */
    public static void selectSort(int[] R) {
	int k,temp;
	for (int i = 0; i < R.length; i++) {
	    k=i;
	    for (int j = i+1; j < R.length; j++) {
		if (R[k]>R[j]) {
		    k=j;
		}
	    }
	    temp=R[i];
	    R[i]=R[k];
	    R[k]=temp;
	}
    }
}
