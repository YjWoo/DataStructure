package _test;

import _algorithm.Binary_Tree_Algo;
import tree.Binary_Tree;

public class Binary_Tree_Test {
    public static void main(String[] args) {
	Object[] array={2,3,4,5,6,8,9,10};
	Binary_Tree tree=new Binary_Tree();
	
	tree=Binary_Tree_Algo.genTree(array);
	System.out.println("--------------");
	System.out.println(tree);
	System.out.println(Binary_Tree_Algo.getDepth(tree));
	
	System.out.println("--------------");
	Binary_Tree_Algo.preOrder(tree);
	System.out.println();
	Binary_Tree_Algo.inOrder(tree);
	System.out.println();
	Binary_Tree_Algo.postOrder(tree);
    }
}
