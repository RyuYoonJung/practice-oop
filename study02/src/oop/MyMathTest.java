package oop;

public class MyMathTest {
	public static void main(String[] args) {
		MyMath math = new MyMath();
		MyMathTest mathTest = new MyMathTest();
//		long result1 = math.plus(5, 3);
//		System.out.println(result1);
		
//		System.out.println(mathTest.returnBig(10, 5));
		System.out.println(returnBig(10, 5));
		
		int result = diff(3, 9);
//		System.out.println(result);
		System.out.println(diff(3, 9));
		
	}
	
	static int returnBig(int x, int y) {
		int result = x > y ? x : y;
		return result;
	}
	
	static int diff(int x, int y) {
		return abs(x-y);
	}
	
	static int abs(int x) {
		return x < 0 ? -x : x;
	}
}

