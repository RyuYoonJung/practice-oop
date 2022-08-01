package oop;

public class PrimitiveParamEx2 {
	public static void main(String[] args) {
		int[] arr = new int[1];
		arr[0] = 100;
		System.out.println(arr[0]);
		change(arr);
		System.out.println(arr[0]);
		
		
	}
	
	static void change(int[] arr) {
		arr[0] = 1000;
		System.out.println("change() : x = " + arr[0]);
	}
}


