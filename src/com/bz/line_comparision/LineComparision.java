package com.bz.line_comparision;

import java.util.Scanner;

public class LineComparision {
	static int x1, a1;
	static int x2, a2;
	static int y1, b1;
	static int y2, b2;

	public static void calculateLinesAreEqual() {
		System.out.println("enter the values");
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double y2 = sc.nextDouble();

		System.out.print("enter the values:");
		double a1 = sc.nextDouble();
		double a2 = sc.nextDouble();
		double b1 = sc.nextDouble();
		double b2 = sc.nextDouble();
		double line1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		String x = Double.toString(line1);
		double line2 = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));
		String y = Double.toString(line2);
		System.out.println("length is:" + line1);
		System.out.println("length is:" + line2);
		System.out.println(x.equals(y));
		int comp = x.compareTo(y);

		if (comp == 0) {
			System.out.println("lines are equal");
		} else if (line1 > line2) {
			System.out.println("Line1 is greater");
		} else {

			System.out.println("Line2 is lesser than Line1");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");

		calculateLinesAreEqual();

	}

}