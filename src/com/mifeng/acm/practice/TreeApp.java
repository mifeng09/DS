package com.mifeng.acm.practice;

import java.util.Scanner;
import java.util.Stack;

class Node {
	public int element;
	public Node left;
	public Node right;
}

class BiTree {
	Node root;

	public BiTree() {
		this.root = null;
	}
}

public class TreeApp {

	/**
	 * 创建tree
	 */
	public static Node create(Node node) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入节点的值：");
		int value = in.nextInt();

		if (value != 0) {
			node = new Node();
			node.element = value;
			node.left = create(node.left);
			node.right = create(node.right);
		} else {
			// node.left = null;
			// node.right = null;
			node = null;
		}
		return node;
	}
    //pub
	 
	public static void main(String[] args) {
//		BiTree tree = new BiTree();
//		tree.root = create(tree.root);
//		System.out.println(tree.root);
//		System.out.println(tree.root.element);
//		System.out.println(tree.root.right.element);
//		String ch = "2";
//		Integer.parseInt(ch.toString());
//		System.out.println(Integer.valueOf("2"));
		int we = Integer.valueOf("we");
		//Character.isDigit(ch);
		 Stack<Integer> stack = new Stack<Integer>();
         int pop1 = stack.pop();
		System.out.println(we);
		//stack.isEmpty()
	}

}
