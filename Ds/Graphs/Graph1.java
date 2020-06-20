package GRAPHS;

public class Graph1
{
int v;//NO._OF_NODES
LinkedList<Integer> arr[];

Graph1(int v)
{
this.v=v;
arr=new LinkedList[v];//arr[] -> LinkedList[]
/*
SINCE LINKEDLIST ARRAY IS EMPTY
NULL HOGA HR INDEX PE
*/
//Print(arr);

for(int i=0;i<v;i++)
arr[i]=new LinkedList<>();
/*
NOW LINKEDLIST ARRAY IS STORING REFERANCE OF LINKEDLIST OBJECT
*/
//Print(arr);
}


void addEdge(int a,int b)
{
arr[a].add(b);//a TO b EDGE WILL BE CREATED
//arr[b].add(a);//FOR BI-DIRECTIONAL GRAPH
}


void Print(LinkedList arr[])
{
for(LinkedList i:arr)
System.out.println(i);
}


public static void main(String[] args)
{
Graph1 g=new Graph1(5);
/*
g.addEdge(0,1);
//g.addEdge(0,1);
//g.addEdge(0,1);
g.addEdge(0,2);
g.addEdge(1,2);
g.addEdge(2,0);
g.addEdge(2,3);
g.addEdge(3,3);//SELF LOOP(A FRIEND OF ITSELF)
*/

g.addEdge(0,1);
g.addEdge(0,2);
g.addEdge(0,3);
g.addEdge(1,3);
g.addEdge(2,4);
g.addEdge(3,4);

g.Print(g.arr);
}
}
/*
CREATION OF GRAPH USING LINKEDLIST

DRAWBACK:-
=>CREATES EDGES FOR DUPLICATES (MULTIEDGE)
*/
