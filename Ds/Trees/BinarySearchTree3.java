package TREES;
import java.util.Scanner;
public class BinarySearchTree3
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
BinarySearchTree3 BST=new BinarySearchTree3();
BSTNode root=null;

System.out.print("ENTER THE NO. OF ELEMENTS TO BE SCANNED: ");
int n=sc.nextInt();

System.out.print("SCAN ELEMENTS: ");
for(int i=0;i<n;i++)
root=BST.insert(root,sc.nextInt());

System.out.println("LEVEL ORDER TRAVERSAL OF A TREE:- ");
BST.BFS(root);

System.out.print("SCAN AN ELEMENT TO BE REMOVED: ");
root=BST.deleteNode(root,sc.nextInt());

System.out.println("LEVEL ORDER TRAVERSAL OF A TREE:- ");
BST.BFS(root);
}


public int min(BSTNode root)
{
while(root.left != null) root=root.left;
return root.data;
}


public int max(BSTNode root)
{
while(root.right != null) root=root.right;
return root.data;
}


public BSTNode deleteNode(BSTNode root,int data)
{
if(data < root.data && data >= min(root))
{
root.left=deleteNode(root.left,data);//UPDATING REFERANCE
}

if(data > root.data && data <= max(root))
{
root.right=deleteNode(root.right,data);//UPDATING REFERANCE
}

if(data == root.data)
{
/*
IF THE NODE TO BE DELETED HAS NO CHILD OR A SINGLE CHILD:-
*/
if(root.left == null) return root.right;
if(root.right == null) return root.left;
/*
IF THE NODE TO BE DELETED  HAS TWO CHILD:-
*/
root.data=min(root.right);
root.right=deleteNode(root.right,root.data);
}
return root;
}


public BSTNode insert(BSTNode root,int data)
{
if(root == null) return new BSTNode(data);//ROOT INITIALIZATION

if(data <= root.data) root.left=insert(root.left,data);//LINKING PREVIOUS NODE

if(data > root.data) root.right=insert(root.right,data);//LINKING PREVIOUS NODE

return root;
}


public int height(BSTNode root)
{
if(root == null) return -1;
return 1+Math.max(height(root.left),height(root.right));
}


public void PrintAtLevel(BSTNode root,int level)
{
if(root == null) return;
if(level == 0)
{
System.out.print(root.data +" ");
return;
}
PrintAtLevel(root.left,level-1);
PrintAtLevel(root.right,level-1);
}


public void BFS(BSTNode root)
{
int h=height(root);

for(int i=0;i<=h;i++)
{
PrintAtLevel(root,i);
System.out.println();
}
}
}

class BSTNode
{
int data;
BSTNode left;
BSTNode right;

public BSTNode(int data)
{
this.data=data;
this.left=null;
this.right=null;
}
}
//DELETION OF NODE IN BINARY SEARCH TREE(BST)
