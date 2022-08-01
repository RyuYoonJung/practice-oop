package oop;

public class Card {
	String kind;
	int number;
	
	static int height = 10; 
	static int width = 50;

	int[] arr = new int[3];
	
	
	public static void main(String[] args) {
		MyMath math = new MyMath();
		math.divide(width, height);
		
		Document document = new Document();
		System.out.println(document.name);
		
	}
}
