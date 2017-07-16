package com.vikrant.linkedlist;

public class DetectLoopInLinkedList {

	public static void main(String[] args) {
		CustomLinkedList ll = new CustomLinkedList();

		ll.add(10);
		ll.add(13);
		ll.add(7);
		ll.next.address = ll.head;
		System.out.println(isLoop(ll));
	}

	static boolean isLoop(CustomLinkedList ll) {

		Node head = ll.head;
		Node headx2 = ll.head;
		int count = 0;
		while (head != null && headx2 != null) {

			if (head == headx2) {
				count++;
				if (count == 2) {
					return true;
				}

			}
			head = head.address;
			if (headx2.address != null) {
				headx2 = headx2.address.address;
			} else {
				headx2 = null;
			}

		}

		return false;

	}

}
