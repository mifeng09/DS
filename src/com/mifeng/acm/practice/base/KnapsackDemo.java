package com.mifeng.acm.practice.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * 有n个物品，第i(1<=i<=n)个物品的价值为Vi,重量为Wi,背包容量为sackWeight,考虑<b>如何选择装入背包的物品</b>，
 * 使得装入背包的物品的<b>总价值最大</b>。
 * 选择放入物品到背包，此时记作 Xi = 1,否则记 Xi = 0;则经过若干选择后形成行向量(X1, X2, X3, X4, ...Xi, ...)
 * 假设放入第i个物品，放入后达到总价值最大，
 * C[i,j]表示背包重量为j,现有i个物品装入包中，物品编号依次是1，2，3，4，5，6...i...,从i个物品中选择，使得背包中物品的价值最大
 * 当j==0时候，i个物品中一个都不能选择
 * 当j==1时候，
 * <b>难点在于如何用编码表示选择第i个物品放入背包，放入与不放入怎么用代码体现</b>
 * 用totalSize表示物品个数
 */

/**
 * 
 * knapsack类表示背包
 *
 */
class Item{
	
	private int weight;//wu
	private int value;
	
	public Item(int weight, int value){
		this.weight = weight;
		this.value = value;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	@Override
	public String toString(){
		return "Item[weight=" + weight + ", value=" + value + "]";
	}
	
}

public class KnapsackDemo {
	
	@Test
	public void test(){
		//int itemSize = 5;//有5个物品
		int sackWeight = 17;//背包可以接受的总重量是16
		List<Item> items = new ArrayList<Item>();
		items.add(new Item(1, 1));
		items.add(new Item(1, 2));
		items.add(new Item(2, 2));
		items.add(new Item(4, 10));
		items.add(new Item(12, 4));
		
//		items.add(new Item(3, 4));
//		items.add(new Item(4, 5));
//		items.add(new Item(7, 10));
//		//items.add(new Item(4, 10));
//		items.add(new Item(8, 11));
//		items.add(new Item(9, 13));
		//int[] w = 
		//Item[] item
		//int values1 = solve( sackWeight, items);
		int values2 = solve2( sackWeight, items);
		//System.out.println("this is values1" + values1);
		System.out.println("this is values2" + values2);
		
		//
	}
	
	public int solve(int sackWeight, List<Item> items){
		int itemSize = items.size();
		//定义一个二维数组
		int [][] c = new int[itemSize + 1][sackWeight + 1];
		int totalValue = 0;
//		while(true){
//			
//		}
//		while(true){
//			
//		}
		for(int i = 0; i <= items.size(); i++){
			Item item = items.get(i);
			int weight = item.getWeight();
			int value = item.getValue();
			
			for(int j = 0; j<= sackWeight ; j++){
				
				if(i==0 || j==0){
				//if(j==0){
					c[i][j] = 0;
					totalValue = c[i][j] = 0;
					//return totalValue;
					// System.out.println(0);
					System.out.println("i="+i+", c["+i+"]["+j+"] =" + c[i][j]);
				}else{
					
				 	 //if(weight > j & i>= 1){
			    	if(weight > j ){
			    		 //标号为i的物品不放人背包，且此时背包中的物品的价值总和达到最大
			    		 //还有一种情况是重量超了，放不下该物品
			        	// c[i][j] = c[i-1][j]; //重量超了，放不下该物品
			        	 c[i][j] = c[i-1][j]; 
			        	 totalValue =  c[i][j];
			        	 System.out.println("i="+i+", c["+i+"]["+j+"] =" + c[i][j]);
			        	// System.out.println(c[i][j]);
			        	// return totalValue;
			    	 }else{
			        		//标号为i的物品不放人背包，且此时背包中的物品的价值总和达到最大
			            	// c[i][j] = c[i-1][j];
			        		 //标号为i的物品放入背包
			            	// c[i][j] = c[i-1][(sackWeight - w[i])] + v[j];
			            	 c[i][j] = Math.max(c[i-1][(j - weight)] + value, c[i-1][j]);
			            	 //if()
			            	 if(c[i][j] > c[i-1][j]){
			            		 System.out.println("choose"+ i);
			            	 }
			            	 
			            	 
			            	 System.out.println("i="+i+", c["+i+"]["+j+"] =" + c[i][j]);
			    	 }
			    	 totalValue = c[i][j];
				}
		   
		     }
			//return totalValue;
		}
		return totalValue;
	}
	
	 public int solve2(int sackWeight, List<Item> items) {
		 int itemSize = items.size();
		 int [][] bestValues = new int[itemSize + 1][sackWeight + 1];
			int bestValue = 0;
	        // 遍历背包的承重
	        for (int j = 0; j <= sackWeight; j++) {
	            // 遍历指定物品
	            for (int i = 0; i <= itemSize; i++) {
	                // 当背包不放入物品或承重为0时，其最大价值均为0
	                if (i == 0 || j == 0) {
	                    bestValues[i][j] = 0;
	                } else {
	                    // 如果第 i个物品重量大于总承重，则最优解存在于前 i-1 个背包中
	                    if (j < items.get(i-1).getWeight()) {
	                        bestValues[i][j] = bestValues[i - 1][j];
	                    } else {
	                        // 如果第 i个物品不大于总承重，则最优解要么是包含第 i个背包的最优解，
	                        // 要么是不包含第 i个背包的最优解， 取两者最大值
	                       // int weight = bags[i - 1].getWeight();
	                        int weight = items.get(i-1).getWeight();
	                        int value = items.get(i-1).getValue();
	                        bestValues[i][j] = Math.max(bestValues[i - 1][j], value
	                                + bestValues[i - 1][j - weight]);
	                    }
	                }
	            }
	        }

	        return bestValue = bestValues[itemSize][sackWeight];
	    }

//	    public int getBestValue() {
//	        return bestValue;
//	    }
}
