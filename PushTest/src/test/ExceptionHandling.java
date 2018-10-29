package test;

import java.util.InputMismatchException;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		System.out.println("Start");
		
		try {
			int c=0/1;
			
			System.out.println("Result is "+c);
			
		} catch (ArithmeticException e) {

			System.out.println("Something was wrong "+e.getMessage());
			
		} catch (InputMismatchException e) {
			
			System.out.println("Somewas wrong "+e.getMessage());
			
		}
		
		System.out.println("End");
	}
}
