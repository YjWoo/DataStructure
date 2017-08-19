package _test;

import _algorithm.Seq_Stack_Algo;
import stack.Seq_Stack;

public class Seq_Stack_Test {
    public static void main(String[] args) {
	Seq_Stack st = new Seq_Stack();

	System.out.println(st.top);
	Seq_Stack_Algo.initStack(st);

	System.out.println(st.top);
	System.out.println(Seq_Stack_Algo.isEmpty(st));

	StringBuilder sb1 = new StringBuilder();
	sb1.append("aaa");
	StringBuilder sb2 = new StringBuilder();
	sb2.append("bbb");
	System.out.println(Seq_Stack_Algo.Push(st, sb1));
	System.out.println(Seq_Stack_Algo.Push(st, sb2));
	System.out.println(Seq_Stack_Algo.Pop(st).toString());
	System.out.println(Seq_Stack_Algo.Pop(st).toString());

    }
}
