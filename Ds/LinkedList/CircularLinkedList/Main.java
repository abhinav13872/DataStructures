package CIRCULARLINKEDLIST;
import java.util.Scanner;


class Result {
  static LinkList listCut(LinkList head)
  {
    if(head != null)
    {
      LinkList tail=head;
      while(tail.next != head) tail=tail.next;
      
      LinkList fptr=head;							//FAST POINTER
      LinkList sptr=head;							//SLOW POINTER
      LinkList presptr=sptr;
      
      while(true)
      {
        presptr=sptr;
        fptr=fptr.next.next;
        sptr=sptr.next;
               if(fptr == head || fptr.next == head) break;
      }
      
      //System.out.println("MID DATA: "+sptr.data);
      //NOW SLOW POINTER WILL BE  AT MID(CEIL VALUE)
      presptr.next=head;
      
      LinkList HEAD=sptr;							//HEAD OF SECOND LIST
      tail.next=HEAD;
      return HEAD;
    }
    return head;
  }
}

class LinkList {
  int data;
  LinkList next;
  LinkList() {}
  LinkList(int d) {
    data=d;
  }
}

class Main
{
  // Insert in Beginning
  static LinkList insertBeg(LinkList head, int data)
  {
    LinkList newLink = new LinkList(data);
    LinkList t = head;
    newLink.next = head;   // link new node at beginning of list
    if (head != null)
    {
      while(t.next != head)
        t = t.next;
      t.next = newLink;
    }
    else
      newLink.next = newLink;
    head = newLink;  // Change the head to new node.
    return head;
  }
  // Insert in end
  static LinkList insertEnd(LinkList head, int data)
  {
    LinkList newLink = new LinkList(data);
    LinkList last = head;
    newLink.next = null;   // link new node to NULL as it is last node
    if (head == null)  // if list is empty add in beginning.
    {
      head = newLink;
      return head;
    }
    while (last.next != null)  // Find the last node
      last = last.next;
    last.next = newLink;  // Add the node after the last node of list
    return head;
  }

  public static void traverse(LinkList first)
  {
    System.out.print("LINKEDLIST: ");
    LinkList temp = first;
    if (first != null)
    {
      // Keep printing nodes till we reach the first node again
      do
      {
        System.out.print(temp.data + " "); // print data
        temp = temp.next;
      }
      while (temp != first);
    }
  }
  public static void main(String[] args)
  {
    int t,n,m,x,y,i=0;
    Scanner s = new Scanner(System.in);
    t=Integer.parseInt(s.nextLine().trim());
    while(t>0)
    {
      LinkList head = null, t1, t2;
      n = s.nextInt();
      while(n>0)
      {
        m = s.nextInt();
        head = insertBeg(head, m);
        n--;
      }
      traverse(head);
      System.out.println();
      t1 = Result.listCut(head);
      traverse(head);
      System.out.println();
      traverse(t1);
      t--;
    }
  }
}
