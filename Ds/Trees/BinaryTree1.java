package TREES;
import java.util.*;
public class BinaryTree1
{
Node root;

BinaryTree1()
{
root=null;
}


BinaryTree1(int data)
{
this.root=new Node(data);
}


public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
BinaryTree1 bt=new BinaryTree1(2);//root Node
bt.root.left=new Node(3);
bt.root.right=new Node(5);
bt.root.left.right=new Node(9);
bt.root.right.left=new Node(7);

System.out.println("Height of Binary Tree: "+ bt.HeighOfTree(bt.root));

System.out.print("Scan Level: ");
int level=sc.nextInt();

System.out.println("ELEMENTS AT LEVEL "+ level +" are: ");
bt.PrintAtLevel(bt.root,level);
}


public int HeighOfTree(Node root)
{
if(root == null) return -1;//TERMINATING CONDITION
return 1 + Math.max(HeighOfTree(root.left),HeighOfTree(root.right));
}


public void PrintAtLevel(Node root,int level)
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
//PRINTING ELEMENTS AT PARTICULAR LEVEL
