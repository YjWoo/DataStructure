package algorithm;

import queue.Linked_Queue;
import queue.Linked_Queue_Node;

public class Linked_Queue_Algo {

    /**
     * 链队初始化
     * 
     * @param lq目标队列
     */
    public static void initQueue(Linked_Queue lq) {
	lq.front = lq.rear = null;
    }

    /**
     * 判断队空
     * 
     * @param lq目标队列
     * @return
     */
    public static boolean isEmpty(Linked_Queue lq) {
	if (lq.rear == null || lq.rear == null) {
	    return true;
	}
	return false;
    }

    /**
     * 入队
     * 
     * @param lq目标队列
     * @param t入队值
     */
    public static <T> void enQueue(Linked_Queue lq, T t) {
	Linked_Queue_Node node = new Linked_Queue_Node();
	node.data = t;
	node.next = null;
	if (lq.rear == null) {
	    lq.front = lq.rear = node;
	} else {
	    lq.rear.next = node;
	    lq.rear = node;
	}
    }

    /**
     * 出队
     * 
     * @param lq目标队列
     * @return 出队值
     */
    @SuppressWarnings("unchecked")
    public static <T> T deQueue(Linked_Queue lq) {
	Linked_Queue_Node node = new Linked_Queue_Node();
	if (lq.rear == null) {
	    return null;
	} else {
	    node = lq.front;
	}
	if (lq.rear == lq.front) {
	    lq.rear = lq.front = null;
	} else {
	    lq.front = lq.front.next;
	}
	return (T) node.data;
    }
}
