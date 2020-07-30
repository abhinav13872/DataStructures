package BINARYSEARCHTREE;
public class BinarySearchTree
{
public static void main(String[] args)
{
BinarySearchTree BST=new BinarySearchTree();
BSTNode root=null;

System.out.println(BST.search(root,8));
root=BST.insert(root,8);
System.out.println(BST.search(root,8));
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


public boolean search(BSTNode root,int data)
{
if(root == null) return false;
if(data == root.data) return true;

if(data <= root.data)
{
return search(root.left,data);
}

if(data > root.data)
{
return search(root.right,data);
}
return false;
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
