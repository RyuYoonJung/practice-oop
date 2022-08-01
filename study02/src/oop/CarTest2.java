package oop;

public class CarTest2 {
	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(c1.color);
		System.out.println(c1.gear);
		System.out.println(c1.speed);

		Car c2 = new Car("blue");
		
		System.out.println(c2.color);
		System.out.println(c2.gear);
		System.out.println(c2.speed);
		
		
	}
	
	
}


