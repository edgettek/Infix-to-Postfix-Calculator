/*
 * MyDoubleNode
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

public class MyDoubleNode<AnyType> {
	
	//A Double Node contains a data element, a link to the next node, and a link to the previous node
	public AnyType data;
	public MyDoubleNode<AnyType> next;
	public MyDoubleNode<AnyType> prev;
	
	//constructor
	public MyDoubleNode() {
		data = null;
		next = null;
		prev = null;
	}
	
	//recursive printing method used for testing
	public void print() {
		if(this == null || this.data == null) {
			return;
		}
		else{
			System.out.print(data);
			this.next.print();
		}	
	}

}
