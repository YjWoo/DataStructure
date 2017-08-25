package _algorithm;

import graph.Adjacency_List;
import graph.Adjacency_List_ArcNode;

public class Adjacency_List_Algo {

    private static int[] visit;

    /**
     * 图的深度优先遍历算法
     * @param g邻接表
     * @param v起始顶点
     */
    public static void DFS(Adjacency_List g, int v) {
	DFS(g, v, true);
    }
    
    private static void DFS(Adjacency_List g, int v, boolean fst) {
	if (fst == true) {
	    visit = new int[g.adjList.length];
	}
	Adjacency_List_ArcNode p;
	visit[v] = 1;

	System.out.println(v + " ");

	p = g.adjList[v].firstarc;

	while (p != null) {
	    if (visit[p.vertex] == 0) {
		DFS(g, p.vertex, false);
	    }
	    p = p.nextarc;
	}
    }
}
