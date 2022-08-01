package oop;

public class TvTest3 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		t2 = t1; // t2가 가지고 있던 주소값은 잃어버리게 되고 t1에 저장되어 있던 주소값이 t2 에 저장되게 된다 
		
		
		t2.channel  = 56;
		System.out.println(t2.channel);
		
		t2.channel = 55;
		System.out.println(t1.channel);
	}
}
