package _test;

import _algorithm.Hash_Table_Algo;
import hash.Hash_Entry;
import hash.Hash_Table;

public class Hash_Table_Test {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
	Hash_Table t = new Hash_Table(20);

	Hash_Table_Algo.put(t, 1, 90);
	Hash_Table_Algo.put(t, 2, 56);
	Hash_Table_Algo.put(t, 3, 64);

	System.out.println(Hash_Table_Algo.get(t, 1).toString());
	System.out.println(Hash_Table_Algo.get(t, 3).toString());
	System.out.println(Hash_Table_Algo.get(t, 2).toString());

	System.out.println("[1]:old value:" + Hash_Table_Algo.put(t, 1, 23));

	System.out.println(Hash_Table_Algo.get(t, 1).toString());

	System.out.println(t.table[2].toString());
	System.out.println(t.size);

	for (int i = 0; i < t.size; i++) {
	    Hash_Entry<Integer, Integer> en = t.table[i];
	    if (en != null) {
		System.out.println(en.toString());
	    }
	}
    }
}
