package HEAPS;
public class Heap2
{
final int capacity=10;//SIZE_OF_AN_ARRAY
int size=0;//SIZE_OF_AN_ARRAY_AT_ANY_INSTATNT
int arr[]=new int[capacity];

//FUNCTIONS TO GET INDEX:-
int getParentIndex(int childIndex)
{return (childIndex-1)/2;}


int getLeftChildIndex(int ParentIndex)
{return (2*ParentIndex+1);}


int getRightChildIndex(int ParentIndex)
{return (2*ParentIndex+2);}


//FUNCTIONS TO GET ELEMENT AT INDEX:-
int getParent(int index)
{return arr[getParentIndex(index)];}


int getLeftChild(int index)
{return arr[getParentIndex(index)];}


int getRightChild(int index)
{return arr[getRightChildIndex(index)];}


//FUNCTIONS TO CHECK IF PARENT/CHILD EXISTS:-
boolean hasParent(int index)
{return (getParentIndex(index) >= 0);}


boolean hasLeftChild(int index)
{return (getLeftChildIndex(index) < size);}


boolean hasRightChild(int index)
{return (getRightChildIndex(index) < size);}


int peek()
{
if(size == 0)
{
System.out.println("#NO PEEK -> QUEUE IS EMPTY");
return -1;
}
return arr[0];
}


void add(int data)
{
arr[size++]=data;
heapifyUp();
}


void heapifyUp()
{
int index=size-1;//INDEX_OF_LAST_ELEMENT

while(hasParent(index) && getParent(index) > arr[index])
{
swap(getParentIndex(index),index);
index=getParentIndex(index);
}
}


void swap(int index1,int index2)
{
int temp=arr[index1];
arr[index1]=arr[index2];
arr[index2]=temp;
}


int poll()
{
if(size == 0)
{
System.out.println("#CAN'T DEQUEUE -> QUEUE IS EMPTY");
return -1;
}

int element=arr[0];//HIGHEST_PRIORITY_ELEMENT(ROOT)
arr[0]=arr[size-1];
heapifyDown();
size--;
return element;
}


void heapifyDown()
{
int index=0;//INDEX_OF_ROOT
while(hasLeftChild(index))
{
int INDEX=getLeftChildIndex(index);//SMALLER_CHILD_INDEX

if(hasRightChild(index) && getRightChild(index) < arr[INDEX] )
{
INDEX=getRightChildIndex(index);
}

//COMPARE ROOT WITH SMALLER CHILD:-
if(getParent(index) < arr[INDEX]) return;
swap(index,INDEX);
index=INDEX;
}
}


public static void main(String[] args)
{
Heap2 h=new Heap2();
h.add(15);
h.add(1);
h.add(2);
h.add(19);
h.add(18);
h.add(20);

System.out.println("PEEK: "+h.peek());
System.out.println("ELEMENT DEQUEUED: "+h.poll());
System.out.println("PEEK: "+h.peek());
System.out.println("ELEMENT DEQUEUED: "+h.poll());
System.out.println("PEEK: "+h.peek());
System.out.println("ELEMENT DEQUEUED: "+h.poll());
System.out.println("PEEK: "+h.peek());
System.out.println("ELEMENT DEQUEUED: "+h.poll());
System.out.println("PEEK: "+h.peek());
System.out.println("ELEMENT DEQUEUED: "+h.poll());
System.out.println("PEEK: "+h.peek());
System.out.println("ELEMENT DEQUEUED: "+h.poll());
System.out.println("PEEK: "+h.peek());
System.out.println("ELEMENT DEQUEUED: "+h.poll());
}
}
//INSERTION/DELETION IN MIN HEAP
