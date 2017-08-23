package _algorithm;

import tree.Binary_Tree;

public class Binary_Sort_Tree_Algo {
    /**
     * 插入关键字
     * 
     * @param bt二叉树节点
     * @param key插入值
     * @return 插入是否成功
     */
    public static Binary_Tree insertBST(Binary_Tree bt, int key) {
	if (bt == null) {
	    bt = new Binary_Tree();
	    bt.data = key;
	    return bt;
	} else {
	    if (key <= (int) bt.data) {
		bt.lchild = insertBST(bt.lchild, key);
	    } else {
		bt.rchild = insertBST(bt.rchild, key);
	    }
	    return bt;
	}
    }

    /**
     * 生成二叉排序树
     * 
     * @param bt二叉树节点
     * @param key创建数组
     */
    public static Binary_Tree createBST(int key[]) {
	Binary_Tree result = new Binary_Tree();
	result.data = key[0];
	for (int i = 1; i < key.length; i++) {
	    result = insertBST(result, key[i]);
	}
	return result;
    }

    /**
     * 查找关键字
     * 
     * @param bt二叉树节点
     * @param key查找值
     * @return 二叉树节点
     */
    public static Binary_Tree searchBST(Binary_Tree bt, int key) {
	if (bt == null) {
	    return null;
	} else {
	    if ((int) bt.data == key) {
		return bt;
	    } else if (key < (int) bt.data) {
		return searchBST(bt.lchild, key);
	    } else {
		return searchBST(bt.rchild, key);
	    }
	}
    }
}
