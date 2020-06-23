package GRAPHS;
import java.util.LinkedList;//CLASS
import java.util.Queue;//INTERFACE
import java.util.Scanner;

public class Graph4
{
int v;//NO._OF_NODES
LinkedList<Integer> arr[];

Graph4(int v)
{
this.v=v;
arr=new LinkedList[v];//arr[] -> LinkedList[]

for(int i=0;i<v;i++)
arr[i]=new LinkedList<>();
}


void addEdge(int a,int b)
{
arr[a].add(b);
arr[b].add(a);
//NOW GRAPH IS BI-DIRECTIONAL
}

void Print(LinkedList arr[])
{
for(LinkedList i:arr)
System.out.println(i);
}


void BFS(int s)
{
System.out.println("#BFS(BREADTH_FIRST_SEARCH):-");

boolean visited[]=new boolean[v];//VISITED_ARRAY
Queue<Integer> q=new LinkedList<>();
q.add(s);
visited[s]=true;

while(!q.isEmpty())
{
int temp=q.poll();
System.out.print(temp+" ");

for(Integer x:arr[temp])
{
if(!visited[x])
{
q.add(x);
visited[x]=true;
}
}

}
System.out.println();
}


void DFS(int s)
{
boolean visited[]=new boolean[v];
System.out.println("#DFS(DEPTH_FIRST_SEARCH):- ");
DFSUtil(s,visited);
System.out.println();
}


void DFSUtil(int s,boolean visited[])
{
System.out.print(s+" ");
visited[s]=true;

for(Integer x:arr[s])
{
if(!visited[x])
DFSUtil(x,visited);
}
}


void DFSOverAll()
{
System.out.println("#DFS-OVERALL:- ");
boolean visited[]=new boolean[v];
int count=0;//COUNT_OF_COMPONENTS

for(int i=0;i<v;i++)
{
if(!visited[i])
{
count++;
System.out.print("COMPONENT-"+count+": ");
DFSUtil(i,visited);
System.out.println();//LINE_SPACE_FOR_EVERY_COMPONENT
}
}
System.out.println("NO. OF COMPONENTS: "+count);
}


public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("SCAN NO. OF VERTICES: ");
Graph4 g=new Graph4(sc.nextInt());

System.out.print("SCAN NO. OF EDGES: ");
int e=sc.nextInt();

for(int i=0;i<e;i++)
{
System.out.print("SCAN VERTEX-1 AND VERTEX-2 TO CREATE THEIR CONNECTION: ");
g.addEdge(sc.nextInt(),sc.nextInt());
}

g.Print(g.arr);

System.out.print("SCAN STARTING NODE FOR BFS: ");
g.BFS(sc.nextInt());

System.out.print("SCAN STARTING NODE FOR DFS: ");
g.DFS(sc.nextInt());

g.DFSOverAll();
}
}
/*
GRAPH CREATED USING ARRAYS AND LINKEDLIST

=>BFS(BREADTH_FIRST_SEARCH) ->FOR CONNECTED GRAPH
=>DFS(DEPTH_FIRST_SEARCH) ->FOR CONNECTED AS WELL AS DISCONNECTED GRAPH
*/
