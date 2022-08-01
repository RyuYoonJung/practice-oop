package rererere;

public class Rectangle2 {
	Point p1;
	Point p2;
	
	public Rectangle2(int x1, int y1, int x2, int y2) {
		p1 = new Point(x1, y1);
		p2 = new Point(x2, y2);
	}
	
	// 너비
	int getWidth() {
		return abs(p1.x - p2.x);
	}

	// 높이
	int getHeight() {
		return abs(p1.y - p2.y);
	}
	
	// 둘레
	int getRound() {
		return (getHeight() + getWidth())*2 ;
	}
	
	// 넓이
	int getArea() {
		return getHeight() * getWidth();
	}
	
	// 절대값
	int abs(int x) {
		return x < 0 ? -x : x;
	}
	
	// display
	void display() {
		System.out.println("높이 :: " + getHeight());
		System.out.println("너비 :: " + getWidth());
		System.out.println("둘레 :: " + getRound());
		System.out.println("넓이 :: " + getArea());
		System.out.println();
	}

	@Override
	public String toString() {
		return "높이 :: " + getHeight() + " 너비 :: " + getWidth() + " 둘레 :: " + getRound() + " 넓이 :: " + getArea();
	}
	
}