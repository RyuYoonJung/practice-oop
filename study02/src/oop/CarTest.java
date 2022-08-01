package oop;

public class CarTest {
	String color = "";
	public static void main(String[] args) {
		Car car = new Car();
		new CarTest().changeVal(car);
//		System.out.println(car.color);
//		System.out.println(car.gear);
//		System.out.println(car.speed);
//		Car car2 = new Car("yellow");
//		System.out.println(car2.color);
//		System.out.println(car2.gear);
//		System.out.println(car2.speed);
		
	}
	void changeVal(Car c) {
		c.color = "yellow";
		c.gear = 1000;
		c.speed = 7000;
		color = "ss";
		System.out.println(color);
//		System.out.println(car.gear);
//		System.out.println(car.speed);
		}
}

class Car {
	int gear;
	int speed;
	String color;
	
	Car() {
		this(100, 2000, "white");
	}

	Car(String color) {
		this(100, 2000, color);
	}
	
	

	public Car(int gear, int speed, String color) {
		this.gear = gear;
		this.speed = speed;
		this.color = color;
	}
}
