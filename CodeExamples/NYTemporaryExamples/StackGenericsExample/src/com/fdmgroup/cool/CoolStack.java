package com.fdmgroup.cool;

class Node<T>{
	
	T element;
	Node<T> next;
	
	Node(T element, Node<T> next){
		this.element = element;
		this.next = next;
	}
}


public class CoolStack<T> {

	 Node<T> topOfStack;


	 Node<T> push(T t){
		 
		 topOfStack = new Node<T>(t,topOfStack);
		 return topOfStack;
	 }
	 
	 Node<T> pop(){
		 
		 Node<T> top = topOfStack;
		 
		 if(topOfStack != null)
			 topOfStack = topOfStack.next;
				 
		 return top;		 
		 
	 }
	 

	 
	 void printStack(){
		 
		 if (topOfStack == null)
		 	return;
		 System.out.println("TOP: \n\t"+topOfStack.element);
		 
		 Node<T> iterator = topOfStack.next;
		 
		 while(iterator != null){
			 System.out.println("\t"+iterator.element);
			 iterator = iterator.next;
		 }
			 
	 }
	 
	 
	 public static void main(String[] args){
		 
		 CoolStack<String> cs = new CoolStack<String>();
		 
		 cs.push("hello");
		 cs.push("hi");
		 cs.push("hey");
		 cs.printStack();
		 
		 cs.pop();
		 cs.pop();
		 cs.printStack();
	 }
}



