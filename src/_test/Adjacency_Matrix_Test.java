package _test;

import _algorithm.Adjacency_Matrix_Algo;
import graph.Adjacency_Matrix;

public class Adjacency_Matrix_Test {
    public static void main(String[] args) {
	int[][] edges = { { 9, 1, 9, 9, 9 }, { 9, 9, 1, 9, 9 }, { 9, 9, 9, 1, 9 }, { 9, 9, 9, 9, 1 },
		{ 9, 9, 9, 9, 9 } };
	Adjacency_Matrix aMatrix = new Adjacency_Matrix(edges);
	System.out.println(aMatrix);

	System.out.println(Adjacency_Matrix_Algo.Prim(aMatrix, 0));
    }

}
