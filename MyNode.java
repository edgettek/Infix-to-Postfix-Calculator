/*
 * MyNode
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

public class MyNode<AnyType> {
	
	//A singly linked node contains a data element, and a link to the next node
	public AnyType data;
	public MyNode<AnyType> next;

	//constructor
	public MyNode() {
		data = null;
		next = null;
	}
	
	//recursive printing method used for testing
	public void print() {
		if(this == null || this.data == null) {
			return;
		}
		else{
			System.out.print(data);
			if(this.next != null) {
				this.next.print();
			}
		}	
	}

}
