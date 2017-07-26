package com.mifeng.acm.practice;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class PersonDemo {
	private class Person {
		public int id;
		public String name;
		@SuppressWarnings("unused")
		public Person(String name){
			//this.id = id;
			this.name = name;
		}
		public Person(int id,String name){
			this.id = id;
			this.name = name;
		}
//		@Override
//		public boolean equals(Object obj){
//			if(this.name == ((Person)obj).name)
//				return true;
//			else
//				return false;
//		}
		@Override
		public int hashCode(){
			//return this.id;
			return 20;
		}
	}
	@Test
	public void test(){
//		Person p1 = new Person(1,"mifeng");
//		Person p2 = new Person(2,"mifeng");
		Person p1 = new Person("mifeng");
		Person p2 = new Person("mifeng");
		//PersonDemo.Person p3 = new PersonDemo.Person();
		System.out.println(p1.equals(p2)?"p1和p2是同一个对象":"p1和p2是不同的对象");
		System.out.println(p1.hashCode()==p2.hashCode()?"p1和p2的hashcode相同":"p1和p2的hashcode不同");
		//System.out.println(p1 == p2?"p1和p2是同一个对象":"p1和p2是不同的对象");
		Map<Person,Integer> map = new HashMap<Person, Integer>();
		map.put(p1, 1);
		map.put(p2, 2);
		Integer num = map.get(new Person("mifeng"));
		System.out.println("num:"+num);
	}
}
