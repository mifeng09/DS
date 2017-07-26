package com.mifeng.acm.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class HashDeomo {
	@Test
	public void test(){
		HashMap<String,String> map = new HashMap<String, String>();
		HashMap<Integer,String> map2 = new HashMap<Integer, String>();
		Map map3 = new HashMap();
		//map.g
		
		
		if(map.getClass() == map2.getClass()){
			System.out.println("两个Map的class是一样的");
		}else{
			System.out.println("两个Map的class是不同的");
		}
		List<String> list = new ArrayList<String>();
		List<Integer> list2 = new ArrayList<Integer>();
		if(list.getClass() == list2.getClass()){
			System.out.println("两个List的class是一样的");
		}else{
			System.out.println("两个List的class是不同的");
		}
		if(list.getClass() == map.getClass()){
			System.out.println("两个class是一样的");
		}else{
			System.out.println("两个class是不同的");
		}
		map.put("mi", "feng1");
	//	map.hashCode();
		//map.equals(o);
		//Object object = new Object();
		//object.equals(obj);
		//((Map)object).equals(obj)
		for(String string : map.keySet())
		   System.out.println("前面："+map.get(string));
		map.put("mi", "feng222");
		map.put("mis", "ssssssssss");
		for(String string : map.keySet())
			System.out.println("后面："+map.get(string));
		for(Map.Entry<String, String> entryset : map.entrySet()){
			System.out.println("key: "+entryset.getKey()+"value: "+entryset.getValue());
		}
		
	}

}
