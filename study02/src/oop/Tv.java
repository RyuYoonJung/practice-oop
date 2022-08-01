package oop;

public class Tv {
	static String color;
	static boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
}
