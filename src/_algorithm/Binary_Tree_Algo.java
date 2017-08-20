package _algorithm;

import queue.Seq_Queue;
import tree.Binary_Tree;

public class Binary_Tree_Algo {
    /**
     * 获取二叉树深度
     * 
     * @param node二叉树根节点
     * @return 深度值
     */
    public static int getDepth(Binary_Tree node) {
	int lnode, rnode;
	if (node == null) {
	    return 0;
	} else {
	    lnode = getDepth(node.lchild);
	    rnode = getDepth(node.rchild);
	    return (lnode > rnode ? lnode : rnode) + 1;
	}
    }
    /**
     * 根据给定数组生成完全二叉树
     * @param target目标数组
     * @return 完全二叉树
     */
    public static Binary_Tree genTree(Object[] target) {
	Binary_Tree node = new Binary_Tree();
	int n = 0;

	node.data = target[0];
	Seq_Queue sq = new Seq_Queue();
	Seq_Queue_Algo.initQueue(sq);
	Seq_Queue_Algo.enQueue(sq, node);

	while (n < target.length && !Seq_Queue_Algo.isEmpty(sq)) {
	    System.out.println("n=" + n);
	    Binary_Tree q = (Binary_Tree) Seq_Queue_Algo.deQueue(sq);
	    System.out.println("q:" + q.data);

	    if (2 * n + 1 < target.length) {
		Binary_Tree p = new Binary_Tree();
		p.data = target[2 * n + 1];
		q.lchild = p;
		Seq_Queue_Algo.enQueue(sq, p);
	    }
	    if (2 * n + 2 < target.length) {
		Binary_Tree p = new Binary_Tree();
		p.data = target[2 * n + 2];
		q.rchild = p;
		Seq_Queue_Algo.enQueue(sq, p);
	    }

	    n++;
	}
	return node;
    }
    /**
     * 先序遍历：根--->左--->右
     * @param node目标二叉树根节点
     */
    public static void preOrder(Binary_Tree node) {
	if (node!=null) {
	    System.out.print(node.data.toString()+" → ");
	    preOrder(node.lchild);
	    preOrder(node.rchild);
	}
    }
    
    /**
     * 中序遍历：左--->根--->右
     * @param node目标二叉树根节点
     */
    public static void inOrder(Binary_Tree node) {
	if (node!=null) {
	    inOrder(node.lchild);
	    System.out.print(node.data.toString()+" → ");
	    inOrder(node.rchild);
	}
    }
    
    /**
     * 后序遍历：左--->右--->根
     * @param node目标二叉树根节点
     */
    public static void postOrder(Binary_Tree node) {
	if (node!=null) {
	    postOrder(node.lchild);
	    postOrder(node.rchild);
	    System.out.print(node.data.toString()+" → ");
	}
    }
    
}
