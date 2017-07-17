package com.vikrant.tree;
/*A tree whose elements have at most 2 children is called a binary tree. 
 * Since each element in a binary tree can have only 2 children, 
 * we typically name them the left and right child.
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
		insert(5);
		insert(6);
		insert(8);
System.out.println(root.key);
		printPostorder(root);
	}
	
	
	static void insert(int key){
		root=insertrecursively(key,root);
	}
	
	
	
	static private Node insertrecursively(int key, Node root) {
		if (root == null) {
			root = new Node(key);
			return root;
		} else {

			if (root.key < key)
				root.left = insertrecursively(key, root.left);
			else
				root.right = insertrecursively(key, root.right);

			return root;
		}
	}


	static void add(int value) {
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

	}
	
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
	
}
