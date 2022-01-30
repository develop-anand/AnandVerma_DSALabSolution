package com.greatlearning.Services;

import java.util.ArrayList;

public class LongestPath {

	public static ArrayList<Integer> longestPath (Node root){
		
		if (root == null ) {
			
			ArrayList<Integer> List = new ArrayList<>();
			return List;
		}
		
		
		ArrayList<Integer> leftNode = longestPath(root.leftNode);
		
		ArrayList<Integer> rightNode = longestPath(root.rightNode);
		
		if (rightNode.size() < leftNode.size() ) 
		{
			
			leftNode.add(root.nodeData);
			
		}else 
		{
			rightNode.add(root.nodeData);
		}
		
		return (leftNode.size() > rightNode.size() ? leftNode : rightNode );
		
	}
	
	
	
}
