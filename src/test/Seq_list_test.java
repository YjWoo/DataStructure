package test;

import algorithm.Seq_list_algo;
import linear_list.Seq_list;

public class Seq_list_test {
    public static void main(String[] args) {
	int[] num = { 1, 23, 6, 4, 7, 6, 1 };
	Seq_list list = new Seq_list(num);

	System.out.println(new Seq_list_algo().locateItem(list, 4));
	System.out.println(list.getLength());
	System.out.println(new Seq_list_algo().insert(list, 3, 22));
	System.out.println(list.getLength());
	System.out.println(list);
	System.out.println(new Seq_list_algo().remove(list, 3));
	System.out.println(list.getLength());
	System.out.println(list);
    }
}
