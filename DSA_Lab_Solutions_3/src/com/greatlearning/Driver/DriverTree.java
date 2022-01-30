package com.greatlearning.Driver;

import java.util.ArrayList;

import com.greatlearning.Services.LongestPath;
import com.greatlearning.Services.Node;

public class DriverTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Node root = new Node (100);
		root.leftNode = new Node (20);
		root.rightNode = new Node (130);
		root.leftNode.leftNode = new Node (10);
		root.leftNode.rightNode = new Node (50);
		root.rightNode.leftNode = new Node (110);
		root.rightNode.rightNode = new Node (140);
		root.leftNode.leftNode.leftNode = new Node (5);
		
		ArrayList<Integer> List = LongestPath.longestPath(root);
		int size = List.size();
		
		System.out.print(List.get(size - 1));
		
		for (int i = size - 2; i >= 0 ; i--) 
		{
			System.out.print(" -> "+ List.get(i));
			
		}
	}

}
