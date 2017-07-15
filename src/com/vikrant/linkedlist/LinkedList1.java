package com.vikrant.linkedlist;

public class LinkedList1 {
	
	public static void main(String[] args) {
		LinkedList a = new LinkedList();
		a.addFromRight(10);
		a.addFromRight(20);
		a.addFromLeft(5);
		a.addAfterValue(11, 10);
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
		} else {
			addFirstNode(value);
		}
	}

	void addFirstNode(int value){
		head = new Node();
		head.data = value;
		next = head;
	}
	
	
	void addFromLeft(int value){
		if(head!=null){
			Node temp=head;
			head= new Node();
			head.data=value;
			head.address=temp;
		}else{
			addFirstNode(value);

		}
		
		
	}
	
	
	void addAfterValue(int value,int afterValue){
		if(head!=null){
			Node h1=head;
			while(h1!=null){
				if(h1.data==afterValue){
					Node temp=h1.address;
					Node newNode=new Node();
					newNode.data=value;
					newNode.address=temp;
					h1.address=newNode;
					break;
					
				}
				
				h1=h1.address;
			}
			
		}else{
			addFirstNode(value);

		}
	}
	
	
	
	
	String iterateList() {
		Node h1 = head;
		String ret = "[";
		while (h1 != null) {
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