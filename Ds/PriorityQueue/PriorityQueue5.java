package PRIORITYQUEUE;
import java.util.Scanner;
public class PriorityQueue5
{
final int size=10;
int arr[]=new int[size];
int nItems=0;//SIZE OF AN ARRAY AT ANY INSTANT
int max=0;

public int remove()
{
if(this.isEmpty())
{
System.out.println("#CAN'T REMOVE -> QUEUE IS EMPTY");
return -1;
}

max=MaxIndex(arr);

int x=arr[max];
for(int i=0;i<nItems;i++)
{
if(i > max)
arr[i-1]=arr[i];
}
nItems--;
return x;
}


public void insert(int data)
{
if(this.isEmpty())
{
arr[0]=data;
nItems++;
return;
}

if(this.isFull())
{
System.out.println("#CAN'T INSERT -> QUEUE IS FULL");
return;
}
arr[nItems++]=data;
}


public boolean isEmpty()
{return (nItems == 0);}


public int peek()
{
if(this.isEmpty())
{
System.out.println("#NO PEEK -> QUEUE IS EMPTY");
return -1;
}

return arr[MaxIndex(arr)];
}


public int size()
{return nItems;}


public boolean isFull()
{return (nItems == size);}


public int MaxIndex(int arr[])
{
int m=0;
for(int i=nItems-1;i>=0;i--)
{
if(arr[i] > arr[m]) m=i;//MAXIMUM VALUE'S INDEX
}
return m;
}


public void Print()
{
if(nItems>0)
{
System.out.print("ARRAY IMPLEMENTATION: ");
for(int i=0;i<nItems;i++)
System.out.print(arr[i] + " ");
System.out.println();
}
}


public static void main(String[] args)
{
PriorityQueue5 pq=new PriorityQueue5();
pq.insert(9);
pq.insert(1);
pq.insert(2);
pq.insert(11);
pq.insert(18);
pq.insert(12);
pq.insert(20);
pq.insert(19);

System.out.println("MAX HEAP FOR NON SORTED ARRAY:-");
pq.Print();
System.out.println("PEEK: "+pq.peek());
System.out.println("ELEMENT DEQUEUED: "+pq.remove());
pq.Print();
System.out.println("PEEK: "+pq.peek());
System.out.println("ELEMENT DEQUEUED: "+pq.remove());
pq.Print();
System.out.println("PEEK: "+pq.peek());
System.out.println("ELEMENT DEQUEUED: "+pq.remove());
pq.Print();
System.out.println("PEEK: "+pq.peek());
System.out.println("ELEMENT DEQUEUED: "+pq.remove());
pq.Print();
System.out.println("PEEK: "+pq.peek());
System.out.println("ELEMENT DEQUEUED: "+pq.remove());
pq.Print();
System.out.println("PEEK: "+pq.peek());
System.out.println("ELEMENT DEQUEUED: "+pq.remove());
pq.Print();
System.out.println("PEEK: "+pq.peek());
System.out.println("ELEMENT DEQUEUED: "+pq.remove());
pq.Print();
System.out.println("PEEK: "+pq.peek());
System.out.println("ELEMENT DEQUEUED: "+pq.remove());
pq.Print();
System.out.println("PEEK: "+pq.peek());
System.out.println("ELEMENT DEQUEUED: "+pq.remove());
pq.Print();
//System.out.println("SIZE: "+pq.size());
}
}

/*
ARRAY IMPLEMENTATION OF PRIORITYQUEUE USING MAX HEAP (FOR NON SORTED ARRAY)
*/
