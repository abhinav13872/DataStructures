package TREES;
import java.util.Scanner;
public class BinarySearchTree4
{

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
BinarySearchTree4 BST=new BinarySearchTree4();
BSTNode root=null;

System.out.print("ENTER THE NO. OF ELEMENTS TO BE SCANNED: ");
int n=sc.nextInt();

System.out.print("SCAN ELEMENTS: ");
for(int i=0;i<n;i++)
root=BST.insert(root,sc.nextInt());

System.out.println("LEVEL ORDER TRAVERSAL OF A TREE:- ");
BST.BFS(root);

System.out.print("ENTER NODES TO GET THEIR ANCESTOR: ");
System.out.println("ANCESTOR IS: "+ (BST.findLCA(root,sc.nextInt(),sc.nextInt())).data);
}


public BSTNode findLCA(BSTNode root,int n1,int n2)
{
if(root == null) return null;
if(root.data == n1 || root.data == n2) return root;

if(n1 < root.data && n2 < root.data) return findLCA(root.left,n1,n2);

if(n1 > root.data && n2 > root.data) return findLCA(root.right,n1,n2);

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
//LOWEST COMMON ANCESTOR IN BINARY SEARCH TREE(BST)
