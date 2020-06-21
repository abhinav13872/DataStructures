package GRAPHS;
import java.util.*;
public class Graph2
{
HashMap<Integer,HashSet<Integer>> m=new HashMap<>();


void addVertex(int data)
{
if(m.containsKey(data))
{
System.out.println("ERROR: VERTEX "+ data +" EXISTS!!");
return;
}

m.put(data,new HashSet<>());
}


void addEdge(int a,int b)
{
m.get(a).add(b);
/*
get(a) RETURNED US A SET AT "a" KEY
*/
//m.get(b).add(a);//TO MAKE A BIDIRECTIONAL_GRAPH
}


void Print()
{
System.out.println("VERTICES ARE: "+ m.keySet());

for(Integer i : m.keySet())
System.out.println("NEIGHBOURS OF "+i+" ARE: "+ m.get(i));

System.out.println();
}


public static void main(String[] args)
{
Graph2 g=new Graph2();
g.addVertex(0);
g.addVertex(1);
g.addVertex(2);
g.addVertex(3);
g.addVertex(4);

g.addEdge(0,1);
g.addEdge(0,1);
g.addEdge(0,2);
g.addEdge(0,3);
g.addEdge(1,3);
g.addEdge(2,4);
g.addEdge(3,4);

g.Print();

g.addVertex(0);
/*
SINCE HASHMAP HOLDS UPDATED VALUE OF KEY
SO OLD CONNECTIONS WOULD BE LOST
IF NEW KEY GOT CREATED

THEREFORE WE MANAGED THIS ISSUE IN OUR addVertex()
*/
g.Print();
}
}
/*
CREATION OF GRAPH USING "HashMap" AND "HashSet"
*/
