package oop;

public class StaticBlockTest {
	static int[] arr = new int[10];
	
	static {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
