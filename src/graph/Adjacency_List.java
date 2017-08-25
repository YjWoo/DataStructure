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
	    adjList[i]=new Adjacency_List_VNode();
	}
    }
}
