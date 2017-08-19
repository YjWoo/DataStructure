package _test;

import _algorithm.Linked_Stack_Algo;
import stack.Linked_Stack;

public class Linked_Stack_Test {
    public static void main(String[] args) {
	Linked_Stack ls=new Linked_Stack();
	Linked_Stack_Algo.initStack(ls);
	
	String s1="aaa";
	String s2="bbb";
	String s3="ccc";
	System.out.println(Linked_Stack_Algo.isEmpty(ls));
	System.out.println("------------------");
	System.out.println(Linked_Stack_Algo.Push(ls, s1));
	System.out.println(Linked_Stack_Algo.Push(ls, s2));
	System.out.println(Linked_Stack_Algo.Push(ls, s3));
	System.out.println("------------------");
	
	System.out.println(Linked_Stack_Algo.isEmpty(ls));
	
	System.out.println(Linked_Stack_Algo.Pop(ls).toString());
	System.out.println(Linked_Stack_Algo.Pop(ls).toString());
	System.out.println(Linked_Stack_Algo.Pop(ls).toString());
    }
}
