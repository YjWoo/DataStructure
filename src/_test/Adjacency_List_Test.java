package _test;

import _algorithm.Adjacency_List_Algo;
import graph.Adjacency_List;
import graph.Adjacency_List_ArcNode;

public class Adjacency_List_Test {
    public static void main(String[] args) {
	Adjacency_List list = new Adjacency_List(5);
	
	Adjacency_List_ArcNode n0=new Adjacency_List_ArcNode(0);
	Adjacency_List_ArcNode n1=new Adjacency_List_ArcNode(1);
	Adjacency_List_ArcNode n2=new Adjacency_List_ArcNode(2);
	Adjacency_List_ArcNode n3=new Adjacency_List_ArcNode(3);
	Adjacency_List_ArcNode n4=new Adjacency_List_ArcNode(4);
	
	list.adjList[0].firstarc=n3;
	list.adjList[2].firstarc=n1;
	list.adjList[4].firstarc=n0;
	
	n3.nextarc=n2;
	n1.nextarc=n4;
	
	Adjacency_List_Algo.DFS(list, 0);

	
    }
}
