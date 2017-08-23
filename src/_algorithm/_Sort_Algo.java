package _algorithm;

/**
 * 排序算法
 * 
 * @author YjWoo
 *
 */
public class _Sort_Algo {
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
     * 
     * @param R目标数组
     */
    public static void selectSort(int[] R) {
	int k, temp;
	for (int i = 0; i < R.length; i++) {
	    k = i;
	    for (int j = i + 1; j < R.length; j++) {
		if (R[k] > R[j]) {
		    k = j;
		}
	    }
	    temp = R[i];
	    R[i] = R[k];
	    R[k] = temp;
	}
    }

    /**
     * 调顶堆
     * 
     * @param R
     * @param low
     * @param high
     */
    private static void Sift(int[] R, int low, int high) {
	int i = low;
	int j = 2 * i;
	if (i == 0)
	    j = 1;
	int temp = R[i];
	while (j <= high - 1) {
	    // 比较左右节点
	    if (j < high - 1 && R[j] < R[j + 1])
		++j;
	    if (temp < R[j]) {
		R[i] = R[j];
		i = j;
		j = 2 * i;
	    } else {
		break;
	    }
	}
	R[i] = temp;
    }

    /**
     * 堆排序 时间复杂度O(n*log2n)
     * 
     * @param R
     */
    public static void heapSort(int[] R) {
	int temp;
	// 建立初始堆
	for (int i = (R.length - 1) / 2; i >= 0; i--) {
	    Sift(R, i, R.length - 1);
	}
	for (int i = R.length - 1; i >= 0; i--) {
	    temp = R[0];
	    R[0] = R[i];
	    R[i] = temp;
	    Sift(R, 0, i);
	}
    }

}
