package _test;

import _algorithm.Array_Matrix_Algo;
import matrix.Array_Matrix;

public class Array_Matrix_Test {
    public static void main(String[] args) {
	Array_Matrix a=new Array_Matrix();
	Array_Matrix b=new Array_Matrix();
	Array_Matrix c=new Array_Matrix();
	int[][] target1={{3,0,5,8},{1,2,3,4},{2,3,4,5},{1,2,3,4}};
	int[][] target2={{3,4,5,8},{5,2,3,4},{2,6,4,5},{1,4,3,6}};
	int[][] target3={{3,4},{5,2}};
	
	a.data=target1;
	b.data=target2;
	c.data=target3;
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println("------------------------");
	System.out.println("Add a and b:");
	System.out.println(Array_Matrix_Algo.addMatrix(a, b));
	System.out.println("------------------------");
	System.out.println("Multify a and c:");
	System.out.println(Array_Matrix_Algo.multiMatrix(a, c));
	System.out.println("------------------------");	
	System.out.println("Transpose a and c:");
	System.out.println(Array_Matrix_Algo.transMatrix(a));
    }
}
