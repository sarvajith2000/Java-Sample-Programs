package samplePg;

import java.util.Scanner;

public class Fibonacci{
	public static void main(String args[])
	{
		int n1=0,n2=1,n3,count,i;
		
		System.out.println("enter the count");
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();
		System.out.print(n1+" "+n2);
		for(i=2;i<count;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
}