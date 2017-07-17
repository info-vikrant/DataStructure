package com.vikrant.tree;

/*A tree whose elements have at most 2 children is called a binary tree. 
 * Since each element in a binary tree can have only 2 children, 
 * we typically name them the left and right child.
 */

/*
 * IN-ORDER   : left root right
 * Pre-Order  : root left right
 * Post:Order : left right root
 * 
 * 
 * 
 *
 */


class Node
{
    int key;
    Node left, right;
 
    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}

public class BinaryTree {

	static Node root;
	public static void main(String[] args) {
		insert(1);
		insert(2);
		insert(3);
		insert(4);
		insert(5);

		System.out.println(root.key);
		printPreorder(root);
	}
	
	
	static void insert(int key){
		root=insertrecursively(key,root);
	}
	
	static private Node insertrecursively(int key, Node root) {
		if (root == null) {
			root = new Node(key);
			return root;
		} else {

			if (root.key >key)
				root.left = insertrecursively(key, root.left);
			else
				root.right = insertrecursively(key, root.right);

			return root;
		}
	}

/*	static void add(int value) {
		if (root == null) {
			Node newNode = new Node(value);
			root=newNode;
			System.out.println(newNode);
		} else {
			Node temp = root;
			while (temp != null) {
				if (temp.left == null) {
					Node newNode = new Node(value);
					temp.left = newNode;
					temp=null;
				}
			}
		}
	}*/
	
	static void traverse(){
		Node temp=root;
		while(root!=null){
			
		}
	}
	  static void  printPostorder(Node node)
	    {
	        if (node == null)
	            return;
	 	    // first recur on left subtree
	        printPostorder(node.left);
	        // then recur on right subtree
	        printPostorder(node.right);
	        // now deal with the node
	        System.out.print(node.key + " ");
	    }
	
	  static void  printINorder(Node node)
	    {
	        if (node == null)
	            return;
	 	    // first recur on left subtree
	        printINorder(node.left);
	        // then recur on right subtree
	        System.out.print(node.key + " ");

	        printINorder(node.right);
	        // now deal with the node
	    }
	
	  static void  printPreorder(Node node)
	    {
	        if (node == null)
	            return;
	        System.out.print(node.key + " ");

	 	    // first recur on left subtree
	        printPreorder(node.left);
	        // then recur on right subtree

	        printPreorder(node.right);
	        // now deal with the node
	    }
	  
}
