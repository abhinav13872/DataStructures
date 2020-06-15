package TREES;
import java.util.Scanner;
public class BinaryTree4
{
Node root;

public BinaryTree4()
{
this.root=null;
}

public BinaryTree4(int data)
{
this.root=new Node(data);
}

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
BinaryTree4 bt=new BinaryTree4(1);
bt.root.left=new Node(2);
bt.root.right=new Node(3);
bt.root.left.left=new Node(4);
bt.root.left.right=new Node(5);
bt.root.right.left=new Node(6);
bt.root.right.right=new Node(7);

System.out.println("Height of Tree: "+bt.height(bt.root));

System.out.println("BFS(BREADTH FIRST SEARCH):- ");
bt.BFS(bt.root);

System.out.print("ENTER THE VALUE OF TWO NODES: ");
System.out.println((bt.findLCA(bt.root,sc.nextInt(),sc.nextInt())).data);

}


public Node findLCA(Node root,int n1,int n2)
{
if(root == null) return null;
if(root.data == n1 || root.data == n2) return root;
/*
ASSUMPTION => BOTH N1 AND N2 ARE EXISTING IN A BINARY TREE!!
*/
Node left_LCA=findLCA(root.left,n1,n2);
Node right_LCA=findLCA(root.right,n1,n2);

if(left_LCA != null && right_LCA != null) return root;
if(left_LCA != null) return left_LCA;
return right_LCA;
}


public int height(Node root)
{
if(root == null) return -1;
return 1 + Math.max(height(root.left),height(root.right));
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


public void BFS(Node root)
{
int height=height(root);
for(int i=0;i<=height;i++)
{
PrintAtLevel(root,i);
System.out.println();
}
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
/*
LOWEST COMMON ANCESTOR IN A BINARY TREE
*/
