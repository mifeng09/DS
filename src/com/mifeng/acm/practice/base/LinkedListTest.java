package com.mifeng.acm.practice.base;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args){
		LinkedList<String> list = new LinkedList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		System.out.println("链表的第一个元素："+ list.getFirst());
		System.out.println("链表最后一个元素："+ list.getLast());
		System.out.println("开始遍历：");
		for(String str: list){
			System.out.println(str);
		}
		System.out.println("使用第二种方法开始遍历：");
		LinkedList<String> p = list;
		//for(p.)
		
	}
	
}
