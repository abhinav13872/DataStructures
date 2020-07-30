package BINARYTREE;
import java.util.*;
public class BinaryTree3
{
Node root;

public BinaryTree3()
{
this.root=null;
}

public BinaryTree3(int data)
{
this.root=new Node(data);
}

public static void main(String[] args)
{
BinaryTree3 bt1=new BinaryTree3(2);
bt1.root.left=new Node(3);
bt1.root.right=new Node(5);
bt1.root.left.right=new Node(9);
bt1.root.right.left=new Node(7);

BinaryTree3 bt2=new BinaryTree3(2);
bt2.root.right=new Node(3);
bt2.root.left=new Node(5);
bt2.root.left.right=new Node(7);
bt2.root.right.left=new Node(9);

BinaryTree3 bt3=new BinaryTree3(2);
bt3.root.left=new Node(3);
bt3.root.right=new Node(5);
bt3.root.left.right=new Node(9);
bt3.root.right.left=new Node(7);

BinaryTree3 bt4=new BinaryTree3(2);
bt4.root.left=new Node(3);
bt4.root.right=new Node(5);
bt4.root.left.left=new Node(9);
bt4.root.right.left=new Node(7);
//bt4.root.right.right=new Node(10);

//bt1.toMirror(bt1.root);//After this bt1 will be converted to its mirror
System.out.println("isIdentical: "+ bt1.isIdentical(bt1.root,bt3.root));
System.out.println("isMirror: "+ bt1.isMirror(bt1.root,bt3.root));
System.out.println("isSymmetric: "+ bt1.isSymmetric(bt1.root,bt3.root));
System.out.println("isIsoMorphic: "+ bt1.isIsoMorphic(bt1.root,bt4.root));
}


public boolean isIdentical(Node root1,Node root2)
{
if(root1 == null && root2 == null) return true;
if(root1 == null || root2 == null) return false;

return root1.data == root2.data
       && isIdentical(root1.left,root2.left)
       && isIdentical(root1.right,root2.right);
}


public boolean isMirror(Node root1,Node root2)
{
if(root1 == null && root2 == null) return true;
if(root1 == null || root2 == null) return false;

return root1.data == root2.data
       && isMirror(root1.left,root2.right)
       && isMirror(root1.right,root2.left);
}


public boolean isSymmetric(Node root1,Node root2)//SAME STRUCTURE
{
if(root1 == null && root2 == null) return true;
if(root1 == null || root2 == null) return false;

return isSymmetric(root1.left,root2.left)
       && isSymmetric(root1.right,root2.right);
}


public void toMirror(Node root)
{
if(root == null) return;

Node swap=root.left;
root.left=root.right;
root.right=swap;

toMirror(root.left);
toMirror(root.right);
}


public boolean isIsoMorphic(Node root1,Node root2)
{
if(root1 == null && root2 == null) return true;
if(root1 == null || root2 == null) return false;

return root1.data == root2.data
       && (isIsoMorphic(root1.left,root2.left)
       && isIsoMorphic(root1.right,root2.right)
       ||
       isIsoMorphic(root1.left,root2.right)
       && isIsoMorphic(root1.right,root2.left));
}
/*
To be IsoMorphic a Tree has to be:-
1.IDENTICAL
OR
2.MIRROR
*/
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
