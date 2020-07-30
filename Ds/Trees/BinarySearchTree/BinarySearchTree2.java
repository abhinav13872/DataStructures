package BINARYSEARCHTREE;
import java.util.Scanner;
public class BinarySearchTree2
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("Testcases: ");
int T=sc.nextInt();

while(T-->0)
{
BinarySearchTree2 BST=new BinarySearchTree2();
BSTNode root=null;

System.out.print("Enter the No. of Elements To Be Scanned: ");
int n=sc.nextInt();//No. of Elements
for(int i=0;i<n;i++)
root=BST.insert(root,sc.nextInt());//Scan Element To Be Inserted

System.out.println("Minimum Element: " + BST.min(root));
System.out.println("Minimum Element: " + BST.max(root));
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


public int min(BSTNode root)
{
if(root == null) System.exit(0);

while(root.left!=null)
root=root.left;

return root.data;
}


public int max(BSTNode root)
{
if(root == null) System.exit(0);

while(root.right!=null)
root=root.right;

return root.data;
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
MINIMUM ELEMENT => LEFTMOST DATA OF A BINARYSEARCHTREE
MAXIMUM ELEMENT => RIGHTMOST DATA OF A BINARYSEARCHTREE
*/
