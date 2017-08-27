package _test;

import _algorithm.Adjacency_Matrix_Algo;
import graph.Adjacency_Matrix;

public class Adjacency_Matrix_Test {
    public static void main(String[] args) {
	int[][] edges = { { Integer.MAX_VALUE, 1, 9, 1, 9 }, { 9, Integer.MAX_VALUE, 1, 1, 9 },
		{ 9, 9, Integer.MAX_VALUE, 1, 9 }, { 9, 1, 9, Integer.MAX_VALUE, 1 },
		{ 9, 1, 9, 9, Integer.MAX_VALUE } };
	Adjacency_Matrix aMatrix = new Adjacency_Matrix(edges);
	System.out.println(aMatrix);

	System.out.println(Adjacency_Matrix_Algo.Prim(aMatrix, 2));

	Adjacency_Matrix_Algo.Dijkstra(aMatrix, 2);
    }

}
