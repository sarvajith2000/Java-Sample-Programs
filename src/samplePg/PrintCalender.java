package samplePg;

import java.util.Scanner;

public class PrintCalender{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year");
		int year = sc.nextInt();
		System.out.println("enter the month number ");
		int month = sc.nextInt();
	
		printMonth(year,month);
	}
	public static boolean isLeapYear(int year)
	{
		return year%400==0||(year%4==0 && year%100!=0);
	}
	public static int getNumberOfDaysInMonth(int year,int month)
	{
		if(month ==1||month==3||month==5||month==7||month==8||month==10||month==12)
		{
			return 31;
		
		}
		if(month==4||month==6||month==9||month==11)
		{
			return 30;
		}
		if(month ==2)return isLeapYear(year)?29:28;
		return 0;
	}
	public static int getTotalNumberOfDays(int year,int month)
	{
		int total=0;
		for(int i=1800;i<year;i++)
		{
			if(isLeapYear(i))
				total = total+366;
			else
				total = total+365;
		}
		for(int i=1;i<month;i++)
			total = total+getNumberOfDaysInMonth(year,i);
		return total;
		}
	public static int getStartDay(int year,int month)
	{
		final int START_DAY_FOR_JAN_1_1800 = 3;
		int totalNumberOfDays = getTotalNumberOfDays(year,month);
		return (totalNumberOfDays+START_DAY_FOR_JAN_1_1800)%7;
		
	}
	public static void printMonthBody(int year, int month)
	{
		int startDay = getStartDay(year, month);
		int numberOfDaysInMonth = getNumberOfDaysInMonth(year,month);
		int i =0;
		for( i=0;i<startDay;i++)
			System.out.print("    ");
		for(i=1;i<=numberOfDaysInMonth;i++)
		{
			System.out.printf("%4d",i);
			if((i+startDay)%7==0)
				System.out.println();
		}
		System.out.println();
	}
	public static String getMonthName(int month)
	{
		String monthName = "";
		switch(month)
		{
		case 1:monthName = "january"; break;
		case 2:monthName = "february"; break;
		case 3:monthName = "march"; break;
		case 4:monthName = "april"; break;
		case 5:monthName = "may"; break;
		case 6:monthName = "june"; break;
		case 7:monthName = "july"; break;
		case 8:monthName = "august"; break;
		case 9:monthName = "september"; break;
		case 10:monthName = "october"; break;
		case 11:monthName = "november"; break;
		case 12:monthName = "december";
		
		
		}
		return monthName;
	}
	public static void printMonthTitle(int year,int month)
	{
		System.out.println("          "+getMonthName(month)+" "+year);
		System.out.println("----------------------------------");
		System.out.println(" sun mon tue wed thur fri sat");
	}
	public static void printMonth(int year, int month)
	{
		printMonthTitle(year,month);
		printMonthBody(year,month);
		
	}
	
		
	}
		
		
	
	
