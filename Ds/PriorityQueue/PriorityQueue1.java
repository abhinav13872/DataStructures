package PRIORITYQUEUE;
import java.util.PriorityQueue;
import java.util.Scanner;
public class PriorityQueue1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

//PriorityQueue<Integer> pq=new PriorityQueue<>();//MIN HEAP
PriorityQueue<Integer> pq=new PriorityQueue<>(java.util.Collections.reverseOrder());//MAX HEAP

System.out.print("ENTER THE SIZE OF QUEUE: ");
int n=sc.nextInt();

System.out.print("ENTER ELEMENTS: ");
for(int i=0;i<n;i++)
pq.add(sc.nextInt());

System.out.println("PEEK: "+pq.peek());
System.out.println("ELEMENT DEQUEUED: "+pq.poll());
System.out.println("PEEK: "+pq.peek());
System.out.println("ELEMENT DEQUEUED: "+pq.poll());
System.out.println("PEEK: "+pq.peek());
System.out.println("ELEMENT DEQUEUED: "+pq.poll());
System.out.println("PEEK: "+pq.peek());
System.out.println("ELEMENT DEQUEUED: "+pq.poll());
System.out.println("PEEK: "+pq.peek());
System.out.println("ELEMENT DEQUEUED: "+pq.poll());
System.out.println("PEEK: "+pq.peek());
System.out.println("SIZE: "+pq.size());


}
}
/*
THE DEFAULT PRIORITYQUEUE PROVIDED BY JAVA IS MIN HEAP
(MIN VALUE HAS THE HIGHEST PRIORITY)

MIN HEAP -> ASCENDING ORDER
MAX HEAP -> DESCENDING ORDER
*/
