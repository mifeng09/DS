package com.mifeng.acm.practice;

import java.util.Stack;

/**
 * 设计一个特殊的栈，在实现栈的基本功能的基础上，再实现返回栈中最小元素的操作
 * @author 21405
 *
 */
public class SpecialStack {
	private Stack<Integer> stackData;
	private Stack<Integer> stackMin;
	
	public SpecialStack(){
		this.stackData = new Stack<Integer>();
		this.stackMin = new Stack<Integer>();
		
	}
	
	/**
	 * 入栈
	 * <p> stackData 用作普通的栈，stackMin用作存最小值的栈
	 * @throws Exception 
	 */
	public void push(int A) throws Exception{
		
		if(stackData.isEmpty() && stackMin.isEmpty()){
			stackData.push(A);
			stackMin.push(A);
		}else{
			if(A < getMin()){
				stackMin.push(A);
				stackData.push(A);
			}else{
				stackData.push(A);
			}
		}
		
		
	}
  /**
   * 出栈	
 * @throws Exception 
   */
	public int pop() throws Exception{
		if(stackData.peek() == getMin()){
			 stackMin.pop();
			
		}
		return stackData.pop();
	}
	
	/**
	 * 获取最小值
	 * @throws Exception 
	 */
	public int getMin() throws Exception{
		if(this.stackMin.isEmpty()){
			throw new Exception("Stack is empty");
		}
		return stackMin.peek();
	}
	

}
