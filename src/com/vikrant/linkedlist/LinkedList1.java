package com.vikrant.linkedlist;

public class LinkedList1 {
	
	public static void main(String[] args) {
		LinkedList a = new LinkedList();
		a.addFromRight(10);
		a.addFromRight(20);
		System.out.println(a);		
	}

}




class Node
{
	int data;
	Node address;
	@Override
	public String toString() {
		return "Node [data=" + data + ", address=" + address + "]";
	}
	
}

class LinkedList
{
	Node head;
	Node next;
	
	
	
	
	void addFromRight(int value) {
		if (head != null) {
			next = new Node();
			next.data = value;
			head.address = next;
			//System.out.println("next :"+next);

		} else {
			head = new Node();
			head.data = value;
			next = head;
			//System.out.println("head :"+head);
		}
	}

	
	
	
	void addFromLeft(int value){
		
	}
	
	String iterateList() {
		Node h1 = head;
		String ret = "[";
		while (h1 != null) {
			//System.out.println(h1.data);
			ret = ret + h1.data + ",";
			h1 = h1.address;
		}
		ret = ret + "]";
		ret = ret.replaceAll(",]", "]");
		return ret;
	}
	
	public String toString() {
		return iterateList();
	}

}