package com.learn;

public class LinkedList {

	// Starting point of LinkedList
	private Node head;

	/*
	 * Insert Node and link to next node if head node not found then first node will
	 * be head node and next node ref object should be null
	 * 
	 * If head node  found we have traverse till the end node means nextNodeRef
	 * should be null then insert new Node
	 */
	public void inssertElement(String data) {
		Node newNode = new Node();
		// Add data and nextNodeRef to newNode
		newNode.setData(data);
		newNode.setNext(null);
		if (head == null) {
			head = newNode;
		} else {
			Node currentNode = head;
			while (currentNode.getNext() != null) {
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(newNode);
		}
	}

	public void printLinkedList() {
		Node n = head;// Start Iteration from Head
		while (n != null) {
			//Test
			System.out.print(n.getData() + "->");
			n = n.getNext();
		}
	}

	public void reverseLinkedList() {
		Node currentNode = head;// Start Iteration from head
		Node nextNode = head;
		Node prevNode = null;
		while (currentNode != null) {
			nextNode = currentNode.getNext();
			currentNode.setNext(prevNode);
			prevNode = currentNode;
			currentNode = nextNode;
		}
		head = prevNode;
		/*
		 * if(currentNode.getNext() == null) { System.out.print(currentNode.getData());
		 * }else { while(currentNode != null) { nextNode = currentNode.getNext();
		 * currentNode.setNext(prevNode); prevNode = currentNode; currentNode =
		 * nextNode; } head = prevNode; }
		 */
	}
}
