package graph;

/**
 * 邻接表
 * 
 * @author YjWoo
 *
 */
public class Adjacency_List {
    public static int maxSize = 40;
    public int n, e;
    public Adjacency_List_VNode adjList[] = new Adjacency_List_VNode[maxSize];

    public Adjacency_List() {
	// TODO Auto-generated constructor stub
    }

    public Adjacency_List(int n) {
	adjList = new Adjacency_List_VNode[n];
	for (int i = 0; i < adjList.length; i++) {
	    adjList[i] = new Adjacency_List_VNode();
	}
    }

    @Override
    public String toString() {
	StringBuilder sb = new StringBuilder();
	for (int i = 0; i < adjList.length; i++) {
	    sb.append(i).append(": → ");
	    if (adjList[i].firstarc != null) {
		sb.append(adjList[i].firstarc.vertex).append(" → ");
		Adjacency_List_ArcNode p = adjList[i].firstarc.nextarc;
		while (p != null) {
		    sb.append(p.vertex).append(" → ");
		    p = p.nextarc;
		}
	    }
	    sb.append("\r\n");
	}
	return sb.toString();
    }

}
