package samplePg;

import java.util.Scanner;

public class SwapNoTemp{
	public static void main(String args[])
	{
		System.out.println("enter two numbers");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("before swapping x = "+x+" before swapping y = "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("after swapping x = "+x+" after swapping y = "+y);
		
	}
}