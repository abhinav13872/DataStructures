package TREES;
import java.util.*;
public class BinaryTree
{
Node root;

BinaryTree()
{
root=null;
}


BinaryTree(int data)
{
this.root=new Node(data);
}


public static void main(String[] args)
{
BinaryTree bt=new BinaryTree(2);//root Node
bt.root.left=new Node(3);
bt.root.right=new Node(5);
bt.root.left.right=new Node(9);
bt.root.right.left=new Node(7);

System.out.println("Total No. of Nodes: "+ bt.CountNodes(bt.root));
System.out.println("Total No. of Leaf Nodes: "+ bt.CountOfLeafNodes(bt.root));
System.out.println("Height of Binary Tree: "+ bt.HeighOfTree(bt.root));
System.out.println("Sum of All Nodes: "+ bt.TreeSum(bt.root));
}


public int HeighOfTree(Node root)
{
if(root == null) return -1;//TERMINATING CONDITION
return 1 + Math.max(HeighOfTree(root.left),HeighOfTree(root.right));
}


public int CountOfLeafNodes(Node root)
{
if(root == null) return 0;//TERMINATING CONDITION
if(root.left == null  &&  root.right == null) return 1;//TERMINATING CONDITION 
return CountOfLeafNodes(root.left) + CountOfLeafNodes(root.right);
}


public int CountNodes(Node root)
{
if(root == null) return 0;//TERMINATING CONDITION
return 1 + CountNodes(root.left) + CountNodes(root.right);
}


public int TreeSum(Node root)
{
if(root == null) return 0;//TERMINATING CONDITION

return root.data + TreeSum(root.left) + TreeSum(root.right);
}
}

class Node
{
int data;
Node left;
Node right;
public Node(int data)
{
this.data=data;
this.left=null;
this.right=null;
}
}
