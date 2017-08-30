package hash;

/**
 * 哈希表节点
 * 
 * @author YjWoo
 *
 * @param <K>
 * @param <V>
 */
public class Hash_Entry<K, V> {
    final K key;
    V value;
    public Hash_Entry<K, V> next;

    public Hash_Entry(K key, V value, Hash_Entry<K, V> next) {
	this.key = key;
	this.value = value;
	this.next = next;
    }

    public V getValue() {
	return value;
    }

    public void setValue(V value) {
	this.value = value;
    }

    public K getKey() {
	return key;
    }

    @Override
    public final int hashCode() {
	return (key == null ? 0 : key.hashCode()) ^ (value == null ? 0 : value.hashCode());
    }

    @Override
    public boolean equals(Object o) {
	if (!(o instanceof Hash_Entry))
	    return false;
	Hash_Entry<?, ?> e = (Hash_Entry<?, ?>) o;
	Object k1 = getKey();
	Object k2 = e.getKey();
	if (k1 == k2 || (k1 != null && k1.equals(k2))) {
	    Object v1 = getValue();
	    Object v2 = e.getValue();
	    if (v1 == v2 || (v1 != null && v1.equals(v2)))
		return true;
	}
	return false;
    }

    @Override
    public String toString() {
	return getKey() + " = " + getValue();
    }

}
