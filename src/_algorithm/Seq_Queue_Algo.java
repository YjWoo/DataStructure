package _algorithm;

import queue.Seq_Queue;

public class Seq_Queue_Algo {
    /**
     * 初始化顺序队列
     * 
     * @param q目标队列
     */
    public static void initQueue(Seq_Queue q) {
	q.front = q.rear = 0;
    }

    /**
     * 判断队列是否为空
     * 
     * @param q目标队列
     * @return
     */
    public static boolean isEmpty(Seq_Queue q) {
	if (q.rear == q.front) {
	    return true;
	} else {
	    return false;
	}
    }

    /**
     * 入队
     * 
     * @param <T>
     * @param q目标队列
     * @param x入队值
     * @return
     */
    public static <T> boolean enQueue(Seq_Queue q, T x) {
	if ((q.rear + 1) % Seq_Queue.maxSize == q.front)
	    return false;
	else
	    q.rear = (q.rear + 1) % Seq_Queue.maxSize;
	q.data[q.rear] = x;
	return true;
    }

    /**
     * 出队
     * 
     * @param q
     * @return 出队值
     */
    @SuppressWarnings("unchecked")
    public static <T> T deQueue(Seq_Queue q) {
	if (q.front == q.rear) {
	    return null;
	} else {
	    q.front = (q.front + 1) % Seq_Queue.maxSize;
	}
	T t;
	t = (T) q.data[q.front];
	return t;
    }
}
