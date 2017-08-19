package _test;

import _algorithm.Seq_Queue_Algo;
import queue.Seq_Queue;

public class Seq_Queue_Test {
    public static void main(String[] args) {
	String a="343";
	String b="aba";
	
	Seq_Queue s=new Seq_Queue();
	Seq_Queue_Algo.initQueue(s);
	
	System.out.println(Seq_Queue_Algo.isEmpty(s));
	Seq_Queue_Algo.enQueue(s, a);
	Seq_Queue_Algo.enQueue(s, b);
	System.out.println(Seq_Queue_Algo.isEmpty(s));
	System.out.println(s);
	
	System.out.println(Seq_Queue_Algo.deQueue(s).toString());
	System.out.println(Seq_Queue_Algo.deQueue(s).toString());
	
	System.out.println(s);
    }
}
