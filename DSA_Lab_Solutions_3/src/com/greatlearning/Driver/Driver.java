package com.greatlearning.Driver;

import java.util.Scanner;

import com.greatlearning.Services.BalancingBrackets;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter the bracket values : ");
		
		String bracketExpression = obj.next();
		
		Boolean result;
		
		result = BalancingBrackets.checkBracketBalance(bracketExpression);
		
		if (result)
			System.out.println("The entered String has Balanced Brackets ");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets ");

	}

}
