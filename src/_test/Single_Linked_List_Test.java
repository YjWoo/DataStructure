package _test;

import _algorithm.Single_Linked_List_Algo;
import linear_list.Single_Linked_List;

public class Single_Linked_List_Test {
    
    public static void main(String[] args) {
	Single_Linked_List s=new Single_Linked_List();
	int[] a={2,34,66,4,32,4,6546454};
	s=Single_Linked_List_Algo.createList(a, a.length);
	
	System.out.println(s);
	
	System.out.println(Single_Linked_List_Algo.findNode(s, 4));
	
	Single_Linked_List_Algo.removeNode(s, 4);
	System.out.println(s);
    }
}
