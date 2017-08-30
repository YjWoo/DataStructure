package hash;

/**
 * 哈希表(拉链法)
 * 
 * @author YjWoo
 *
 */
public class Hash_Table {

    public static int maxSize = 40;

    @SuppressWarnings("rawtypes")
    public Hash_Entry[] table;
    public int size;

    public Hash_Table() {
	table = new Hash_Entry[maxSize];
	size = maxSize;
    }

    public Hash_Table(int size) {
	this.table = new Hash_Entry[size];
	this.size = size;
    }
}
