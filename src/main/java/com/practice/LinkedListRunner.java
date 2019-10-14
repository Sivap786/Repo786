package com.practice;

public class LinkedListRunner {

	public static void main(String args[]) {
		LinkedList linkedList = new LinkedList();
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		linkedList.add("D");
		linkedList.display();
	}
}


class Node{
	private String data;//To store data
	private Node next; //Next node object ref
	
	//Create setter and getter for the above fields
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}


class LinkedList {

	private Node head; //This is the first node
	
	public void add(String data){
		Node newNode = new Node();
		newNode.setData(data);
		newNode.setNext(null);
		//Check head node exist or not
		//if not newNode will be head node
		if(head == null){
			head = newNode;
		}else{
			//Means head node exists. Now we have to add 
			//newNode at the end of Linked List.
			//To find the last node we have to iterate
			//over the linked list
			Node lastNode = head;
			while(lastNode.getNext() != null){
				lastNode = lastNode.getNext();
			}
			lastNode.setNext(newNode);			
		}
	}
	
	public void display(){
		//Iterate over the linked list
		Node currentNode = head;//This is the starting point of the linked list
		while(currentNode != null){
			System.out.print(currentNode.getData()+"->");
			currentNode = currentNode.getNext();
		}
	}
}