package test;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		System.out.println("Start");
		
		try {
			int c=10/0;
			
			System.out.println("Result is "+c);
			
		} catch (ArithmeticException e) {

			System.out.println("Something was wrong "+e.getMessage());
		}
		System.out.println("End");
	}
}
