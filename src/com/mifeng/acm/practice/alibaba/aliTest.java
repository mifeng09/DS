package com.mifeng.acm.practice.alibaba;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class aliTest {

    public static void main(String[] args) {

        ArrayList<Integer> inputs = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        if(line != null && !line.isEmpty()) {
            int res = resolve(line.trim());
            System.out.println(String.valueOf(res));
        }
    }

    // write your code here
    public static int resolve(String expr) {
	           char[]exp = expr.toCharArray();
	           Stack<Integer> stack = new Stack<Integer>();
	           int result = 0;
	           for(int i = 0; i<exp.length; i++){
	           // stack.
	             if(Character.isDigit(exp[i])){
                       if(stack.size() == stack.capacity()){
                          return -2 ;
                        }
	               stack.push(Integer.parseInt(String.valueOf(exp[i])));
	               
	             }
	             else if(exp[i] == '*' || exp[i] == '+'){
                       if(stack.isEmpty()){
                          return -1 ;
                        }
	              int paramA = stack.pop();
	              int paramB = stack.pop();
	              
	              if(exp[i]=='*'){
	                result = paramA * paramB;
	               }else if(exp[i]=='+'){
	                result = paramA + paramB;
	               }
	              if(stack.size() == stack.capacity()){
                      return -2 ;
                    }
	               stack.push(result);
	              
	             }
	             else if(exp[i]=='^'){
                      if(stack.isEmpty()){
                          return -1 ;
                        }
	              int m = stack.pop();
	              m = m + 1 ;
	              if(stack.size() == stack.capacity()){
                      return -2 ;
                    }
	              stack.push(m);
	             }
	           }
	           return result;
	        }
}