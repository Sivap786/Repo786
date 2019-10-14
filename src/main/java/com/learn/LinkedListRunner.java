package com.learn;

public class LinkedListRunner {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.inssertElement("A");
		linkedList.inssertElement("B");
		linkedList.inssertElement("C");
		linkedList.inssertElement("D");
		linkedList.printLinkedList();
		linkedList.reverseLinkedList();
		System.out.println("After Reverse:");
		linkedList.printLinkedList();
	}

}
