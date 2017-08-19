package _algorithm;

import stack.Linked_Stack;

public class Linked_Stack_Algo {
    /**
     * 栈初始化
     * @param ls目标栈
     */
    public static void initStack(Linked_Stack ls) {
	ls.next = null;
    }
    /**
     * 判断栈空
     * @param ls目标栈
     * @return
     */
    public static boolean isEmpty(Linked_Stack ls) {
	if (ls.next==null) {
	    return false;
	}
	return true;
    }
    /**
     * 入栈
     * @param ls目标栈
     * @param x入栈值
     * @return
     */
    public static <T> boolean Push(Linked_Stack ls,T x) {
	Linked_Stack node=new Linked_Stack();
	initStack(node);
	node.data=x;
	node.next=ls.next;
	ls.next=node;
	return true;
    }
    /**
     * 出栈
     * @param ls目标栈
     * @return 出栈值
     */
    public static <T> T Pop(Linked_Stack ls) {
	if (ls.next!=null) {
	    @SuppressWarnings("unchecked")
	    T t=(T)ls.next.data;
	    ls.next=ls.next.next;
	    return t;
	}
	return null;
    }
}
