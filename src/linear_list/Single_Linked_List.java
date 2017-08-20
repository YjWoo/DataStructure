package linear_list;

/**
 * 单链表定义
 * 
 * @author YjWoo
 *
 */
public class Single_Linked_List {
    public int data;
    public Single_Linked_List next;

    @Override
    public String toString() {
	StringBuilder s = new StringBuilder();
	Single_Linked_List r = next;
	s.append(data);
	while (r != null) {
	    s.append(" → ");
	    s.append(r.data);
	    r = r.next;
	}
	return s.toString();
    }
}
