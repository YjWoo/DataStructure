package _test;

import _algorithm.Binary_Sort_Tree_Algo;
import _algorithm.Binary_Tree_Algo;
import tree.Binary_Tree;

public class Binary_Sort_Tree_Test {
    public static void main(String[] args) {
	Binary_Tree tree = new Binary_Tree();
	int[] a = { 81, 45, 76, 5, 415, 87, 66, 775, 345 };

	tree = Binary_Sort_Tree_Algo.createBST(a);

	System.out.println(tree);

	Binary_Tree_Algo.preOrder(tree);
	System.out.println();
	Binary_Tree_Algo.inOrder(tree);
	System.out.println();
	Binary_Tree_Algo.postOrder(tree);
    }
}
