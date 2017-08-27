package _algorithm;

import graph.Adjacency_Matrix;

public class Adjacency_Matrix_Algo {
    /**
     * 最小生成树：普里姆算法
     * 
     * @param g
     *            邻接矩阵
     * @param v0
     *            初始顶点
     * @return 权值
     */
    public static int Prim(Adjacency_Matrix g, int v0) {
	int sum = 0;
	int[] lowcost = new int[g.edges.length];
	int[] vset = new int[g.edges.length];
	int v = v0, k = v0;
	int min;
	StringBuilder s = new StringBuilder();
	s.append(v0).append("-- Weight:");
	for (int i = 0; i < g.n; i++) {
	    lowcost[i] = g.edges[v0][i];
	    vset[i] = 0;
	}
	for (int i = 1; i < g.n; i++) {
	    min = Integer.MAX_VALUE;
	    for (int j = 0; j < g.n; j++) {
		if (vset[j] == 0 && lowcost[j] < min) {
		    min = lowcost[j];
		    k = j;
		}
	    }
	    vset[k] = 1;
	    v = k;
	    s.append(min).append("-->").append(v).append("-- Weight:");
	    sum += min;
	    for (int j = 0; j < g.n; j++) {
		if (vset[j] == 0 && g.edges[v][j] < lowcost[j]) {
		    lowcost[j] = g.edges[v][j];
		}
	    }
	}
	System.out.println(s.toString());
	return sum;
    }

    /**
     * 迪杰斯特拉算法，求最短路径
     * 
     * @param g邻接矩阵
     * @param v目标顶点
     */
    public static void Dijkstra(Adjacency_Matrix g, int v) {
	boolean[] set = new boolean[g.n];
	int[] disk = new int[g.n];
	int[] path = new int[g.n];
	int min, u = 0;
	// 初始化
	for (int i = 0; i < g.n; i++) {
	    disk[i] = g.edges[v][i];
	    set[i] = false;
	    if (g.edges[v][i] < Integer.MAX_VALUE) {
		path[i] = v;
	    } else {
		path[i] = -1;
	    }
	}
	// 关键步骤
	for (int i = 0; i < path.length; i++) {
	    min = Integer.MAX_VALUE;
	    for (int j = 0; j < g.n; j++) {
		if (set[j] == false && disk[j] < min) {
		    u = j;
		    min = disk[j];
		}
	    }
	    set[u] = true;
	    for (int j = 0; j < g.n; j++) {
		if (set[j] == false && disk[u] + g.edges[u][j] < disk[j]) {
		    disk[j] = disk[u] + g.edges[u][j];
		    path[j] = u;
		}
	    }
	}

	System.out.println("target--> Shortest Path: " + disk[v] + " Previous Node: " + path[v]);
    }
}
