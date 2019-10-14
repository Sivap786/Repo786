package com.learn;

public class Node {

	// It has two attributes
	private String data; // To Store data into
	private Node next; // Reference to next node
	
	
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
