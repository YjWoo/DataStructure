package _test;

import _algorithm.Linked_Queue_Algo;
import queue.Linked_Queue;

public class Linked_Queue_Test {
    public static void main(String[] args) {
	Linked_Queue l = new Linked_Queue();

	String a = new String("aaaa");
	String b = new String("bbbb");
	String c = new String("cccc");

	System.out.println(Linked_Queue_Algo.isEmpty(l));
	Linked_Queue_Algo.enQueue(l, a);
	System.out.println(l);
	Linked_Queue_Algo.enQueue(l, b);
	System.out.println(l);
	Linked_Queue_Algo.enQueue(l, c);
	System.out.println(l);
	System.out.println(Linked_Queue_Algo.isEmpty(l));
	System.out.println("----------------------------------");
	System.out.println(Linked_Queue_Algo.deQueue(l).toString());
	System.out.println(l);
	System.out.println(Linked_Queue_Algo.deQueue(l).toString());
	System.out.println(l);
	System.out.println(Linked_Queue_Algo.deQueue(l).toString());
	System.out.println(l);
    }
}
