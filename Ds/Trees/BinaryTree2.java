package TREES;
public class BinaryTree2
{
Node root;

public BinaryTree2()
{
this.root=null;
}

public BinaryTree2(int data)
{
this.root=new Node(data);
}

public static void main(String[] args)
{
BinaryTree2 bt=new BinaryTree2(2);
bt.root.left=new Node(3);
bt.root.right=new Node(5);
bt.root.left.right=new Node(9);
bt.root.right.left=new Node(7);

System.out.println("Height of Tree: "+bt.height(bt.root));

System.out.print("PREORDER: ");
bt.PreOrder(bt.root);
System.out.println();

System.out.print("INORDER: ");
bt.InOrder(bt.root);
System.out.println();

System.out.print("POSTORDER: ");
bt.PostOrder(bt.root);
System.out.println();

System.out.println("BFS(BREADTH FIRST SEARCH):- ");
bt.BFS(bt.root);
}


public int height(Node root)
{
if(root == null) return -1;
return 1 + Math.max(height(root.left),height(root.right));
}


public void PreOrder(Node root)
{
if(root == null) return;

System.out.print(root.data+" ");
PreOrder(root.left);
PreOrder(root.right);
}


public void InOrder(Node root)
{
if(root == null) return;

InOrder(root.left);
System.out.print(root.data+" ");
InOrder(root.right);
}


public void PostOrder(Node root)
{
if(root == null) return;

PostOrder(root.left);
PostOrder(root.right);
System.out.print(root.data+" ");
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
DFS (DEPTH FIRST SEARCH)
1. PREORDER
2. INORDER
3. POSTORDER

BFS (BREADTH FIRST SEARCH)/LEVEL ORDER TRAVERSAL
*/
