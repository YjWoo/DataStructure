package test;

import algorithm.Seq_List_Algo;
import linear_list.Seq_List;

public class Seq_List_Test {
    public static void main(String[] args) {
	int[] num = { 1, 23, 6, 4, 7, 6, 1 };
	Seq_List list = new Seq_List(num);

	System.out.println(Seq_List_Algo.locateItem(list, 4));
	System.out.println(list.getLength());
	System.out.println(Seq_List_Algo.insert(list, 3, 22));
	System.out.println(list.getLength());
	System.out.println(list);
	System.out.println(Seq_List_Algo.remove(list, 3));
	System.out.println(list.getLength());
	System.out.println(list);
    }
}
