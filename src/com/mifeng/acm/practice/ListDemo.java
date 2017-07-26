package com.mifeng.acm.practice;

import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args){
		List<Integer> list = new LinkedList<Integer>();
//		list.get(index);
		list.add(1);
		list.add(1);
		list.add(2);
		System.out.println(list);
		
	}

}
