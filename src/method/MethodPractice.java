package method;

import java.util.ArrayList;

public class MethodPractice {

	public static void main(String[] args) {

		System.out.println("Ex-1 " + getName("Rehman"));
		System.out.println("Ex-2 " + getEvenNumberList(10));
		System.out.println("Ex-3 " + getOddNumberList(10));

	}

	/**
	 * Exercise-3 Write a method that take a number input and return the list of all
	 * odd number from 0 to that given number.
	 * 
	 * parameter:int number 
	 * returnType: ArrayList<Integer> 
	 * servingBucket: List
	 */
	public static ArrayList<Integer> getOddNumberList(int number) {
		ArrayList<Integer> oddNumberList = new ArrayList<Integer>();

		for (int i = 1; i <= number; i++) {
			if (i % 2 == 1) {
				oddNumberList.add(i);
			}
		}
		return oddNumberList;
	}

	/**
	 * Exercise-2 Write a method that take a number input and return the list of all
	 * even number from 0 to that given number.
	 * 
	 * parameter:int number 
	 * returnType: ArrayList<Integer> 
	 * servingBucket: List
	 */
	public static ArrayList<Integer> getEvenNumberList(int number) {
		ArrayList<Integer> evenNumberList = new ArrayList<Integer>();

		for (int i = 0; i <= number; i++) {
			if (i % 2 == 0) {
				evenNumberList.add(i);
			}
		}

		return evenNumberList;
	}

	/**
	 * Exercise-1 Write a method that take your name input and return name.
	 * 
	 * parameter: String text 
	 * returnType: String 
	 * servingBucket: Variable
	 */
	public static String getName(String text) {
		String name = null;

		name = text;

		return name;
	}

}
