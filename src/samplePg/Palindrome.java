package samplePg;

import java.util.Scanner;

public class Palindrome{
	public static void main(String args[])
	{
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int sum=0,r;
		int temp = m;
		while(m>0) {
			r=m%10;
			sum=(sum*10)+r;
			m=m/10;
				
		}
		if(temp==sum)
		System.out.println("the number is palindrome");
		else 
			System.out.println("the number is not palindrome");
		
		
		
	}
}