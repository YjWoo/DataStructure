package algorithm;

import linear_list.Single_linked_list;

public class Single_linked_list_algo {

    /**
     * 尾插法建单链表
     * 
     * @param l
     * @param a
     * @param n
     * @return 已创建单链表
     */
    public Single_linked_list createList(int a[], int n) {
	if (n > a.length)
	    return null;
	Single_linked_list r = new Single_linked_list();// r终端节点
	Single_linked_list list = new Single_linked_list();
	for (int i = 0; i < n; i++) {
	    Single_linked_list s = new Single_linked_list();// s新节点
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
    public Single_linked_list findNode(Single_linked_list l, int x) {
	Single_linked_list list = new Single_linked_list();
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
    public void removeNode(Single_linked_list l, int x) {
	Single_linked_list list = new Single_linked_list();
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
