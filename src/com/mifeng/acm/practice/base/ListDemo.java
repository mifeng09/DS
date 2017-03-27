package com.mifeng.acm.practice.base;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试List 提供的remove方法
 * @author 21405
 *
 */
public class ListDemo {
	
	public static void main(String[] args){
		
		//List list = new ArrayList();
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("feng");
		System.out.println(list);
		list.remove("java");
		System.out.println("after remove: " + list);
		
	}
	
	

}
