package oop;

public class CardTest {
	public static void main(String[] args) {
		System.out.println(Card.width);
		System.out.println(Card.height);

		Card c1 = new Card();
		c1.kind = "heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + " ," + c1.number + "이며, 크기는 " + "(" + c1.height + " , " + c1.width + ")");
		System.out.println("c2은 " + c2.kind + " ," + c2.number + "이며, 크기는 " + "(" + c2.height + " , " + c2.width + ")");		
		
		Card.width = 50;
		Card.height = 80;
		
		System.out.println("c1은 " + c1.kind + " ," + c1.number + "이며, 크기는 " + "(" + c1.height + " , " + c1.width + ")");
		System.out.println("c2은 " + c2.kind + " ," + c2.number + "이며, 크기는 " + "(" + c2.height + " , " + c2.width + ")");		
		
	}
}
