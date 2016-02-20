/*
 * MyStack
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

public class MyStack<AnyType> {
	
	//a stack contains a head node
	public MyNode<AnyType> head;
	
	//constructor
	public MyStack() {
		head = new MyNode<AnyType>();
		
	}	
	
	//method that checks if the stack is empty
	public boolean isEmpty() {
		
		if(head.next == null) {
			return true;
		}
		
		return false;
		
	}

	// insert method
	public void push(AnyType x) {
		
			MyNode<AnyType> temp = new MyNode<AnyType>();
		
			temp.data = x;
			temp.next = head.next;
			head.next = temp;
		
	}
	

	//deletion method
	public AnyType pop() {
		
		if(isEmpty() == true) {
			return null;
		}
		else {
			MyNode<AnyType> temp = new MyNode<AnyType>();
		
			temp.data = head.next.data;
			head.next = head.next.next;
		
			return temp.data;
		}	
	}

	//peek method returns the value of the top-most node
	public AnyType peek() {
		return head.next.data;
	}

	//print method calls the recursive print method in the MyNode class
	public void print() {
		
		head.next.print();
		
	}

}
