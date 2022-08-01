package oop;

class MyMath2 {
	long a;
	long b;
	
	long add() {
		return a+b;
	}
	
	long subtract() {
		return a-b;
	}
	
	long multiply() {
		return a*b;
	}
	
	double divide() {
		return a/b;
	}
	
	static long add(long a , long b) {
		return a+b;
	}
	
	static long subtract(long a, long b) {
		return a-b;
	}
	
	static long multiply (long a, long b) {
		return a*b;
	}
	
	static double divide (double  a, double  b) {
		return a/b;
	}
}

public class MyMathTest2 {
	public static void main(String[] args) {
		System.out.println(MyMath2.add(3, 5));
		System.out.println(MyMath2.divide(10, 5));
		System.out.println(MyMath2.multiply(2, 9));
		System.out.println(MyMath2.subtract(52, 12));
		
		MyMath2 math2 = new MyMath2();
		math2.a = 30;
		math2.b = 50;
		
		System.out.println(math2.add());
		System.out.println(math2.divide());
		System.out.println(math2.multiply());
		System.out.println(math2.subtract());
		
	}
}
