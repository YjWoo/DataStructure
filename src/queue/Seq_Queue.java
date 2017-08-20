package queue;

import java.util.Arrays;

/**
 * 顺序队列
 * 
 * @author YjWoo
 *
 */
public class Seq_Queue{

    public static int maxSize = 40;

    public Object[] data = new Object[maxSize];
    public int front;
    public int rear;

    @Override
    public String toString() {
	return "Seq_queue [data=" + Arrays.toString(data) + ", front=" + front + ", rear=" + rear + "]";
    }
}
