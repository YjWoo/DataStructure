package _algorithm;

import matrix.Array_Matrix;

public class Array_Matrix_Algo {

    /**
     * 矩阵转置
     * 
     * @param x目标矩阵
     * @return 转置后矩阵
     */
    public static Array_Matrix transMatrix(Array_Matrix x) {
	if (x.data == null) {
	    return null;
	}
	int[][] result = new int[x.data[0].length][x.data.length];

	for (int i = 0; i < x.data.length; i++) {
	    for (int j = 0; j < x.data[i].length; j++) {
		result[j][i] = x.data[i][j];
	    }
	}
	Array_Matrix y = new Array_Matrix();
	y.data = result;
	return y;
    }

    /**
     * 矩阵加法
     * 
     * @param x矩阵1
     * @param y矩阵2
     * @return 矩阵1+矩阵2
     */
    public static Array_Matrix addMatrix(Array_Matrix x, Array_Matrix y) {
	if (x.data[0].length == y.data[0].length && x.data.length == y.data.length) {

	    int m = x.data.length;
	    int n = x.data[0].length;
	    Array_Matrix result = new Array_Matrix();
	    result.data = new int[m][n];
	    for (int i = 0; i < m; i++) {
		for (int j = 0; j < n; j++) {
		    result.data[i][j] = x.data[i][j] + y.data[i][j];
		}
	    }
	    return result;
	}
	return null;
    }

    /**
     * 矩阵乘法
     * 
     * @param x矩阵1
     * @param y矩阵2
     * @return 矩阵1*矩阵2
     */
    public static Array_Matrix multiMatrix(Array_Matrix x, Array_Matrix y) {

	int m = x.data.length;
	int n = y.data[0].length;
	
	Array_Matrix result = new Array_Matrix();
	result.data = new int[m][n];
	
	for (int i = 0; i < m; i++) {
	    for (int j = 0; j < n; j++) {
		result.data[i][j]=0;
		for (int j2 = 0; j2 < y.data.length; j2++) {
		    result.data[i][j]+=x.data[i][j2]*y.data[j2][j];
		}
	    }
	}
	return result;
    }
}
