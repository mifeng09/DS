package com.mifeng.acm.practice.base;

public class Node<E> {
	E item;
	Node<E> next;

	public Node(E e){
		this.item = e;
	}
	public static void main(String[] args){
		Node<String> note = new Node<String>("m1");
		Node<String> note2 = new Node<String>("m2");
		note.next = note2;
		int i = 1;
		Node<String> temp = new Node<String>("m0");
		Node<String> p = temp;
		while(true){
			if(i > 7){
				break;
			}
			
			Node<String> node = new Node<String>("node"+i);
			temp.next = node;
			temp = node;
			i = i + 1;
			
		}
		while(p.next !=null){
			System.out.println(p.item);
			p = p.next;
		}
	}

}
