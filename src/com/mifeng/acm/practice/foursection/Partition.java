package com.mifeng.acm.practice.foursection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;



public class Partition {
	int n = 10;
	public static void main(String[] args){
		
		int n = 10;
		//定义数组
		int [] A = new int[n];
		List<Integer> B = new ArrayList<Integer>();
	    B = (List) Arrays.asList(A);
	    //remove 3个数
	    Random random = new Random();
	    for(int i = 0; i<3; i++){
	    	B.remove(random.nextInt(n));
	    }
	  
	}
	 public Boolean isPartioned(int[] array){
		 Boolean status = false;
		 while(true){
			 
			status = true; break;
		 }
		 return status;
	  }
	 public int sum(List<Integer> list){
		 int sum = 0;
    	 for(int i=0; i <list.size(); i++){
 	    	sum = sum + list.get(i);
 	    }
    	 return sum;
    }
	public List remove(List list){
		Random random = new Random();
	    for(int i = 0; i<3; i++){
	    	list.remove(random.nextInt(n));
	    }
	    return list;
	}

}
