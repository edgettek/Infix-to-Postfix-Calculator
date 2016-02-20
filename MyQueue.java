/*
 * MyQueue
 * 
 * Version 2.0
 * 
 * Copyright Kyle Edgette
 * 
 * Course : CSC 172 SPRING 2015
 * 
 * Assignment : Project 02
 * 
 * Author : Kyle Edgette
 * 
 * Lab Session : Monday/Wednesday 2pm-3:15pm
 * 
 * Lab TA : TJ Stein
 * 
 * Last Revised : March 8, 2015
 * 
 */

public class MyQueue<AnyType>{
	
	//a queue contains a head and tail
	public MyDoubleNode<AnyType> head;
	public MyDoubleNode<AnyType> tail;
	
	//constructor
	public MyQueue() {
		head = new MyDoubleNode<AnyType>();
		tail = new MyDoubleNode<AnyType>();
		head.next = tail;
		head.prev = null;
		tail.next = null;
		tail.prev = head;
	}
	
	//insert method
	public void enqueue(AnyType x) {
		
			MyDoubleNode<AnyType> temp = new MyDoubleNode<AnyType>();
		
			temp.data = x;
			temp.prev = tail.prev;
			temp.next = tail;
			(temp.prev).next = temp;
			(temp.next).prev = temp;
	}

	//deletion method
	public AnyType dequeue() {
		
		MyDoubleNode<AnyType> temp = new MyDoubleNode<AnyType>();
		
		if(isEmpty() == true) {
			return null;
		}
		else {
			temp.data = head.next.data;
			head.next = head.next.next;
			head.next.prev = head;
			
			return temp.data;
		}
	}

	//method that returns the value of the top-most node without deleting it
	public AnyType peek() {
		
		if(isEmpty() == true) {
			return null;
		}
		else {
			return head.next.data;
		}
	}

	//checks to see if the queue is empty
	public boolean isEmpty() {
		
		if(head.next == tail) {
			return true;
		}
		return false;
	}
	
	//print method that calls the print method in MyDoubleNode class
	public void print() {
		
		head.next.print();
		
	}

	
}
