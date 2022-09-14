package samplePg;

import java.util.Scanner;

public class Armstrong{
	public static void main(String args[]) {
		System.out.println("enter a number ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p=0,temp,rem=0;
		temp = n;
		while(n>0)
		{
			 rem =n%10;
			p=p+(rem*rem*rem);
			n=n/10;
			
			
		}
		if(temp==p)
			System.out.println("the number is armstrong");
		else
			System.out.println("the number is not armstrong");
	}
	
}