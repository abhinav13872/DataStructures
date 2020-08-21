package PRIORITYQUEUE;
import java.util.*;

class QueueNode
{
  int data;
  int priority;
  QueueNode next;

  public QueueNode(int data, int p) 
  {
    this.data = data;
    this.priority = p;
  }
}

class PQueueLL
{
  public QueueNode front, rear;
  public void EnQueue(int data, int priority)
  {
    if(front != null)
    {
        QueueNode temp=new QueueNode(data,priority);
    	if(priority <= front.priority)
    	{
          //INSERTION AT HEAD
      	  temp.next=front;
          front=temp;
          return;
    	}
    	else
    	{
          QueueNode ptr=front;
          while((priority >= ptr.priority) && (ptr.next != null)) ptr=ptr.next;
          temp.next=ptr.next;
          ptr.next=temp;
          return;
        }
    }
    front=new QueueNode(data,priority);
  }    

  public int DeQueue()
  {
    if(front != null)
    {
      int x=front.data;
      if(front == rear) front=rear=null;
      else front=front.next;
      return x;
    }
    return -1;
  }    
}

public class Main
{
  public static void main(String[] args)
  {
    PQueueLL q=new PQueueLL();
    Scanner s=new Scanner(System.in);
    int t, n, q1, q2, q3;
    t = Integer.parseInt(s.nextLine().trim());
    while(t>0)
    {
      n = Integer.parseInt(s.nextLine().trim());
      while(n>0)
      {
        q1 = Integer.parseInt(s.nextLine().trim());
        if(q1 == 1)
        {
          q2 = Integer.parseInt(s.nextLine().trim());
          q3 = Integer.parseInt(s.nextLine().trim());
          q.EnQueue(q2, q3);
        }
        else
          System.out.print(q.DeQueue() + " ");
        n--;
      }
      System.out.println();
      t--;
    }
  }
}
