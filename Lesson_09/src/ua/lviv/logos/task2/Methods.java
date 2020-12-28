package ua.lviv.logos.task2;

public class Methods {

	public static void augment(double a, double b) throws MyException, Exception {
		if (a<0 && b<0) {
			throw new IllegalAccessException();
		}else if(a==0 && b!=0 || a!=0 && b==0) {
			throw new ArithmeticException();
		}else if(a==0 && b==0) {
			throw new IllegalAccessException();
		}else if (a>0 && b>0) {
			throw new MyException();
		}else {
			System.out.println(a+b);
		}
		
	}
	
	public static void substraction(double a, double b) throws MyException, Exception {
		if (a<0 && b<0) {
			throw new IllegalAccessException();
		}else if(a==0 && b!=0 || a!=0 && b==0) {
			throw new ArithmeticException();
		}else if(a==0 && b==0) {
			throw new IllegalAccessException();
		}else if (a>0 && b>0) {
			throw new MyException();
		}else {
			System.out.println(a-b);
		}
		
	}
	
	public static void multiplication(double a, double b) throws MyException, Exception {
		if (a<0 && b<0) {
			throw new IllegalAccessException();
		}else if(a==0 && b!=0 || a!=0 && b==0) {
			throw new ArithmeticException();
		}else if(a==0 && b==0) {
			throw new IllegalAccessException();
		}else if (a>0 && b>0) {
			throw new MyException();
		}else {
			System.out.println(a*b);
		}
		
	}
	
	public static void division(double a, double b) throws MyException, Exception {
		if (a<0 && b<0) {
			throw new IllegalAccessException();
		}else if(a==0 && b!=0 || a!=0 && b==0) {
			throw new ArithmeticException();
		}else if(a==0 && b==0) {
			throw new IllegalAccessException();
		}else if (a>0 && b>0) {
			throw new MyException();
		}else {
			System.out.println(a/b);
		}
		
	}
}
