package oop;

public class ReturnTest {
	public static void main(String[] args) {
		ReturnTest returnTest = new ReturnTest();
		int[] result = {0};
		System.out.println(result[0]);
		returnTest.add(3, 5, result);
		System.out.println(returnTest.add(7, 3));
	}
	
	int add(int a, int b) {
		return a + b;
	}
	
	void add(int a, int b, int[] result) {
		System.out.println(result[0] = a + b);
	}
	
}
