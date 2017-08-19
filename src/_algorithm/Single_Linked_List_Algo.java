package _algorithm;

import linear_list.Single_Linked_List;

public class Single_Linked_List_Algo {

    /**
     * 尾插法建单链表
     * 
     * @param l
     * @param a
     * @param n
     * @return 已创建单链表
     */
    public static Single_Linked_List createList(int a[], int n) {
	if (n > a.length)
	    return null;
	Single_Linked_List r = new Single_Linked_List();// r终端节点
	Single_Linked_List list = new Single_Linked_List();
	for (int i = 0; i < n; i++) {
	    Single_Linked_List s = new Single_Linked_List();// s新节点
	    s.data = a[i];
	    r.next = s;
	    r = r.next;
	    if (i == 0)
		list = r;
	}
	r.next = null;
	return list;
    }

    /**
     * 查找单链表节点
     * 
     * @param l目标单链表
     * @param x查找值
     * @return 查找结果
     */
    public static Single_Linked_List findNode(Single_Linked_List l, int x) {
	Single_Linked_List list = new Single_Linked_List();
	list = l;
	while (list != null) {
	    if (list.data == x)
		return list;
	    list = list.next;
	}
	return null;
    }

    /**
     * 删除所有值为x的单链表节点
     * 
     * @param l目标单链表
     * @param x删除值
     */
    public static void removeNode(Single_Linked_List l, int x) {
	Single_Linked_List list = new Single_Linked_List();
	list = l;
	if (list.data == x) {
	    list = list.next;
	} else {
	    while (list != null) {
		if (list.next != null && list.next.data == x) {
		    list.next = list.next.next;
		    list = list.next;
		} else {
		    list = list.next;
		}
	    }
	}
    }
}
