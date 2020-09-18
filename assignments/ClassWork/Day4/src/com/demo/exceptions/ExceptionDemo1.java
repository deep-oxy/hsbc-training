package com.demo.exceptions;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		System.out.println("Start of program");
		try {
			int a = 10;
			int b = 10;
			double d = a / b;
			int arr[] = { 1, 2, 3, 4 };
			System.out.println(arr[2]);
			String[] names = new String[5];
			// names[2].length();
			// throw new RuntimeException();
			System.out.println("No exception in try block..");
		} catch (ArithmeticException e) {
			// e.printStackTrace();
			System.out.println(e);
			// System.out.println(e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (NullPointerException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("this is finally block");
		}
		System.out.println("End of program");

	}

}
