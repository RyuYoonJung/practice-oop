package oop;

public class OverLoadingTest {
	public static void main(String[] args) {
		MyMath3 math3 = new MyMath3();
		
		int[] a = new int[]{10, 20, 30};
		System.out.println(math3.add(a));
	}
}


class MyMath3 {
	int add(int a, int b) {
		System.out.println("int add(int a, int b) - ");
		return a + b ;
	}
	long add(int a, long b) {
		System.out.println("int add(int a, long b) - ");
		return a + b ;
	}
	long add(long a, int b) {
		System.out.println("int add(long a, int b) - ");
		return a + b ;
	}
	long add(long a, long b) {
		System.out.println("int add(long a, long b) - ");
		return a + b ;
	}
	int add(int[] a) {
		System.out.println("int add(int a[]) - ");
		int result = 0;
		
		for(int i = 0; i < a.length; i++) {
			result += a[i];
		}
		return  result;
	}
}
