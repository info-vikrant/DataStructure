package com.vikrant.linkedlist;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class LinkedList1 {

	public static void main(String[] args) {

		CustomLinkedList a = new CustomLinkedList();
		a.add(10);
		a.add(20);
		a.add(22);
		a.addFromLeft(5);
		a.addAfterValue(11, 10);
		a.addAfterValue(21, 21);
		a.delete(10);
		a.delete(20);
		//a.delete(22);
	//	a.delete(11);
	//	a.delete(5);
		//a.delete(21);
		System.out.println(a);

		System.out.println(a.findnthelementFromStart(7));
		System.out.println("size of list : " + a.size());
	}

	@Test
	public void Test() {
		CustomLinkedList a = new CustomLinkedList();
		a.add(10);
		a.add(20);
		a.add(22);
		a.addFromLeft(5);
		a.addAfterValue(11, 10);
		a.addAfterValue(21, 21);
		a.delete(10);
		a.delete(20);
		a.delete(22);
		a.delete(11);
		a.delete(5);
		System.out.println(a);
		assertEquals(a.toString(), "[21]");
	}

}

class Node {
	int data;
	Node address;

	@Override
	public String toString() {
		return "Node [data=" + data + ", address=" + address + "]";
	}

}

class CustomLinkedList {
	Node head;
	Node next;

	void add(int value) {
		if (head != null) {
			Node newNode = new Node();

			newNode.data = value;
			next.address = newNode;
			next = newNode;
		} else {
			addFirstNode(value);
		}
	}

	void addFirstNode(int value) {
		head = new Node();
		head.data = value;
		next = head;
	}

	void addFromLeft(int value) {
		if (head != null) {
			Node temp = head;
			head = new Node();
			head.data = value;
			head.address = temp;
		} else {
			addFirstNode(value);

		}

	}

	void addAfterValue(int value, int afterValue) {
		if (head != null) {
			Node h1 = head;
			boolean isInserted = false;
			while (h1 != null) {
				if (h1.data == afterValue) {
					Node temp = h1.address;
					Node newNode = new Node();
					newNode.data = value;
					newNode.address = temp;
					h1.address = newNode;
					isInserted = true;
					break;

				}

				h1 = h1.address;
			}
			if (!isInserted) {
				//System.out.println("After Value Not present in list so adding at Last");
				add(value);

			}

		} else {
			addFirstNode(value);

		}
	}

	int size() {
		int count = 0;
		if (head != null) {
			while (head != null) {
				count++;
				head = head.address;
			}
		}

		return count;
	}

	String findnthelementFromStart(int n) {
		String data = "No data on " + n + "th Node";
		int count = 0;
		Node temp = head;
		while (temp != null) {
			count++;
			if (n == count) {
				return temp.data + "";
			}
			temp = temp.address;
		}

		return data;

	}

	void delete(int value) {
		Node temp = head;
		Node oneahead = head.address;
		while (temp != null) {

			if (oneahead == null) {
				if (temp.data == value) {
					head = null;
					return;
				}
				return;
			}
			if (oneahead.data == value) {
				temp.address = oneahead.address;
				return;

			}
			if (temp.data == value) {

				head = oneahead;
				return;
			}
			temp = temp.address;
			oneahead = oneahead.address;

		}
	}

	String iterateList() {
		Node h1 = head;
		String ret = "[";
		String ret2 = "";

		while (h1 != null) {
			ret = ret + h1.data + ",";
			ret2 = ret2 + h1 + ",";

			h1 = h1.address;
		}
		//System.out.println(ret2);
		ret = ret + "]";
		ret = ret.replaceAll(",]", "]");
		return ret;
	}

	public String toString() {
		return iterateList();
	}

}