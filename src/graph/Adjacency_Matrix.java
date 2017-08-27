package graph;

/**
 * 邻接矩阵
 * 
 * @author YjWoo
 *
 */
public class Adjacency_Matrix {
    public static int maxSize = 40;
    // 权值
    public int[][] edges = new int[maxSize][maxSize];
    // n：顶点数，e：边数
    public int n, e;
    public Adjacency_Matrix_Vertex[] vex = new Adjacency_Matrix_Vertex[maxSize];

    public Adjacency_Matrix(int[][] edges) {
	this.edges = edges;
	this.n = edges.length;
    }

    @Override
    public String toString() {
	return "Adjacency_Matrix :" + "\r\n" + print();
    }

    private String print() {
	StringBuilder s = new StringBuilder();
	for (int i = 0; i < edges.length; i++) {
	    for (int j = 0; j < edges[i].length; j++) {
		s.append(edges[i][j]);
		s.append("\t");
	    }
	    s.append("\r\n");
	}
	return s.toString();
    }
}
