package graph;

/**
 * 邻接表：表节点定义
 * 
 * @author YjWoo
 *
 */
public class Adjacency_List_ArcNode {
    public int vertex;
    public Adjacency_List_ArcNode nextarc;
    // 权值
    public int info;

    public Adjacency_List_ArcNode() {
	// TODO Auto-generated constructor stub
    }

    public Adjacency_List_ArcNode(int vertex) {
	this.vertex = vertex;
    }
}
