package oop;

public class CallStackTest2 {
	public static void main(String[] args) {
		firstMethod();
		System.out.println("main method 가 끝남");
	}
	
	static void firstMethod() {
		System.out.println("first method 의 시작");
		secondMethod();
		System.out.println("first method 가 끝남");
	}
	
	static void secondMethod() {
		System.out.println("second method 의 시작");
		System.out.println("second Method 가 끝남");
	}
	
}
