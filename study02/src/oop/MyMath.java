package oop;

public class MyMath {
	public static void main(String[] args) {
		int x;
		int y;
		
		MyMathTest mathTest = new MyMathTest();
//		System.out.println(mathTest.abs(-2));
		
//		plus(3, 5);
//		minus(5, 3);
//		multiply(7, 5);
		System.out.println(divide(15, 0));
		
	}
	
	static void plus(int x, int y) {
		System.out.println(x-y); 
	}
	static void minus(int x, int y) {
		System.out.println(x-y); 
	}
	static void multiply(int x, int y) {
		System.out.println(x*y); 
	}
	static int divide(int x, int y) {
		if(y == 0) {
			System.out.println("0으로 나눌 수 없음");
			 return 0;
		}
		System.out.println(x/y);
		return x /y;
	}

	static int add(int x, int y) {
		return x+y; 
	}
	static int minus(int x, int y, int a) {
		return x-y; 
	}
	static int multiply(int x, int y, int a) {
		return x*y; 
	}
	static int divide(int x, int y, int a) {
		return x/y; 
	}

}
