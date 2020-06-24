package GREEDYALGOS;
import java.util.Scanner;
public class Greed1
{

public static void Dijkstras(int arr[][],int s)
{
int v=arr.length;//NO._OF_VERTICES
boolean visited[]=new boolean[v];
int distance[]=new int[v];

for(int i=0;i<v;i++)
distance[i]=Integer.MAX_VALUE;

distance[s]=0;//SINCE DISTANCE OF SOURCE WILL BE 0 FROM ITSELF

for(int i=0;i<v-1;i++)
{
int m=findMinVertex(distance,visited);//MIN-VERTEX NOT VISITED
visited[m]=true;

//NOW VISIT ALL THE NEIGHBOURS OF MIN-VERTEX
for(int j=0;j<v;j++)
{
if(arr[m][j]!=0 && !visited[j])
{
int DISTANCE=distance[m] + arr[m][j];//NEW_DISTANCE
//NEW-DISTANCE = MIN VERTEX TK AANE KA DISTANCE + USS EDGE KA DISTANCE

if(DISTANCE < distance[j]) distance[j]=DISTANCE;
}
}
}
System.out.println("SHORTEST PATH FROM SOURCE "+s+" ARE:- ");
for(int i:distance)
System.out.print(i+" ");
System.out.println();
}


public static int findMinVertex(int distance[],boolean visited[])
{
int m=-1;//MIN-VERTEX
int v=distance.length;

for(int i=0;i<v;i++)
{
if(!visited[i] && (m == -1 || distance[i] < distance[m])) m=i;
}
return m;
}


public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("ENTER NO .OF VERTICES: ");
int v=sc.nextInt();
System.out.print("ENTER NO .OF EDGES: ");
int e=sc.nextInt();
int adjMatrix[][]=new int[v][v];

System.out.println("ENTER EDGES AND THEIR WEIGHTS:- ");
for(int i=0;i<e;i++)
{
int v1=sc.nextInt();
int v2=sc.nextInt();
int w=sc.nextInt();
adjMatrix[v1][v2]=w;
adjMatrix[v2][v1]=w;
}

System.out.print("SCAN SOURCE: ");
Dijkstras(adjMatrix,sc.nextInt());//PASSING GRAPH AND THE SOURCE(STARTING_POINT_OF_GRAPH)
}
}
/*
#DIJKSTRA'S ALGORITHM :-
->single source shortest distance algorithm
*/
