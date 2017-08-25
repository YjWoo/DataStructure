package _algorithm;

import graph.Adjacency_List;
import graph.Adjacency_List_ArcNode;
import queue.Seq_Queue;

public class Adjacency_List_Algo {

    private static int[] visit;

    /**
     * 图的深度优先遍历算法
     * 
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

	System.out.print(v + " → ");

	p = g.adjList[v].firstarc;

	while (p != null) {
	    if (visit[p.vertex] == 0) {
		DFS(g, p.vertex, false);
	    }
	    p = p.nextarc;
	}
    }

    /**
     * 图的宽度优先遍历算法
     * 
     * @param g邻接表
     * @param v起始顶点
     */
    public static void BFS(Adjacency_List g, int v) {
	Adjacency_List_ArcNode p;
	int i;
	visit = new int[g.adjList.length];

	Seq_Queue sq = new Seq_Queue();
	Seq_Queue_Algo.initQueue(sq);

	System.out.print(v + " → ");

	visit[v] = 1;
	Seq_Queue_Algo.enQueue(sq, v);
	while (sq.front != sq.rear) {
	    i = Seq_Queue_Algo.deQueue(sq);
	    p = g.adjList[i].firstarc;
	    while (p != null) {
		if (visit[p.vertex] == 0) {
		    System.out.print(p.vertex + " → ");
		    visit[p.vertex] = 1;
		    Seq_Queue_Algo.enQueue(sq, p.vertex);
		}
		p = p.nextarc;
	    }
	}
    }
}
