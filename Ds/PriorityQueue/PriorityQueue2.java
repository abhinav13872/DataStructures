package PRIORITYQUEUE;
import java.util.Scanner;
public class PriorityQueue2
{
final int size=5;
int arr[]=new int[size];
int nItems=0;//SIZE OF AN ARRAY AT ANY INSTANT

public int remove()
{
if(this.isEmpty())
{
System.out.println("#CAN'T REMOVE -> QUEUE IS EMPTY");
return -1;
}
return arr[--nItems];
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

int i=0;
for(i=nItems-1;i>=0;i--) //RIGHT SEARCH
{
if(data < arr[i])
{
arr[i+1]=arr[i];
}
else break;
}

arr[i+1]=data;
nItems++;
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
return arr[nItems-1];
}


public int size()
{return nItems;}


public boolean isFull()
{return (nItems == size);}


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
PriorityQueue2 pq=new PriorityQueue2();
pq.insert(3);
pq.insert(5);
pq.insert(9);
pq.insert(7);
System.out.println("MAX HEAP:-");
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

}
}

/*
ARRAY IMPLEMENTATION OF PRIORITYQUEUE USING MAX HEAP
*/
