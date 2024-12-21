package com.tree;


class Node
{
	int data;
	Node left;
	Node right;
	
	public Node(int data) 
	{
		this.data = data;
	}
}

class MyBinaryTree
{
	Node root;
	
	public void insert(int data) {
		
		root = insertRec(root,data);
		
	}
	
	public Node insertRec(Node root, int data) 
	{
		if (root == null)
			root = new Node(data);
		else if (data < root.data)
			root.left = insertRec(root.left,data);
		else if (data > root.data)
			root.right = insertRec(root.right,data);
		
		return root;
	}
	
	public void printTree() 
	{
		inorderRec(root); //In ascending order i.e. sorted
		//postorderRec(root);
		//preorderRec(root);
	}
	
	public void inorderRec(Node root) 
	{
		if (root !=null) 
		{
			inorderRec(root.left);
			System.out.print(root.data + " ");
			inorderRec(root.right);
		}
	}
	
	public void preorderRec(Node root) 
	{
		if (root !=null) 
		{
			System.out.print(root.data + " ");
			inorderRec(root.left);
			inorderRec(root.right);
		}
	}
	
	public void postorderRec(Node root) 
	{
		if (root !=null) 
		{
			inorderRec(root.left);
			inorderRec(root.right);
			System.out.print(root.data + " ");
		}
	}
	
}

public class BinaryTree {

	//A tree which has a root node with either 0 or 1 or 2 children
	
	
	/*
	 * Tree Traversal
	 * Inorder - print left root right
	 * Preorder - print root left right
	 * Postorder - print left right root
	 * */
	public static void main(String[] args) {
		
		MyBinaryTree myTree = new MyBinaryTree();
		myTree.insert(8);
		myTree.insert(18);
		myTree.insert(22);
		myTree.insert(20);
		myTree.insert(10);
		myTree.insert(1);
		
		myTree.printTree();
	}

}
