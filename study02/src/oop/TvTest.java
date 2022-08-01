package oop;

public class TvTest {
	public static void main(String[] args) {
		Tv t = new Tv();
		
		t.channel = 7;
		System.out.println(t.channel);
		t.channelDown();
		System.out.println(t.channel);
		t.channelUp();
		System.out.println(t.channel);
	}
}
