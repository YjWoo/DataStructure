package test;

import algorithm.Single_linked_list_algo;
import linear_list.Single_linked_list;

public class Single_linked_list_test {
    
    public static void main(String[] args) {
	Single_linked_list s=new Single_linked_list();
	int[] a={2,34,66,4,32,4,6546454};
	s=new Single_linked_list_algo().createList(a, a.length);
	
	System.out.println(s);
	
	System.out.println(new Single_linked_list_algo().findNode(s, 4));
	
	new Single_linked_list_algo().removeNode(s, 4);
	System.out.println(s);
    }
}
