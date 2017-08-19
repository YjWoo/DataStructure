package _algorithm;

import stack.Seq_Stack;

public class Seq_Stack_Algo {
    /**
     * 栈初始化
     * 
     * @param st目标栈
     */
    public static void initStack(Seq_Stack st) {
	st.top = -1;
    }

    /**
     * 判断栈空
     * 
     * @param st目标栈
     * @return
     */
    public static boolean isEmpty(Seq_Stack st) {
	if (st.top == -1) {
	    return true;
	}
	return false;
    }

    /**
     * 入栈
     * 
     * @param st目标栈
     * @param x插入值
     * @return 操作是否成功
     */
    public static <T> boolean Push(Seq_Stack st, T x) {
	if (st.top == (Seq_Stack.maxSize - 1)) {
	    return false;
	}
	st.data[++st.top] = x;
	return true;
    }

    /**
     * 出栈
     * 
     * @param st目标栈
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T> T Pop(Seq_Stack st) {
	if (st.top == -1) {
	    return null;
	}
	T x = (T) st.data[st.top];
	st.top--;
	return x;
    }
}
