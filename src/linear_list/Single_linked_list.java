package linear_list;

/**
 * 单链表定义
 * 
 * @author Miracle
 *
 */
public class Single_linked_list {
    public int data;
    public Single_linked_list next;

    @Override
    public String toString() {
	StringBuilder s = new StringBuilder();
	Single_linked_list r = next;
	s.append(data);
	while (r != null) {
	    s.append(" → ");
	    s.append(r.data);
	    r = r.next;
	}
	return s.toString();
    }
}
