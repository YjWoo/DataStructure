package _algorithm;

/**
 * 查找算法
 * 
 * @author YjWoo
 *
 */
public class _Find_Algo {
    /**
     * 顺序查找法
     * 
     * @param R目标数组
     * @param x查找值
     * @return 查找位置，查找失败返回-1
     */
    public static int search(int[] R, int x) {
	for (int i = 0; i < R.length; i++) {
	    if (R[i] == x)
		return i;
	}
	return -1;
    }

    /**
     * 折半查找法
     * 
     * @param R目标数组
     * @param x查找值
     * @param low
     * @param high
     * @return 查找位置，查找失败返回-1
     */
    public static int bSearch(int[] R, int x, int low, int high) {
	int mid;
	while (low <= high) {
	    mid = (low + high) / 2;
	    if (R[mid] == x)
		return mid;
	    else if (R[mid] > x)
		high = mid - 1;
	    else
		low = mid + 1;
	}
	return -1;
    }

    public static int bSearch(int[] R, int x) {
	return bSearch(R, x, 0, R.length - 1);
    }
    
}
