package com.bridgeLabz;

import java.util.Scanner;

public class LineComparision {
	static int x1;
	static int x2;
	static int x3;
	static int x4;
	static int y1;
	static int y2;
	static int y3;
	static int y4;
	 static void checkEquality(){
	     double length = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
	     Double length2 = Math.sqrt((Math.pow((x4 - x3), 2)) + (Math.pow((y4 - y3), 2)));
	     System.out.println("Length of second line is: " + length2);
	     System.out.println("Length of Line between two points: " + length);
	     int result = length2.compareTo(length);

	     if (result == 0) {
	         System.out.println("\nLines are equal");
	     } else if (result > 0) {
	         System.out.println("\nLine 2 is greater than line 1");
	     } else {
	         System.out.println("\nline 1 is greater than line 2");
	     }

		
	}
		public static void main(String[ ] args) {

	System.out.println("Welcome to LineComparision");
	 Scanner sc = new Scanner(System.in);
     System.out.println("Enter point x1: ");
      x1 = sc.nextInt();
     System.out.println("Enter point y1: ");
      y1 = sc.nextInt();
     System.out.println("Enter point x2: ");
      x2 = sc.nextInt();
     System.out.println("Enter point y2: ");
      y2 = sc.nextInt();
     System.out.println("\nEnter points for second line:");
     System.out.println("Enter point x3: ");
      x3 = sc.nextInt();
     System.out.println("Enter point y3: ");
      y3 = sc.nextInt();
     System.out.println("Enter point x4: ");
      x4 = sc.nextInt();
     System.out.println("Enter point y4: ");
      y4 = sc.nextInt();
   checkEquality();
    
}
}
