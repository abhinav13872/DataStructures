package TREES;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class BinarySearchTree1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("Testcases: ");
int T=sc.nextInt();

while(T-->0)
{
BinarySearchTree1 BST=new BinarySearchTree1();
BSTNode root=null;

System.out.print("Enter the No. of Elements To Be Scanned: ");
int n=sc.nextInt();//No. of Elements
for(int i=0;i<n;i++)
root=BST.insert(root,sc.nextInt());//Scan Element To Be Inserted

System.out.print("PREORDER: ");
BST.PreOrder(root);
System.out.println();

System.out.print("INORDER: ");
BST.InOrder(root);
System.out.println();

System.out.print("POSTORDER: ");
BST.PostOrder(root);
System.out.println();

System.out.println("BFS(BREADTH FIRST SEARCH):- ");
BST.BFS(root);
}
}


public BSTNode insert(BSTNode root,int data)
{
if(root == null)
{
root=new BSTNode(data);
return root;
}

if(data <= root.data) root.left = insert(root.left,data);

if(data > root.data) root.right=insert(root.right,data);

return root;
}


public int height(BSTNode root)
{
if(root == null) return -1;
return 1 + Math.max(height(root.left),height(root.right));
}

public void PrintAtLevel(BSTNode root,int level)
{
if(root == null) return;
if(level == 0)
{
System.out.print(root.data+" ");
return;
}
PrintAtLevel(root.left,level-1);
PrintAtLevel(root.right,level-1);
}


public void PreOrder(BSTNode root)
{
if(root == null) return;

System.out.print(root.data+" ");
PreOrder(root.left);
PreOrder(root.right);
}


public void InOrder(BSTNode root)
{
if(root == null) return;

InOrder(root.left);
System.out.print(root.data+" ");
InOrder(root.right);
}


public void PostOrder(BSTNode root)
{
if(root == null) return;

PostOrder(root.left);
PostOrder(root.right);
System.out.print(root.data+" ");
}


public void BFS(BSTNode root)
{
if(root == null) return;
/*
int height=height(root);
for(int i=0;i<=height;i++)
{
PrintAtLevel(root,i);
System.out.println();
}
*/

Queue<BSTNode> q=new LinkedList<>();
q.add(root);

while(!q.isEmpty())
{
BSTNode temp=q.poll();
System.out.print(temp.data +" ");

if(temp.left != null) q.add(temp.left);
if(temp.right != null) q.add(temp.right);
}
System.out.println();
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
/*
DFS (DEPTH FIRST SEARCH)
1. PREORDER
2. INORDER
3. POSTORDER

BFS (BREADTH FIRST SEARCH)/LEVEL ORDER TRAVERSAL
*/

