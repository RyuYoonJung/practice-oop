package oop;

public class TvTest4 {
	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3];
		
//		tvArr[0] = new Tv();
		tvArr[0] = new Tv();
		tvArr[1] = new Tv();
		tvArr[2] = new Tv();
		tvArr[0].channel = 10;
		tvArr[1].channel = 10;
		tvArr[2].channel = 10;
		
		System.out.println(tvArr[0].channel);
		
		tvArr[0].channelDown();
		System.out.println(tvArr[0].channel);
		
	}
}
