package queue;

/**
 * 链队
 * 
 * @author Miracle
 *
 */
public class Linked_Queue {
    public Linked_Queue_Node front;
    public Linked_Queue_Node rear;

    @Override
    public String toString() {
	StringBuilder s = new StringBuilder();
	s.append("Linked_Queue [");
	if (front != null) {
	    s.append(" front=");
	    s.append(front.data.toString());
	}
	if (rear != null) {
	    s.append(" rear=");
	    s.append(rear.data.toString());
	}
	s.append(" ]");
	return s.toString();
    }
}
