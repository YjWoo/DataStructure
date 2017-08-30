package _algorithm;

import hash.Hash_Entry;
import hash.Hash_Table;

/**
 * 哈希表算法
 * 
 * @author YjWoo
 *
 */
public class Hash_Table_Algo {

    /**
     * 寻找下标
     * 
     * @param h
     * @param length
     * @return
     */
    private static int indexFor(int h, int length) {
	return h % (length - 1);
    }

    /**
     * 取值
     * 
     * @param h
     * @param key
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <K, V> V get(Hash_Table h, K key) {
	if (key == null)
	    return null;
	int hash = key.hashCode();// key的哈希值
	int index = indexFor(hash, h.table.length);// 求key在数组中的下标

	for (Hash_Entry<K, V> e = h.table[index]; e != null; e = e.next) {
	    Object k = e.getKey();
	    if (e.getKey().hashCode() == hash && (k == key || key.equals(k)))
		return e.getValue();
	}
	return null;
    }
    
    /**
     * 存值
     * @param h
     * @param key
     * @param value
     * @return 原有值
     */
    @SuppressWarnings("unchecked")
    public static <K, V> V put(Hash_Table h, K key, V value) {
	if (key == null)
	    return null;
	int hash = key.hashCode();
	int index = indexFor(hash, h.table.length);

	// 如果添加的key已经存在，那么只需要修改value值即可
	for (Hash_Entry<K, V> e = h.table[index]; e != null; e = e.next) {
	    Object k = e.getKey();
	    if (e.getKey().hashCode() == hash && (k == key || key.equals(k))) {
		V oldValue = e.getValue();
		e.setValue(value);
		return oldValue;// 原来的value值
	    }
	}
	// 如果key值不存在，那么需要添加
	Hash_Entry<K, V> e = h.table[index];// 获取当前数组中的e
	h.table[index] = new Hash_Entry<K, V>(key, value, e);// 新建一个Entry，并将其指向原先的e
	return null;
    }
}
