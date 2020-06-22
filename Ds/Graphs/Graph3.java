package GRAPHS;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Queue;//INTERFACE
import java.util.LinkedList;

public class Graph3
{
HashMap<Integer,HashSet<Integer>> m=new HashMap<>();


void addVertex(int data)
{
if(m.containsKey(data))
{
System.out.println("ERROR: VERTEX "+ data +" EXISTS!!");
return;
}

m.put(data,new HashSet<>());//ASSIGNS THE VALUE AT SPECIFIC KEY (MAPPING)
}


void addEdge(int a,int b)
{
m.get(a).add(b);
}


void Print()
{
System.out.println("VERTICES ARE: "+ m.keySet());
//keySet() RETURNS THE SET OF KEYS

for(Integer i : m.keySet())
System.out.println("NEIGHBOURS OF "+i+" ARE: "+ m.get(i));

System.out.println();
}


void BFS(int s,int v)
{
System.out.println("#BFS(BREADTH_FIRST_SEARCH):- ");
HashSet<Integer> visited=new HashSet<>();//VISITED_HASHSET

Queue<Integer> q=new LinkedList<>();
q.add(s);
visited.add(s);

while(!q.isEmpty())
{
int temp=q.poll();
System.out.print(temp+" ");
visited.add(temp);

for(Integer x: m.get(temp))
{
if(!visited.contains(x))
{
q.add(x);
visited.add(x);
}
}
}
System.out.println();
}


void DFS(int s)
{
HashSet<Integer> visited=new HashSet<>();
System.out.println("#DFS(DEPTH_FIRST_SEARCH):- ");
DFSUtil(s,visited);
System.out.println();
}


void DFSUtil(int s,HashSet<Integer> visited)
{
System.out.print(s+" ");
visited.add(s);

for(Integer x: m.get(s))
{
if(!visited.contains(x))
DFSUtil(x,visited);
}
}


public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
Graph3 g=new Graph3();

System.out.print("SCAN NO. OF NODES: ");
int v=sc.nextInt();
System.out.print("SCAN NO. OF EDGES: ");
int e=sc.nextInt();

System.out.print("SCAN NODES: ");
for(int i=0;i<v;i++)
{
g.addVertex(sc.nextInt());
}

for(int i=0;i<e;i++)
{
System.out.print("SCAN NODE-1 AND NODE-2 TO CREATE THEIR CONNECTION: ");
g.addEdge(sc.nextInt(),sc.nextInt());
}

g.Print();

System.out.print("SCAN STARTING NODE FOR BFS: ");
g.BFS(sc.nextInt(),v);

System.out.print("SCAN STARTING NODE FOR DFS: ");
g.DFS(sc.nextInt());
}
}
/*
GRAPH CREATED USING HASHMAP AND HASHSET

=>BFS(BREADTH_FIRST_SEARCH)
=>DFS(DEPTH_FIRST_SEARCH)
*/
