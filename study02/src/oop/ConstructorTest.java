package oop;

public class ConstructorTest {
	Data1 data1 = new Data1();
	Data2 data2 = new Data2();
}

class Data1{
	int x;
	int y;
	void doorIs() {
		x = 5;
	}
	void dor() {
		y= 1;
		doorIs();
	}
	
}

class Data2{
	public static void main(String[] args) {
		Data1 data2 = new Data1();
		
	}
	
  	void aa() {
		Data1 data1 = new Data1();
		data1.x = 1;
		System.out.println("----");
		System.out.println(data1.x);
	}
	
	
	
	
}